package com.lc.demo.dao;

import com.lc.demo.entities.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);

    List<Person> selectPersons();
}