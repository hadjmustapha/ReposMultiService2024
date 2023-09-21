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
@Getter
@Setter
@NoArgsConstructor
@DynamicUpdate
public class NatureMission{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    int id;

    @Column(name = "LIBELLE", length = 100)
    String libelle;

    @Column(name = "COMPTE_6")
    Integer compte6;

    @OneToMany(mappedBy = "natureMission")
    @JsonIgnore
    private List<OrdreDeMission> ordresDeMissions= new ArrayList<>();

    @Transactional
    public void addOrdreDeMission(OrdreDeMission odm){
        ordresDeMissions.add(odm);
        odm.setNatureMission(this);
    }

    @Transactional
    public void deleteOrdreDeMission(OrdreDeMission odm){
        ordresDeMissions.remove(odm);
        odm.setNatureMission(null);
    }


}
