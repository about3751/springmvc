package com.lc.demo.entities;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class Book {
    private Integer id;

    private String bookName;

    private List<Relationship> relationShips;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date addTime;

    public Book(Integer id, String bookName, Date addTime) {
        this.id = id;
        this.bookName = bookName;
        this.addTime = addTime;
    }

    public List<Relationship> getRelationShips() {
        return relationShips;
    }

    public void setRelationShips(List<Relationship> relationShips) {
        this.relationShips = relationShips;
    }

    public Book() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}