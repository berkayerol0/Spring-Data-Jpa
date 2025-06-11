package com.berkayerol.controller.impl;

import com.berkayerol.controller.IAddressController;
import com.berkayerol.dto.DtoAddress;
import com.berkayerol.services.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/address")
public class AddressControllerImpl implements IAddressController {

    @Autowired
    private IAddressService iAddressService;

    @GetMapping("/list/{id}")
    @Override
    public DtoAddress findAddressById(@PathVariable(name = "id") Long id) {
        return iAddressService.findAddressById(id);
    }
}
