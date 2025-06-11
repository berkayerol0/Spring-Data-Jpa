package com.berkayerol.services.impl;

import com.berkayerol.dto.DtoDepartment;
import com.berkayerol.dto.DtoEmployee;
import com.berkayerol.entites.Employee;
import com.berkayerol.repository.EmployeeRepository;
import com.berkayerol.services.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public List<DtoEmployee> findAllEmployees() {
        List<DtoEmployee> dtoEmployeeList = new ArrayList<>();

      List<Employee> employeeList = employeeRepository.findAll();
      if(employeeList!=null && !employeeList.isEmpty()) {
          for(Employee employee: employeeList) {
            DtoEmployee dtoEmployee = new DtoEmployee();
              BeanUtils.copyProperties(employee, dtoEmployee);

              dtoEmployee.setDepartment(new DtoDepartment(employee.getDepartment().getId(),
                      employee.getDepartment().getDepartmentName()));

              dtoEmployeeList.add(dtoEmployee);
          }
      }
      return dtoEmployeeList;
    }
}
