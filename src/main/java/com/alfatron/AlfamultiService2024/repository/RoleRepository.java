package com.alfatron.AlfamultiService2024.repository;

import com.alfatron.AlfamultiService2024.model.Role;
import com.alfatron.AlfamultiService2024.model.Utilisateur;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,String> {

    @Query("Select role from Role role where role.role = :role")
    Optional<Role> filtreParRole(@Param("role") String username, Sort sort);

}
