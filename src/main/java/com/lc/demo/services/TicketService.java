package com.lc.demo.services;

import com.lc.demo.entities.Ticket;

import java.util.List;

/**
 * Created by leich on 2017/3/28.
 */
public interface TicketService {

    List<Ticket> queryAllTikets();

}
