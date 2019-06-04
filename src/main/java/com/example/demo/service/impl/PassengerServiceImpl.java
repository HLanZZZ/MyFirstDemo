package com.example.demo.service.impl;


import com.example.demo.entity.Passenger;
import com.example.demo.repository.PassengerRepository;
import com.example.demo.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PassengerServiceImpl implements PassengerService {

    @Autowired
    private PassengerRepository passengerPepository;


    @Override
    public List<Passenger> findPassengerByBookingId(Integer bookingId) {


        List<Passenger> passengerList = passengerPepository.findByBookingId(bookingId);

        return passengerList ;

    }

    @Override
    public Passenger findPassengerInfoByPassengerRef(Integer id, Integer passengerRef) {

         Passenger passenger = passengerPepository.findFamilyNameAndGivenNameByBookingIdAndPassengerRef(id,passengerRef);


        return passenger;
    }


}
