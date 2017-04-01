package com.lc.demo.controller;

import com.lc.demo.entities.Book;
import com.lc.demo.entities.Relationship;
import com.lc.demo.entities.jsonentities.JSONData;
import com.lc.demo.services.BookService;
import jdk.nashorn.internal.parser.JSONParser;
import org.codehaus.jackson.map.util.JSONPObject;
import org.codehaus.jackson.map.util.JSONWrappedObject;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by leich on 2017/3/26.
 */
@Controller
@RequestMapping("/main")
public class DemoSpringMVC {
    static {

    }

    static {
        System.out.print("Github Update");
    }

    @Autowired
    private BookService bookService;


    /**
     * HTTP 状态码错误
     *
     * @return
     */
    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "URL路径错误")
    public String testHttpStatus() {
        return "exception";
    }


    /**
     * 针对当前Handler的Exception处理
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(value = {Exception.class})
    public ModelAndView testException(Exception ex) {
        ModelAndView modelAndView = new ModelAndView("exception");
        modelAndView.addObject("ex", ex);
        return modelAndView;
    }

    @RequestMapping("/test")
    public String test() {
        System.out.print(" Test Success");
        return "main";
    }

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public String addNewBook(Book book) {
        book.setAddTime(new Date());
        bookService.addNewBook(book);
        return "redirect:/main/getBooks";
    }

    /**
     * 使用SpringFrom表单时候，需要Request域里面有一个对应的Bean
     *
     * @param bookMap
     * @return
     */
    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public String input(Map<String, Book> bookMap) {
        bookMap.put("book", new Book());
        return "addBook";
    }

    @RequestMapping(value = "/getBooks", method = RequestMethod.GET)
    public String getAllBooks(Map<String, List<Book>> bookMap) {
        bookMap.put("books", bookService.queryAll());
        return "bookLists";
    }

    @ModelAttribute
    public void getBookById(@RequestParam(value = "id", required = false) Integer id, Map<String, Object> book) {
        System.out.print("   @ModelAttribute  id  is Null ?" + (id == null ? true : false));
        if (id != null) {
            Book temp = null;
            book.put("book", temp = bookService.queryById(id));
            System.out.print("  查询到了 : ----> " + temp.getId() + "  bookName " + temp.getBookName());
        }
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
    public String modifyBookInfo(@PathVariable("id") Integer id, Map<String, Book> bookMap) {
        bookMap.put("book", bookService.queryById(id));
        return "modifyEdit";
    }

    /**
     * 修改的时候 SpringFrom表单的Action要用绝对路径 巨坑！！
     *
     * @param book
     * @return
     */
    @RequestMapping(value = "/book", method = RequestMethod.PUT)
    public String update(@ModelAttribute("book") Book book) {
        System.out.print("  查询到了 : ----> " + book.getId() + "  bookName " + book.getBookName());
        bookService.modifyBook(book);
        return "redirect:/main/getBooks";
    }

    @RequestMapping(value = "/book", method = RequestMethod.DELETE)
    public String delete(@RequestParam("id") List<Integer> id) {
        bookService.removeBatch(id);
        return "redirect:/main/getBooks";
    }


    @RequestMapping(value = "/getRelationships", method = RequestMethod.GET)
    public String getRelationships(Map<String, List<Relationship>> map) {
        //map.put("relationships", relationshipMapper.selectRelationshipAll());
        return "relationships";
    }

    @RequestMapping(value = "/getJSON", method = RequestMethod.GET)
    @ResponseBody
    public Map getJSON() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "三年二班");
        map.put("schoolName", "西京学院");
        List<Map<String, Object>> student = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < 10; i++) {
            Map<String, Object> student1 = new HashMap<String, Object>();
            student1.put("studentName", "学生姓名" + i);
            student1.put("age", "年龄");
            student.add(student1);
        }

        map.put("banji", student);
        return map;
    }


    @RequestMapping("/testAjax")
    @ResponseBody
    public Map<String,String> testAjax(HttpServletResponse response, @RequestBody Map<String,List<Map<String,String>>> data) throws IOException {

        for(Map.Entry m : data.entrySet())
        {
            System.out.println(m.getKey() + " ---> " + m.getValue());
        }

        Map<String,String> map = new HashMap<>();
        map.put("resultCode","200");

        return map;

        // 当返回值为Void时 使用PrintWriter来返回数据
//        PrintWriter printWriter = response.getWriter();
//        printWriter.write("{\"resultCode\":\"200\"}");
//        printWriter.close();
//        printWriter.flush();
    }


}
