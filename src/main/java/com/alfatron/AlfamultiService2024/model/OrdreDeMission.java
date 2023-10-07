package com.alfatron.AlfamultiService2024.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import java.sql.Date;


@Entity
@Table(name = "RH_ODM")
@NoArgsConstructor
@DynamicUpdate
@Getter
@Setter
public class OrdreDeMission {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name="DATE_D")
    Date dateDebut;

    @Column(name="DATE_F")
    Date dateFin;

    @Column(name="NB_JR")
    Integer nombreDeJours;

    @ManyToOne()
    @JoinColumn(name="ID_EMP")
    Employee employee;

    @Column(name="REFERENCE", length = 200)
    String references;

    @ManyToOne
    @JoinColumn(name="NATURE")
    NatureMission natureMission;

    @Column(name="ID_TRANS")
    Integer idtransport;

    @ManyToOne
    @JoinColumn(name="ID_STRUCTURE")
    Structure structure;

    @ManyToOne
    @JoinColumn(name="MOYEN_TRANS")
    Vehicule vehicule;

    @Column(name="DESTINATION", length = 100)
    String destination ;//	nvarchar(100)

    @Column(name="ST_DEMANDEUR")
    Integer structureOrdonatrice;//	relation a revoir !!!!

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
    Integer hebergement;

    @Column(name="RESTAURATION")
    Integer restauration;

    @Column(name="TAUX_AVANCE")
    Integer tauxAvance;

    @Column(name="CREATED_BY")
    Integer createdBy;//toRelation

    @Column(name="EDITED_BY")
    Integer editedBy;// toRelation

    @ManyToOne()
    @JoinColumn(name="TRANSPORT")
    TypeDeTransport typeDeTransport;

    @Column(name="REMARQUES")
    String remarques;

    @Column(name="ID_PDV")
    Integer idPointDeVente;//toRelation

    @Column(name="VALIDE_1")
    Boolean valide1;

    @Column(name="VALIDE_2")
    Boolean valide2;

    @Column(name="ID_USER")
    Integer idUtilisateur;// int toRelation


}
