package com.lc.demo.services;

import com.lc.demo.dao.BookMapper;
import com.lc.demo.entities.Book;
import com.lc.demo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by leich on 2017/3/26.
 */
@Service(value = "bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    public List<Book> queryAll() {
        return bookMapper.selectAll();
    }

    public List<Book> queryByBookName(String bookName) {
        return null;
    }

    public Book queryById(Integer id) {
        return bookMapper.selectByPrimaryKey(id);
    }

    public void modifyBook(Book book) {
        bookMapper.updateByPrimaryKeySelective(book);
    }

    public int addNewBook(Book book) {
        return bookMapper.insertNewBook(book);
    }

    public void removeBookById(Integer id) {
        bookMapper.deleteByPrimaryKey(id);
    }

    public void removeBatch(List<Integer> id) {
        bookMapper.deleteBatch(id);
    }
}
