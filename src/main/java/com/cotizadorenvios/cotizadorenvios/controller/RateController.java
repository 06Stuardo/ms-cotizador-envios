package com.cotizadorenvios.cotizadorenvios.controller;

import com.cotizadorenvios.cotizadorenvios.model.Rate;
import com.cotizadorenvios.cotizadorenvios.service.IRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/ce/rate")
@CrossOrigin("*")
public class RateController {

    @Autowired
    private IRateService iRateService;

    @GetMapping("/listRates")
    public ResponseEntity<List<Rate>> listRates(){
        var result=  iRateService.allRates();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
