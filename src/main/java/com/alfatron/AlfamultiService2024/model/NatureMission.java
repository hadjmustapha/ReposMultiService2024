package com.alfatron.AlfamultiService2024.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "RH_NATURE_ODM")
public class NatureMission{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Integer id;

    @Column(name = "LIBELLE", length = 100)
    String libelle;

    @Column(name = "COMPTE_6")
    Integer compte6;

    @OneToMany(mappedBy = "natureMission")
    @JsonIgnore
    private List<OrdreDeMission> ordresDeMissions= new ArrayList<>();

    public NatureMission() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Integer getCompte6() {
        return compte6;
    }

    public void setCompte6(Integer compte6) {
        this.compte6 = compte6;
    }

    public List<OrdreDeMission> getOrdresDeMissions() {
        return ordresDeMissions;
    }

    public void setOrdresDeMissions(List<OrdreDeMission> ordresDeMissions) {
        this.ordresDeMissions = ordresDeMissions;
    }



}
