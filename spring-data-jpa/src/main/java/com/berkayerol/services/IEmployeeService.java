package com.berkayerol.services;

import com.berkayerol.dto.DtoEmployee;

import java.util.List;

public interface IEmployeeService {

    public List<DtoEmployee> findAllEmployees();
}
