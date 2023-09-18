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

    @Column(name="ID_EMP")
    int idEmp;

    @Column(name="REFERENCE", length = 200)
    String references;

    @Column(name="NATURE")
    int natureMission;

    @Column(name="ID_TRANS")
    int idtransport;// toRelation

    @Column(name="ID_STRUCTURE")
    int idStructure;// toRelation

    @Column(name="MOYEN_TRANS")
    int moyenTransport; // toRelation

    @Column(name="DESTINATION", length = 100)
    String destination ;//	nvarchar(100)

    @Column(name="ST_DEMANDEUR")
    int demandeur;//	int

    @Column(name="CLIENT")
    int client;// toRelation

    @Column(name="FRS")
    int fournisseur;// toRelation

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

    @Column(name="TRANSPORT")
    int transport;// toRelation

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

    //Constructeur a regenérer après mise de relation entre entities

    public OrdreDeMission(Date dateDebut, Date dateFin, int nombreDeJours, int idEmp, String references, int natureMission, int idtransport, int idStructure, int moyenTransport, String destination, int demandeur, int client, int fournisseur, String projet, Date dateOrdreDeMission, int hebergement, int restauration, int tauxAvance, int createdBy, int editedBy, int transport, String remarques, int idPointDeVente, boolean valide1, boolean valide2, int idUtilisateur) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.nombreDeJours = nombreDeJours;
        this.idEmp = idEmp;
        this.references = references;
        this.natureMission = natureMission;
        this.idtransport = idtransport;
        this.idStructure = idStructure;
        this.moyenTransport = moyenTransport;
        this.destination = destination;
        this.demandeur = demandeur;
        this.client = client;
        this.fournisseur = fournisseur;
        this.projet = projet;
        this.dateOrdreDeMission = dateOrdreDeMission;
        this.hebergement = hebergement;
        this.restauration = restauration;
        this.tauxAvance = tauxAvance;
        this.createdBy = createdBy;
        this.editedBy = editedBy;
        this.transport = transport;
        this.remarques = remarques;
        this.idPointDeVente = idPointDeVente;
        this.valide1 = valide1;
        this.valide2 = valide2;
        this.idUtilisateur = idUtilisateur;
    }
}
