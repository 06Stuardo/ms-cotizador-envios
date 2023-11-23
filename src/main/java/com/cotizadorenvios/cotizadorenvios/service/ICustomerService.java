package com.cotizadorenvios.cotizadorenvios.service;

import com.cotizadorenvios.cotizadorenvios.model.Customer;

import java.util.List;

public interface ICustomerService {

    public List<Customer> findCustomer(int id);
    public int insertCustomer(Customer customer);
}
