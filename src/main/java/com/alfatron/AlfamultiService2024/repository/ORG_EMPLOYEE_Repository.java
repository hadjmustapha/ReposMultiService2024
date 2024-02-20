package com.alfatron.AlfamultiService2024.repository;

import com.alfatron.AlfamultiService2024.model.RH.ORG_EMPLOYEE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ORG_EMPLOYEE_Repository extends JpaRepository<ORG_EMPLOYEE,Integer> {
}
