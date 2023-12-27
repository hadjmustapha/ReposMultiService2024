package com.alfatron.AlfamultiService2024.repository;

import com.alfatron.AlfamultiService2024.model.ACH_FOURNISSEUR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FournisseurRepository extends JpaRepository<ACH_FOURNISSEUR,Integer> {

}
