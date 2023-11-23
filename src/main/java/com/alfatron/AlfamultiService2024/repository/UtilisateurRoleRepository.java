package com.alfatron.AlfamultiService2024.repository;

import com.alfatron.AlfamultiService2024.model.OrdreDeMission;
import com.alfatron.AlfamultiService2024.model.UtilisateurRole;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtilisateurRoleRepository extends JpaRepository<UtilisateurRole,Integer> {

    @Query("Select userRole from UtilisateurRole userRole where userRole.utilisateur.username = :username and userRole.role.role is not null")
    List<UtilisateurRole> filtreParUsername(@Param("username") String username, Sort sort);

    @Query("Select userRole from UtilisateurRole userRole where userRole.role.role = :role and userRole.utilisateur is not null")
    List<UtilisateurRole> filtreParRole(@Param("role") String role, Sort sort);

}
