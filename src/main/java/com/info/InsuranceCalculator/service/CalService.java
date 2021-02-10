package com.info.InsuranceCalculator.service;

import com.info.InsuranceCalculator.entity.CalEntity;
import com.info.InsuranceCalculator.repository.CalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalService {

    @Autowired
    private CalRepo calRepo;

    public CalEntity saveData(CalEntity insCal)
    {
        return calRepo.save(insCal);
    }

    public CalEntity getData(int id) {


        CalEntity calEntity= calRepo.findAllById(id);
        double interestRate= calEntity.getInterestRate();
        interestRate /= 100.0;
        double monthlyRate = interestRate / 12.0;
        double termInYears = calEntity.getTermInYears();
        double termInMonths=termInYears * 12;
        double total=0.0;

        total = (calEntity.getLoanAmount() * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -termInMonths));

        return calEntity;
    }
}







