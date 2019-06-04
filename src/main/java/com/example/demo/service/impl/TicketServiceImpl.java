package com.example.demo.service.impl;


import com.example.demo.entity.Ticket;
import com.example.demo.repository.TicketRepository;
import com.example.demo.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository ticketPepository;


    @Override
    public List<Ticket> findAirlineCodeAndDocumentNumberBySsrRefAndTicketStatus(Integer ssrRef, String ticketStatus, Integer bookingId) {


        List<Ticket>  listEmdInfo = ticketPepository.findBySsrRefAndTicketStatusAndBookingId(ssrRef,ticketStatus,bookingId);

        return listEmdInfo;
    }
}
