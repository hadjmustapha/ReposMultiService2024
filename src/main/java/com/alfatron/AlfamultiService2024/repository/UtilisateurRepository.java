package com.alfatron.AlfamultiService2024.repository;

import com.alfatron.AlfamultiService2024.model.Utilisateur;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer> {

    @Query("Select user from Utilisateur user where user.username = :username")
    Optional<Utilisateur> filtreParUsername(@Param("username") String username, Sort sort);



}
