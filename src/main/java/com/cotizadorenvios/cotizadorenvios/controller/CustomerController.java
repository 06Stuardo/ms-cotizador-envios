package com.cotizadorenvios.cotizadorenvios.controller;

import com.cotizadorenvios.cotizadorenvios.model.Customer;
import com.cotizadorenvios.cotizadorenvios.model.ServiceResponse;
import com.cotizadorenvios.cotizadorenvios.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/ce/customer")
@CrossOrigin("*")
public class CustomerController {

    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping("/list/{customer_id}")
    public ResponseEntity<List<Customer>> list(@PathVariable int customer_id){
        var result=  iCustomerService.findCustomer(customer_id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping(value = "/insert")
    public  ResponseEntity<ServiceResponse> insert(@RequestBody Customer customer){
        ServiceResponse serviseResponse =  new  ServiceResponse();
        int result = iCustomerService.insertCustomer(customer);

        if(result == 1){
            serviseResponse.setMessage("Customer saved with succes");
            serviseResponse.setSucces(true);
        }

        return new ResponseEntity<>(serviseResponse, HttpStatus.OK);
    }



}
