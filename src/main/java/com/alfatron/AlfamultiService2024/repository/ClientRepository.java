package com.alfatron.AlfamultiService2024.repository;

import com.alfatron.AlfamultiService2024.model.COM_CLIENT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<COM_CLIENT,Integer> {
}
