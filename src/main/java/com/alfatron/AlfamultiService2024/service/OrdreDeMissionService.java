package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.model.OrdreDeMission;
import com.alfatron.AlfamultiService2024.repository.OrdreDeMissionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OrdreDeMissionService {

    private OrdreDeMissionRepository ordreDeMissionRepository;

    private EmployeeService employeeService;

    public List<OrdreDeMission> findAll(){
        return ordreDeMissionRepository.findAll();
    }

    public Optional<OrdreDeMission> findById(int id){
        return ordreDeMissionRepository.findById(id);
    }


    public OrdreDeMission save(OrdreDeMission ordreDeMission){
        //Optional<Employee> employeeOptional = employeeService.findById(212);
        //Employee employee = employeeOptional.get();
        //ordreDeMission.setEmployee(employee);
        return ordreDeMissionRepository.save(ordreDeMission);
    };


    public void delete(int id){
        ordreDeMissionRepository.deleteById(id);
    }

}
