package com.lc.demo.dao;

import com.lc.demo.entities.Ticket;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by leich on 2017/3/28.
 */
@Repository
public interface TicketMapper {

    List<Ticket> selectAllTickets();

}
