package com.info.InsuranceCalculator.repository;


import com.info.InsuranceCalculator.entity.CalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalRepo extends JpaRepository<CalEntity,Integer> {

    CalEntity findAllById(int id);

}
