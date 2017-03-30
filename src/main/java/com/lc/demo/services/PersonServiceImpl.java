package com.lc.demo.services;

import com.lc.demo.dao.PersonMapper;
import com.lc.demo.entities.Person;
import com.lc.demo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by leich on 2017/3/28.
 */
@Service(value = "personService")
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    public List<Person> selectPersons() {
        return personMapper.selectPersons();
    }
}
