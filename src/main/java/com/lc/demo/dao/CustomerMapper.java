package com.lc.demo.dao;

import com.lc.demo.entities.Customer;
import org.springframework.stereotype.Repository;

/**
 * Created by leich on 2017/3/28.
 */
@Repository
public interface CustomerMapper {

    Customer selectCustomerByName(String name);

}
