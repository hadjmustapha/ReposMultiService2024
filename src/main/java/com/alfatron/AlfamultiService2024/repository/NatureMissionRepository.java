package com.alfatron.AlfamultiService2024.repository;

import com.alfatron.AlfamultiService2024.model.NatureMission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NatureMissionRepository extends JpaRepository<NatureMission,Integer> {
}
