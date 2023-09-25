package com.alfatron.AlfamultiService2024.controller.service;

import com.alfatron.AlfamultiService2024.dto.EmployeeDto;
import com.alfatron.AlfamultiService2024.mapper.EmployeeMapper;
import com.alfatron.AlfamultiService2024.model.Employee;
import com.alfatron.AlfamultiService2024.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeService {

    private EmployeeRepository employeeRepository;
    private EmployeeMapper employeeMapper;
    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    public EmployeeDto findById(int id) {
        Employee employee       = employeeRepository.findById(id).get();
        EmployeeDto employeeDto = employeeMapper.toEmployeeDto(employee);

        return employeeDto;

    }
}
