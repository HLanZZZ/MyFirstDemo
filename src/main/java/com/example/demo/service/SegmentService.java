package com.example.demo.service;

import com.example.demo.entity.Segment;
import com.example.demo.model.SegmentInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SegmentService {

    List<Segment> findByBookingId(Integer bookingId);

    Segment findSegmentByBookingIdAndSegmentRef(Integer id, Integer passengerRef);

}
