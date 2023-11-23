package com.cotizadorenvios.cotizadorenvios.repository;

import com.cotizadorenvios.cotizadorenvios.model.Customer;
import com.cotizadorenvios.cotizadorenvios.model.Rate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RateRepository implements IRateRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Rate> allRates() {

        String SQL = "SELECT * FROM RATE";
        return jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Rate.class));
    }
}
