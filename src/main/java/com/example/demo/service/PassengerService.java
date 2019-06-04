package com.example.demo.service;

import com.example.demo.entity.Passenger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PassengerService {

     List<Passenger> findPassengerByBookingId(Integer bookingId);


     Passenger findPassengerInfoByPassengerRef(Integer id , Integer passengerRef);

}
