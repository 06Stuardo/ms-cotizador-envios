package com.cotizadorenvios.cotizadorenvios.repository;

import com.cotizadorenvios.cotizadorenvios.model.Quotation;
import com.cotizadorenvios.cotizadorenvios.utilities.CalculateAmounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.swing.text.Utilities;

@Repository
public class QuotationRepository implements  IQuotationRepository{

    private CalculateAmounts calculateAmount;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insertQTN(Quotation qtn) {

        String SQL = "INSERT INTO QUOTATION VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(SQL, new Object[]{
                qtn.getCustomer_id(), qtn.getRate_id(), qtn.getWeight_(), qtn.getWidth_(),
                qtn.getHeight(), qtn.getLength_(), qtn.getFrom_country(), qtn.getTo_country(),
                qtn.getRegion(), qtn.getDiscount_amount(), qtn.getGrand_total(), qtn.getPer_discount(),
                qtn.getRate()
        });
    }
}
