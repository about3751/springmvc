package com.lc.demo.dao;

import com.lc.demo.entities.Relationship;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by leich on 2017/3/27.
 */
@Repository
public interface RelationshipMapper {

    List<Relationship> selectRelationshipAll();

}
