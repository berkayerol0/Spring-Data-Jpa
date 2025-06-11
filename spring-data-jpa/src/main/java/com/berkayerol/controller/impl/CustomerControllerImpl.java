package com.berkayerol.controller.impl;

import com.berkayerol.controller.ICustomerController;
import com.berkayerol.dto.DtoAddress;
import com.berkayerol.dto.DtoCustomer;
import com.berkayerol.entites.Address;
import com.berkayerol.entites.Customer;
import com.berkayerol.repository.CustomerRepository;
import com.berkayerol.services.ICustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("rest/api/customer")
public class CustomerControllerImpl implements ICustomerController {

    @Autowired
    public ICustomerService iCustomerService;

    @GetMapping("/list/{id}")
    @Override
    public DtoCustomer findCustomerById(@PathVariable(name = "id") Long id) {
        return iCustomerService.findCustomerById(id);
    }
}
