package com.alfatron.AlfamultiService2024.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;

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

    public Vehicule(String code, String libelle, String description, int idImmo, int etat, int emplcacemet, int famille_incindent, int familleContrat, boolean vehicule, boolean equipement, boolean sim, String matricule, String photo, String numeroSim, int couleur) {
        this.code = code;
        this.libelle = libelle;
        this.description = description;
        this.idImmo = idImmo;
        this.etat = etat;
        this.emplcacemet = emplcacemet;
        this.famille_incindent = famille_incindent;
        this.familleContrat = familleContrat;
        this.vehicule = vehicule;
        this.equipement = equipement;
        this.sim = sim;
        this.matricule = matricule;
        this.photo = photo;
        this.numeroSim = numeroSim;
        this.couleur = couleur;
    }
}
