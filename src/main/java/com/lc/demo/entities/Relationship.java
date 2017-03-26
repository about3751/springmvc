package com.lc.demo.entities;

public class Relationship {
    private Integer id;

    private Integer personId;

    private Integer bookId;

    public Relationship(Integer id, Integer personId, Integer bookId) {
        this.id = id;
        this.personId = personId;
        this.bookId = bookId;
    }

    public Relationship() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
}