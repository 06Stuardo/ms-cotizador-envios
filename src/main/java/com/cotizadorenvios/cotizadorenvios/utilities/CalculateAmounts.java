package com.cotizadorenvios.cotizadorenvios.utilities;

import com.cotizadorenvios.cotizadorenvios.model.Quotation;

public class CalculateAmounts {

    private double grandTotal;
    private double discAmount;
    private double weight;
    private int rate;
    private double high;
    private double length;
    private double width;
    private double perDiscount;


    public Quotation calculateGrandTotalQTN(Quotation qtn){

        weight = qtn.getWeight_();
        rate = qtn.getRate();
        high = qtn.getHeight();
        length = qtn.getLength_();
        width = qtn.getWidth_();
        perDiscount = qtn.getPer_discount();

        grandTotal = (weight * rate) + 1.66 * high * length * width - perDiscount * 0.5 + weight;



        qtn.setGrand_total(Math.round(grandTotal));

        return qtn;
    }

}
