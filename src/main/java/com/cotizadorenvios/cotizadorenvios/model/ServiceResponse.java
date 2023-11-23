package com.cotizadorenvios.cotizadorenvios.model;

import lombok.Data;

@Data
public class ServiceResponse {

    Boolean succes;
    String message;
    Quotation grand_total_qtn;

}
