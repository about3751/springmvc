package com.lc.demo.services;

import com.lc.demo.entities.Book;

import java.util.List;

/**
 * Created by leich on 2017/3/26.
 */
public interface BookService {

    List<Book> queryAll();

    List<Book> queryByBookName(String bookName);

    Book queryById(Integer id);

    void modifyBook(Book book);

    int addNewBook(Book book);

    void removeBookById(Integer id);

    void removeBatch(List<Integer> id);


}
