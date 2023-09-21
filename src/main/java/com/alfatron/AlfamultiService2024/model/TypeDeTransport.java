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
@Table(name = "RH_ODM_TRANSPORT")
@NoArgsConstructor
@Getter
@Setter
@DynamicUpdate
public class TypeDeTransport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    int id;

    @Column(name = "LIBELLE",length = 100)
    String libelle	;

    public TypeDeTransport(String libelle){
        this.libelle=libelle;
    }

    @OneToMany(mappedBy = "typeDeTransport")
    @JsonIgnore
    private List<OrdreDeMission> ordresDeMissions = new ArrayList<>();

    @Transactional
    public void addOrdreDeMission(OrdreDeMission odm){
        ordresDeMissions.add(odm);
        odm.setTypeDeTransport(this);
    }

    @Transactional
    public void deleteOrdreDeMission(OrdreDeMission odm){
        odm.setTypeDeTransport(null);
        ordresDeMissions.remove(odm);
    }

    public TypeDeTransport(String libelle, List<OrdreDeMission> ordresDeMissions) {
        this.libelle = libelle;
        this.ordresDeMissions = ordresDeMissions;
    }

}
