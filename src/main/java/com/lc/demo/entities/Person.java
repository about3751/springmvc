package com.lc.demo.entities;

import java.util.List;

public class Person {
    private Integer id;

    private String personName;

    private String personPwd;

    private Car car;

    private List<Relationship> relationShips;

    public Person(Integer id, String personName, String personPwd, Car car) {
        this.id = id;
        this.personName = personName;
        this.personPwd = personPwd;
        this.car = car;
    }

    public Person() {
        super();
    }

    public List<Relationship> getRelationShips() {
        return relationShips;
    }

    public void setRelationShips(List<Relationship> relationShips) {
        this.relationShips = relationShips;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    public String getPersonPwd() {
        return personPwd;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setPersonPwd(String personPwd) {

        this.personPwd = personPwd == null ? null : personPwd.trim();
    }
}