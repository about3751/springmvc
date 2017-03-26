package com.lc.demo.dao;

import com.lc.demo.entities.Relationship;

public interface RelationshipMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Relationship record);

    int insertSelective(Relationship record);

    Relationship selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Relationship record);

    int updateByPrimaryKey(Relationship record);
}