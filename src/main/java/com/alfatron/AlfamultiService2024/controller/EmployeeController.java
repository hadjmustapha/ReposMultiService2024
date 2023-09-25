package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.Employee_Api;
import com.alfatron.AlfamultiService2024.dto.EmployeeDto;
import com.alfatron.AlfamultiService2024.model.Employee;
import com.alfatron.AlfamultiService2024.controller.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/Employee")
@AllArgsConstructor
public class EmployeeController implements Employee_Api {

    private EmployeeService employeeService;

    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    public EmployeeDto findById(int id) {
        return employeeService.findById(id);
    }
}
