package com.example.demo.repository;

import com.example.demo.entity.FormOfPayment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FOPRepository extends JpaRepository<FormOfPayment,Integer> {

}
