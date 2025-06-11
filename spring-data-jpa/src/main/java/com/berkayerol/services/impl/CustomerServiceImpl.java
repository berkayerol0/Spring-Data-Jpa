package com.berkayerol.services.impl;

import com.berkayerol.dto.DtoAddress;
import com.berkayerol.dto.DtoCustomer;
import com.berkayerol.entites.Address;
import com.berkayerol.entites.Customer;
import com.berkayerol.repository.CustomerRepository;
import com.berkayerol.services.ICustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public DtoCustomer findCustomerById(Long id){
        DtoCustomer dtoCustomer = new DtoCustomer();
        DtoAddress dtoAddress = new DtoAddress();
        Optional<Customer> optional = customerRepository.findById(id);
        if(optional.isEmpty()) {
            return null;
        }
        Customer customer = optional.get(); //İçindeki veriyi aldık.
        Address address = optional.get().getAddress();

        BeanUtils.copyProperties(customer, dtoCustomer);
        BeanUtils.copyProperties(address, dtoAddress);

        dtoCustomer.setAddress(dtoAddress); //yeni işlem burası

        return dtoCustomer;
    }
}
