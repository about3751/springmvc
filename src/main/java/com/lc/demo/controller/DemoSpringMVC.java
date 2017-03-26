package com.lc.demo.controller;

import com.lc.demo.entities.Book;
import com.lc.demo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by leich on 2017/3/26.
 */
@Controller
@RequestMapping("/main")
public class DemoSpringMVC {
    static
    {

    }
    static {
        System.out.print("Github Update");
    }

    @Autowired
    @Qualifier(value = "bookService")
    private BookService bookService;

    @RequestMapping("/test")
    public String test() {
        System.out.print(" Test Success");
        return "main";
    }

    @RequestMapping(value = "/book" , method = RequestMethod.POST)
    public String addNewBook(Book book)
    {
        book.setAddTime(new Date());
        bookService.addNewBook(book);
        return "redirect:/main/getBooks";
    }

    /**
     * 使用SpringFrom表单时候，需要Request域里面有一个对应的Bean
     * @param bookMap
     * @return
     */
    @RequestMapping(value = "/book" , method = RequestMethod.GET)
    public String input(Map<String,Book> bookMap)
    {
        bookMap.put("book",new Book());
        return "addBook";
    }

    @RequestMapping(value = "/getBooks", method = RequestMethod.GET)
    public String getAllBooks(Map<String, List<Book>> bookMap) {
        bookMap.put("books", bookService.queryAll());
        return "bookLists";
    }

    @ModelAttribute
    public void getBookById(@RequestParam(value = "id",required = false) Integer id, Map<String,Object> book)
    {
        System.out.print("   @ModelAttribute  id  is Null ?" + (id == null ? true : false));
        if(id != null)
        {
            Book temp = null;
            book.put("book",temp = bookService.queryById(id));
            System.out.print("  查询到了 : ----> " + temp.getId() + "  bookName " + temp.getBookName());
        }
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
    public String modifyBookInfo(@PathVariable("id") Integer id,Map<String,Book> bookMap)
    {
        bookMap.put("book",bookService.queryById(id));
        return "modifyEdit";
    }

    /**
     * 修改的时候 SpringFrom表单的Action要用绝对路径 巨坑！！
     * @param book
     * @return
     */
    @RequestMapping(value = "/book" , method = RequestMethod.PUT)
    public String update(@ModelAttribute("book") Book book)
    {
        System.out.print("  查询到了 : ----> " + book.getId() + "  bookName " + book.getBookName());
        bookService.modifyBook(book);
        return "redirect:/main/getBooks";
    }

    @RequestMapping(value = "/book/{id}" , method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Integer id)
    {
        bookService.removeBookById(id);
        return "redirect:/main/getBooks";
    }


}
