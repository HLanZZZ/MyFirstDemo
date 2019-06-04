package com.example.demo.service.impl;


import com.example.demo.entity.ServiceLine;
import com.example.demo.repository.ServiceLineRepository;
import com.example.demo.service.ServiceLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLineImpl implements ServiceLineService {

    @Autowired
    private ServiceLineRepository serviceLinePepository;

    @Override
    public List<ServiceLine> findServiceByBookingId(Integer bookingId) {

        List<ServiceLine>  list = serviceLinePepository.findByBookingId(bookingId);
        return list;
    }
}
