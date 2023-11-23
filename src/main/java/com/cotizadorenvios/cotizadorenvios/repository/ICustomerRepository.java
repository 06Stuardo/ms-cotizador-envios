package com.cotizadorenvios.cotizadorenvios.repository;

import com.cotizadorenvios.cotizadorenvios.model.Customer;
import java.util.*;


public interface ICustomerRepository {

    public List<Customer> findCustomer(int id);
    public int insertCustomer(Customer customer);
}
