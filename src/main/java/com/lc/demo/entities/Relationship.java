package com.lc.demo.entities;

/**
 * Created by leich on 2017/3/27.
 */
public class Relationship {

    private Integer id;

    private Book bookId;

    private Person personId;

    public Relationship() {
    }

    public Relationship(Integer id, Book bookId, Person personId) {
        this.id = id;
        this.bookId = bookId;
        this.personId = personId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Book getBookId() {
        return bookId;
    }

    public void setBookId(Book bookId) {
        this.bookId = bookId;
    }

    public Person getPersonId() {
        return personId;
    }

    public void setPersonId(Person personId) {
        this.personId = personId;
    }
}
