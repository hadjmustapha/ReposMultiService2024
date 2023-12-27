package com.alfatron.AlfamultiService2024.repository;

import com.alfatron.AlfamultiService2024.model.SYS_LOGIN_PROFIL;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtilisateurRoleRepository extends JpaRepository<SYS_LOGIN_PROFIL,Integer> {

    @Query("Select slp from SYS_LOGIN_PROFIL slp where slp.utilisateur.username = :username and slp.sysRole.role is not null")
    List<SYS_LOGIN_PROFIL> filtreParUsername(@Param("username") String username, Sort sort);

    @Query("Select slp from SYS_LOGIN_PROFIL slp where slp.sysRole.role = :role and slp.utilisateur is not null")
    List<SYS_LOGIN_PROFIL> filtreParRole(@Param("role") String role, Sort sort);

}
