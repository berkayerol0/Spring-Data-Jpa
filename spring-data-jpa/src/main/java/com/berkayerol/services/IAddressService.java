package com.berkayerol.services;

import com.berkayerol.dto.DtoAddress;
import com.berkayerol.entites.Address;

public interface IAddressService {

    public DtoAddress findAddressById(Long id);
}
