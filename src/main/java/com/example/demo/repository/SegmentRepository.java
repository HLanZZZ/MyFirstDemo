package com.example.demo.repository;

import com.example.demo.entity.Segment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SegmentRepository extends JpaRepository<Segment,Integer> {

    List<Segment> findByBookingId(Integer id);

    @Query(value = "select  * from segment s where booking_id =?1 and segment_ref=?2",nativeQuery = true)
    Segment findByBookingIdAndSegmentRef(Integer  bookingId  ,Integer passengerRef);

}
