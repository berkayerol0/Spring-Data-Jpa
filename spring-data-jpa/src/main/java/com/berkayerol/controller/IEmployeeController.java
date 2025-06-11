package com.berkayerol.controller;

import com.berkayerol.dto.DtoEmployee;

import java.util.List;

public interface IEmployeeController {

    public List<DtoEmployee> findAllEmployees();
}
