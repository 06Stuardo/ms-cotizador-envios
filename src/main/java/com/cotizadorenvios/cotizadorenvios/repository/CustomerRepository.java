package com.cotizadorenvios.cotizadorenvios.repository;

import com.cotizadorenvios.cotizadorenvios.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CustomerRepository implements ICustomerRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public List<Customer> findCustomer(int id) {

        String SQL = "SELECT * FROM CUSTOMER WHERE customer_id =" + id;
        return jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Customer.class));
    }

    @Override
    public int insertCustomer(Customer customer) {

        String SQL = "INSERT INTO CUSTOMER VALUES(?, ?, ?, ?)";
        return jdbcTemplate.update(SQL, new Object[]{
                customer.getCustomer_id(), customer.getFull_name(), customer.getNit(), customer.getCustomer_type()
        });
    }
}
