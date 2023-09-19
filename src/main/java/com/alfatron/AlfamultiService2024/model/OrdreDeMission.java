package com.alfatron.AlfamultiService2024.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "RH_ODM")
@Getter
@Setter
@NoArgsConstructor
public class OrdreDeMission {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name="DATE_D")
    Date dateDebut;

    @Column(name="DATE_F")
    Date dateFin;

    @Column(name="NB_JR")
    int nombreDeJours;

    @ManyToOne
    @JoinColumn(name = "ID_EMP")
    Employee employee;

    @Column(name="REFERENCE", length = 200)
    String references;

    @ManyToOne
    @JoinColumn(name="NATURE")
    NatureMission natureMission;

    @Column(name="ID_TRANS")
    int idtransport;

    @ManyToOne
    @JoinColumn(name="ID_STRUCTURE")
    Structure structure;

    @ManyToOne
    @JoinColumn(name="MOYEN_TRANS")
    Vehicule vehicule;

    @Column(name="DESTINATION", length = 100)
    String destination ;//	nvarchar(100)

    @Column(name="ST_DEMANDEUR")
    int structureOrdonatrice;//	relation a revoir !!!!

    @ManyToOne
    @JoinColumn(name="CLIENT")
    Client client;

    @ManyToOne
    @JoinColumn(name="FRS")
    Fournisseur fournisseur;

    @Column(name="PROJET", length = 50)
    String projet;

    @Column(name="DATE_ODM")
    Date dateOrdreDeMission;

    @Column(name="HEBERGEMENT")
    int hebergement;

    @Column(name="RESTAURATION")
    int restauration;

    @Column(name="TAUX_AVANCE")
    int tauxAvance;

    @Column(name="CREATED_BY")
    int createdBy;//toRelation

    @Column(name="EDITED_BY")
    int editedBy;// toRelation

    @ManyToOne
    @JoinColumn(name="TRANSPORT")
    TypeDeTransport typeDeTransport;

    @Column(name="REMARQUES")
    String remarques;

    @Column(name="ID_PDV")
    int idPointDeVente;//toRelation

    @Column(name="VALIDE_1")
    boolean valide1;

    @Column(name="VALIDE_2")
    boolean valide2;

    @Column(name="ID_USER")
    int idUtilisateur;// int toRelation

}
