package com.cotizadorenvios.cotizadorenvios.service;

import com.cotizadorenvios.cotizadorenvios.model.Customer;
import com.cotizadorenvios.cotizadorenvios.model.Quotation;
import com.cotizadorenvios.cotizadorenvios.repository.ICustomerRepository;
import com.cotizadorenvios.cotizadorenvios.repository.IQuotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuotationService implements IQuotationService{


    @Autowired
    private IQuotationRepository iQuotationRepository;


    @Override
    public int insertQTN(Quotation qtn) {

        int row;

        try{
            row = iQuotationRepository.insertQTN(qtn);
        }catch ( Exception ex){
            throw  ex;
        }

        return row;
    }
}
