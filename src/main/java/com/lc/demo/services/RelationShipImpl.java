package com.lc.demo.services;

import com.lc.demo.dao.RelationshipMapper;
import com.lc.demo.entities.Relationship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by leich on 2017/3/27.
 */
@Service(value = "relationShipService")
public class RelationShipImpl implements RelationShipService {

    @Autowired
    private RelationshipMapper relationshipMapper;

    public List<Relationship> getAll() {
        return relationshipMapper.selectRelationshipAll();
    }
}
