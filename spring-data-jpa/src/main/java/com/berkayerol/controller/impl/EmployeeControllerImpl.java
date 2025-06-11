package com.berkayerol.controller.impl;

import com.berkayerol.controller.IEmployeeController;
import com.berkayerol.dto.DtoEmployee;
import com.berkayerol.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/api/employee")
public class EmployeeControllerImpl implements IEmployeeController {

    @Autowired
    private IEmployeeService iEmployeeService;

    @GetMapping("/list")
    @Override
    public List<DtoEmployee> findAllEmployees() {
        return iEmployeeService.findAllEmployees();
    }
}
