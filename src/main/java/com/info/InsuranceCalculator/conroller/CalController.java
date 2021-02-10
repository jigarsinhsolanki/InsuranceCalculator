package com.info.InsuranceCalculator.conroller;

import com.info.InsuranceCalculator.entity.CalEntity;
import com.info.InsuranceCalculator.service.CalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalController {

    @Autowired
    private CalService calService;

    @PostMapping("/addData")
    public CalEntity addData(@RequestBody CalEntity calEntity){

        return calService.saveData(calEntity);
    }

    @GetMapping("/getData/{id}")
    public CalEntity getData(@PathVariable int id){

        return calService.getData(id);
    }


}
