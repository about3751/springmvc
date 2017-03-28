package com.lc.demo.entities;

/**
 * Created by leich on 2017/3/28.
 */
public class Ticket {

    private Integer id;

    private String address;

    private Integer price;

    private Customer customerId;

    public Ticket(){}

    public Ticket(Integer id, String address, Integer price, Customer customerId) {
        this.id = id;
        this.address = address;
        this.price = price;
        this.customerId = customerId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }
}


