package com.example.demo.service;



import com.example.demo.entity.Ticket;
import com.example.demo.model.EmdInfoVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TicketService {

    List<Ticket>  findAirlineCodeAndDocumentNumberBySsrRefAndTicketStatus(Integer ssrRef, String ticketStatus,Integer bookingId);
}
