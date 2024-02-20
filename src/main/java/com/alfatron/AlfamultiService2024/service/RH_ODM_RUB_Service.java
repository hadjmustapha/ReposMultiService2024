package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.model.RH.RH_ODM_RUB;
import com.alfatron.AlfamultiService2024.repository.RH_ODM_RUB_Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RH_ODM_RUB_Service {

    RH_ODM_RUB_Repository rh_odm_rub_repository;
    //RH_ODM_RUB_Mapper rh_odm_rub_mapper;

    public RH_ODM_RUB_Service(RH_ODM_RUB_Repository rh_odm_rub_repository) {
        this.rh_odm_rub_repository = rh_odm_rub_repository;
    }

    public List<RH_ODM_RUB> findAllRubrique(){
        return rh_odm_rub_repository.findAll();
    }

    public Optional<RH_ODM_RUB> findById(Integer id) {
        if (id == null) {
            //log.error("Employee ID is null");
            return null;
        }
        return rh_odm_rub_repository.findById(id);
    }

    /*
        public List<EmployeeDto> findAllEmployees(){
        return employeeRepository.findAll().stream().
                map(employeeMapper::toEmployeeDto).
                collect(Collectors.toList());
    }

    public  findById(Integer id) {
        if (id == null) {
            //log.error("Employee ID is null");
            return null;
        }

        return employeeRepository.findById(id).map(employeeMapper::toEmployeeDto).orElseThrow(()->
                new Custom_EntityNotFoundException("Impossible de trouve employee avec id : "+id, ErrorCodes.EMPLOYEE_NOT_FOUND));

    }

     */
}
