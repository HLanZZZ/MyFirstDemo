package com.example.demo.repository;

import com.example.demo.entity.PdInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PdInfoRepository extends JpaRepository<PdInfo,Integer> {
}
