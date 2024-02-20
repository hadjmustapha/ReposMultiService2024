package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.ORG_EMPLOYEE_Api;
import com.alfatron.AlfamultiService2024.dto.EmployeeDto;
import com.alfatron.AlfamultiService2024.service.ORG_EMPLOYEE_Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/Employee")
@CrossOrigin
public class ORG_EMPLOYEE_Controller implements ORG_EMPLOYEE_Api {

    private ORG_EMPLOYEE_Service employeeService;

    public ORG_EMPLOYEE_Controller(ORG_EMPLOYEE_Service employeeService) {
        this.employeeService = employeeService;
    }

    public List<EmployeeDto> findAllEmployees() {
        return employeeService.findAllEmployees();
    }

    public EmployeeDto findEmployeeById(Integer id) {
        return employeeService.findEmployeeById(id);
    }
}
