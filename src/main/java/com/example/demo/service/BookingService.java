package com.example.demo.service;


import com.example.demo.entity.Booking;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookingService {

   public List<Booking> getAllBookings();


   public List<Booking> findBookingByBookingRef(String bookingRef);


}
