package com.example.demo.service.impl;


import com.example.demo.entity.Segment;
import com.example.demo.repository.SegmentRepository;
import com.example.demo.service.SegmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SegmentServiceImpl implements SegmentService {

    @Autowired
    private SegmentRepository segmentPepository;


    @Override
    public List<Segment> findByBookingId(Integer bookingId) {

        List<Segment> segmentList = segmentPepository.findByBookingId(bookingId);
        return segmentList;
    }

    @Override
    public Segment findSegmentByBookingIdAndSegmentRef(Integer id, Integer passengerRef) {

        Segment segment = segmentPepository.findByBookingIdAndSegmentRef(id,passengerRef);

        return segment;
    }
}
