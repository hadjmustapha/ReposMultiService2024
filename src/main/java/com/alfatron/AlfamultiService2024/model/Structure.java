package com.alfatron.AlfamultiService2024.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ORG_STRUCTURE")
@Getter
@Setter
@NoArgsConstructor
public class Structure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    int id;

    @Column(name="Libellé",length = 50)
    String libelle;

    @Column(name="ID_parent")
    Integer idParent;

    @Column(name="ID_IMAGE")
    Integer idImage;

    @OneToMany(mappedBy = "structure")
    @JsonIgnore
    private List<OrdreDeMission> ordresDeMissions = new ArrayList<>();

    @Transactional
    public void addOrdreDeMission(OrdreDeMission odm){
        ordresDeMissions.add(odm);
        odm.setStructure(this);
    }

    @Transactional
    public void deleteOrdreDeMission(OrdreDeMission odm){
        odm.setStructure(null);
        ordresDeMissions.remove(odm);
    }
}
