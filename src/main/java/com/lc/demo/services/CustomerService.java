package com.lc.demo.services;

import com.lc.demo.entities.Customer;

/**
 * Created by leich on 2017/3/28.
 */
public interface CustomerService {

    Customer queryCustomerByName(String name);

}
