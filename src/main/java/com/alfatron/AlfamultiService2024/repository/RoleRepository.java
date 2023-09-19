package com.alfatron.AlfamultiService2024.repository;

import com.alfatron.AlfamultiService2024.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,String> {
}
