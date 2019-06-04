package com.example.demo.repository;

import com.example.demo.entity.Booking;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookingRepository extends JpaRepository<Booking,Integer> {

//    @Query(value = "select booking_id from booking where booking_ref =?",nativeQuery = true)

      @Query(value = "select   *  from test.booking  where  booking_ref = ? order by booking_date asc",nativeQuery = true)
      List<Booking> findBookingByBookingRef(String bookingRef);


      @Override
      <S extends Booking> boolean exists(Example<S> example);
}
