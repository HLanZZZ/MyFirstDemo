package com.example.demo.repository;

import com.example.demo.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Integer> {


    @Query(value = "select * from passenger p where booking_id =?1 and passenger_ref=?2",nativeQuery = true)
    Passenger findFamilyNameAndGivenNameByBookingIdAndPassengerRef(Integer bookingId , Integer passengerRef);

//    @Query(value = "select family_name,given_name ",nativeQuery = true);

    List<Passenger>  findByBookingId(Integer id);




}
