package com.alfatron.AlfamultiService2024.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;
import java.util.ArrayList;

@Entity
@Table(name = "MG_INSTALLATIONS")
@Getter
@Setter
@NoArgsConstructor
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    int id ;

    @Column(name="CODE",length = 100)
    String code ;

    @Column(name="LIBELLE_INSTAL",length = 100)
    String libelle ;

    @Column(name="DESCRIPTION_INSTAL")
    String description;

    @Column(name = "ID_IMMO")
    int idImmo;

    @Column(name ="ETAT")
    int etat ;

    @Column(name = "EMPLACEMENT")
    int emplcacemet;

    @Column(name ="FAMILLE_INCIDENT")
    int famille_incindent;

    @Column(name ="FAMILLE_CONTRAT")
    int familleContrat;

    @Column(name ="VEHICULE")
    boolean vehicule;

    @Column(name ="EQUIPEMENT")
    boolean equipement;

    @Column(name ="SIM")
    boolean sim;

    @Column(name ="MATRICULE",length = 100)
    String matricule ;

    @Column(name ="PHOTO")
    String photo;

    @Column(name ="NUMERO_SIM",length = 20)
    String numeroSim;

    @Column(name ="COLOR")
    int couleur;

    @OneToMany(mappedBy = "vehicule")
    @JsonIgnore
    private ArrayList<OrdreDeMission> ordresDeMissions = new ArrayList<>();

    @Transactional
    public void addOrdreDeMission(OrdreDeMission odm){
        ordresDeMissions.add(odm);
       odm.setVehicule(this);
    }
    @Transactional
    public void deleteOrdreDeMission(OrdreDeMission odm){
        odm.setVehicule(null);
        ordresDeMissions.remove(odm);
    }
}
