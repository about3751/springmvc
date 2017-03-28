package com.lc.demo.services;

import com.lc.demo.dao.TicketMapper;
import com.lc.demo.entities.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by leich on 2017/3/28.
 */
@Service(value = "ticketService")
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketMapper ticketMapper;

    public List<Ticket> queryAllTikets() {
        return ticketMapper.selectAllTickets();
    }
}
