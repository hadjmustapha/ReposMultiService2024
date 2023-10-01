package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.EmployeeDto;
import com.alfatron.AlfamultiService2024.exception.EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.EmployeeMapper;
import com.alfatron.AlfamultiService2024.model.Employee;
import com.alfatron.AlfamultiService2024.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Slf4j
public class EmployeeService {

    private EmployeeRepository employeeRepository;
    private EmployeeMapper employeeMapper;

    public List<EmployeeDto> findAll(){
        return employeeRepository.findAll().stream().
                map(employeeMapper::toEmployeeDto).
                collect(Collectors.toList());
    }

    public EmployeeDto findById(Integer id) {
        if (id == null) {
            log.error("Nature ID is null");
            return null;
        }

        return employeeRepository.findById(id).map(employeeMapper::toEmployeeDto).orElseThrow(()->
                new EntityNotFoundException("Impossible de trouve employee avec id : "+id, ErrorCodes.EMPLOYEE_NOT_FOUND));

    }
}
