package com.example.demo.repository;

import com.example.demo.entity.ServiceLine;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceLineRepository extends JpaRepository<ServiceLine,Integer> {

    List<ServiceLine> findByBookingId(Integer bookingId);


}
