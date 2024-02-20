package com.alfatron.AlfamultiService2024.repository;

import com.alfatron.AlfamultiService2024.model.ADMIN.SYS_LOGIN;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SYS_LOGIN_Repository extends JpaRepository<SYS_LOGIN,Integer> {


    @Query("Select user from SYS_LOGIN user where user.username = :username")
    Optional<SYS_LOGIN> filtreParUsername(@Param("username") String username, Sort sort);

    @Query("Select user from SYS_LOGIN user where user.username = :username")
    Optional<SYS_LOGIN> findByUsername(@Param("username") String username);



}
