package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.EmployeeDto;
import com.alfatron.AlfamultiService2024.exception.Custom_EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.ORG_EMPLOYEE_Mapper;
import com.alfatron.AlfamultiService2024.repository.ORG_EMPLOYEE_Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ORG_EMPLOYEE_Service {

    private ORG_EMPLOYEE_Repository employeeRepository;
    private ORG_EMPLOYEE_Mapper employeeMapper;

    public ORG_EMPLOYEE_Service(ORG_EMPLOYEE_Repository employeeRepository, ORG_EMPLOYEE_Mapper employeeMapper) {
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
