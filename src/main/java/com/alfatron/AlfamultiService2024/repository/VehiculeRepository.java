package com.alfatron.AlfamultiService2024.repository;

import com.alfatron.AlfamultiService2024.model.MG_INSTALLATIONS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculeRepository extends JpaRepository<MG_INSTALLATIONS,Integer> {
}
