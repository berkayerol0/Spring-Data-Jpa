package com.berkayerol.controller;

import com.berkayerol.dto.DtoAddress;

public interface IAddressController {
    public DtoAddress findAddressById(Long id);
}
