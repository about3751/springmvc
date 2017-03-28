package com.lc.demo.services;

import com.lc.demo.entities.Person;

import java.util.List;

/**
 * Created by leich on 2017/3/28.
 */
public interface PersonService {

    List<Person> selectPersons();

}
