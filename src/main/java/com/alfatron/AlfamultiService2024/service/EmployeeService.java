package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.EmployeeDto;
import com.alfatron.AlfamultiService2024.exception.Custom_EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.EmployeeMapper;
import com.alfatron.AlfamultiService2024.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;
    private EmployeeMapper employeeMapper;

    public EmployeeService(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }

    public List<EmployeeDto> findAllEmployees(){
        return employeeRepository.findAll().stream().
                map(employeeMapper::toEmployeeDto).
                collect(Collectors.toList());
    }

    public EmployeeDto findEmployeeById(Integer id) {
        if (id == null) {
            //log.error("Employee ID is null");
            return null;
        }

        return employeeRepository.findById(id).map(employeeMapper::toEmployeeDto).orElseThrow(()->
                new Custom_EntityNotFoundException("Impossible de trouve employee avec id : "+id, ErrorCodes.EMPLOYEE_NOT_FOUND));

    }

    /*
        @Transactional
    public void addOrdreDeMission(OrdreDeMission odm){
        ordresDeMissions.add(odm);
        odm.setEmployee(this);
    }
    @Transactional
    public void deleteOrdreDeMission(OrdreDeMission odm){
        odm.setEmployee(null);
        ordresDeMissions.remove(odm);
    }
     */
}
