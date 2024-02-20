package com.alfatron.AlfamultiService2024.repository;

import com.alfatron.AlfamultiService2024.model.ADMIN.SYS_ROLE;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SYS_ROLE_Repository extends JpaRepository<SYS_ROLE,String> {

    @Query("Select sysRole from SYS_ROLE sysRole where sysRole.role = :role")
    Optional<SYS_ROLE> filtreParRole(@Param("role") String role, Sort sort);

}
