package com.example.demo.service;


import com.example.demo.entity.ServiceLine;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceLineService {

    List<ServiceLine> findServiceByBookingId(Integer bookingId);

}
