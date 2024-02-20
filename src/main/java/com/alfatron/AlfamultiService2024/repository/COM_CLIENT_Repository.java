package com.alfatron.AlfamultiService2024.repository;

import com.alfatron.AlfamultiService2024.model.COM.COM_CLIENT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface COM_CLIENT_Repository extends JpaRepository<COM_CLIENT,Integer> {
}
