package com.berkayerol.services;

import com.berkayerol.dto.DtoCustomer;

public interface ICustomerService {

    public DtoCustomer findCustomerById(Long id);
}
