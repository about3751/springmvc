package com.lc.demo.services;

import com.lc.demo.dao.CustomerMapper;
import com.lc.demo.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by leich on 2017/3/28.
 */
@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    public Customer queryCustomerByName(String name) {
        return customerMapper.selectCustomerByName(name);
    }
}
