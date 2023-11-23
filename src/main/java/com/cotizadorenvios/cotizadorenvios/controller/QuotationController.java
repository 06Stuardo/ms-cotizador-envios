package com.cotizadorenvios.cotizadorenvios.controller;

import com.cotizadorenvios.cotizadorenvios.model.Customer;
import com.cotizadorenvios.cotizadorenvios.model.Quotation;
import com.cotizadorenvios.cotizadorenvios.model.ServiceResponse;
import com.cotizadorenvios.cotizadorenvios.service.IQuotationService;
import com.cotizadorenvios.cotizadorenvios.utilities.CalculateAmounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/ce/qtn")
@CrossOrigin("*")
public class QuotationController {

    @Autowired
    private IQuotationService iQuotationService;

    @PostMapping("/grandTotalQTN")
    public ResponseEntity<ServiceResponse> grandTotalQTN(@RequestBody Quotation qtn){
        ServiceResponse serviseResponse =  new  ServiceResponse();

        CalculateAmounts calculateAmount = new CalculateAmounts();

        qtn = calculateAmount.calculateGrandTotalQTN(qtn);

        int result = iQuotationService.insertQTN(qtn);

        if(result == 1){
            serviseResponse.setMessage("Quotation saved with succes");
            serviseResponse.setSucces(false);
        }else{
            serviseResponse.setMessage("Quotation no saved with succes");
            serviseResponse.setSucces(true);
        }

        serviseResponse.setGrand_total_qtn(qtn);

        return new ResponseEntity<>(serviseResponse, HttpStatus.OK);
    }
}
