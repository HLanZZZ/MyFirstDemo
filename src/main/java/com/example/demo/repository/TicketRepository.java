package com.example.demo.repository;

import com.example.demo.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TicketRepository extends JpaRepository<Ticket,Integer> {


    @Query(value = "select * from test.ticket t where ssr_ref =?1 and  ticket_status =?2 and booking_id = ?3",nativeQuery = true)
    List<Ticket>  findBySsrRefAndTicketStatusAndBookingId(Integer ssrRef, String ticketStatus,Integer bookingId);
}
