package com.lc.demo.entities;

import java.util.List;

/**
 * Car 一对多关系 多个Person 请看CarMapper配置
 * Created by leich on 2017/3/27.
 */
public class Car {

    private Integer id;

    private String carName;

    private String carType;

    private List<Person> personList;

    public Car() {
    }

    public Car(Integer id, String carName, String carType, List<Person> personList) {
        this.id = id;
        this.carName = carName;
        this.carType = carType;
        this.personList = personList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}
