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
public class Structure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    Integer id;

    @Column(name="Libellé",length = 50)
    String libelle;

    @Column(name="ID_parent")
    Integer idParent;

    @Column(name="ID_IMAGE")
    Integer idImage;

    @OneToMany(mappedBy = "structure")
    @JsonIgnore
    private List<OrdreDeMission> ordresDeMissions = new ArrayList<>();

    public Structure() {
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

    public Integer getIdParent() {
        return idParent;
    }

    public void setIdParent(Integer idParent) {
        this.idParent = idParent;
    }

    public Integer getIdImage() {
        return idImage;
    }

    public void setIdImage(Integer idImage) {
        this.idImage = idImage;
    }

    public List<OrdreDeMission> getOrdresDeMissions() {
        return ordresDeMissions;
    }

    public void setOrdresDeMissions(List<OrdreDeMission> ordresDeMissions) {
        this.ordresDeMissions = ordresDeMissions;
    }


}
