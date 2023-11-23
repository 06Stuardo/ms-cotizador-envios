package com.cotizadorenvios.cotizadorenvios.model;

import lombok.Data;

@Data
public class Quotation {

    int qtn_id;
    int customer_id;
    int rate_id;
    double weight_;
    double width_;
    double height;
    double length_;
    String from_country;
    String to_country;
    String region;
    double discount_amount;
    double grand_total;
    double per_discount;
    int rate;

}
