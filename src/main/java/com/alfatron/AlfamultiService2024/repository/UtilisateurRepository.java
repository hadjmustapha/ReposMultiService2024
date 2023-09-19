package com.alfatron.AlfamultiService2024.repository;

import com.alfatron.AlfamultiService2024.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer> {
}
