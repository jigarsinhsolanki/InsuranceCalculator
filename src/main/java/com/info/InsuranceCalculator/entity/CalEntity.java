package com.info.InsuranceCalculator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Calculator")

public class CalEntity {
        @Id
        @GeneratedValue
        private int id;
        private double loanAmount;
        private double termInYears;
        private double interestRate;

        @Transient
        private double calTotal;
        @Transient
        private List<CalEntity> calEntityList;


    }
