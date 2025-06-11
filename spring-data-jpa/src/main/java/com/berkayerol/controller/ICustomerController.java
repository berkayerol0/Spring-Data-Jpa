package com.berkayerol.controller;

import com.berkayerol.dto.DtoCustomer;

public interface ICustomerController {

    public DtoCustomer findCustomerById(Long id);
}
