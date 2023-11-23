package com.cotizadorenvios.cotizadorenvios.service;

import com.cotizadorenvios.cotizadorenvios.model.Customer;
import com.cotizadorenvios.cotizadorenvios.model.Rate;
import com.cotizadorenvios.cotizadorenvios.repository.IRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RateService implements IRateService{

    @Autowired
    private IRateRepository iRateRepository;
    @Override
    public List<Rate> allRates() {
        List<Rate> list;
        try{
            list = iRateRepository.allRates();
        }catch (Exception ex){
            throw ex;
        }

        return list;

    }

}
