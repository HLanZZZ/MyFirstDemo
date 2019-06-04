package com.example.demo.service.impl;


import com.example.demo.entity.Booking;
import com.example.demo.repository.BookingRepository;
import com.example.demo.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingPepository;

    @Override
    public List<Booking> getAllBookings() {
        return bookingPepository.findAll();
    }

    @Override
    public List<Booking> findBookingByBookingRef(String bookingRef) {

        List<Booking> booking1 = bookingPepository.findBookingByBookingRef(bookingRef);
        return booking1;
    }



}
