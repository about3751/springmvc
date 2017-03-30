package com.lc.demo.entities;

import java.util.List;

/**
 * Created by leich on 2017/3/28.
 */
public class Customer {

    private Integer id;

    private String customerName;

    private Integer customerTel;

    private List<Ticket> tickets;

    public Customer() {
    }

    public Customer(Integer id, String customerName, Integer customerTel, List<Ticket> tickets) {
        this.id = id;
        this.customerName = customerName;
        this.customerTel = customerTel;
        this.tickets = tickets;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(Integer customerTel) {
        this.customerTel = customerTel;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
}
