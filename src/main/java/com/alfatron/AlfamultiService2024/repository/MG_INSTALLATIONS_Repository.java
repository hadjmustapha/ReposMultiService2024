package com.alfatron.AlfamultiService2024.repository;

import com.alfatron.AlfamultiService2024.model.MGX.MG_INSTALLATIONS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MG_INSTALLATIONS_Repository extends JpaRepository<MG_INSTALLATIONS,Integer> {
}
