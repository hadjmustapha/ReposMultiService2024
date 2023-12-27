package com.alfatron.AlfamultiService2024.repository;

import com.alfatron.AlfamultiService2024.model.RH_NATURE_ODM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NatureMissionRepository extends JpaRepository<RH_NATURE_ODM,Integer> {
}
