package com.cotizadorenvios.cotizadorenvios.service;

import com.cotizadorenvios.cotizadorenvios.model.Customer;
import com.cotizadorenvios.cotizadorenvios.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService{

    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public List<Customer> findCustomer(int id) {

        List<Customer> list;
        try{
            list = iCustomerRepository.findCustomer(id);
        }catch (Exception ex){
            throw ex;
        }

        return list;
    }
    @Override
    public int insertCustomer(Customer customer) {
        int row;

        try{
            row = iCustomerRepository.insertCustomer(customer);
        }catch ( Exception ex){
            throw  ex;
        }

        return row;
    }


}
