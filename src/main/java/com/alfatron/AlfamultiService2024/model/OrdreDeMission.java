package com.alfatron.AlfamultiService2024.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import java.sql.Date;


@Entity
@Table(name = "RH_ODM")
@DynamicUpdate
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

    public OrdreDeMission() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Integer getNombreDeJours() {
        return nombreDeJours;
    }

    public void setNombreDeJours(Integer nombreDeJours) {
        this.nombreDeJours = nombreDeJours;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getReferences() {
        return references;
    }

    public void setReferences(String references) {
        this.references = references;
    }

    public NatureMission getNatureMission() {
        return natureMission;
    }

    public void setNatureMission(NatureMission natureMission) {
        this.natureMission = natureMission;
    }

    public Integer getIdtransport() {
        return idtransport;
    }

    public void setIdtransport(Integer idtransport) {
        this.idtransport = idtransport;
    }

    public Structure getStructure() {
        return structure;
    }

    public void setStructure(Structure structure) {
        this.structure = structure;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getStructureOrdonatrice() {
        return structureOrdonatrice;
    }

    public void setStructureOrdonatrice(Integer structureOrdonatrice) {
        this.structureOrdonatrice = structureOrdonatrice;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public String getProjet() {
        return projet;
    }

    public void setProjet(String projet) {
        this.projet = projet;
    }

    public Date getDateOrdreDeMission() {
        return dateOrdreDeMission;
    }

    public void setDateOrdreDeMission(Date dateOrdreDeMission) {
        this.dateOrdreDeMission = dateOrdreDeMission;
    }

    public Integer getHebergement() {
        return hebergement;
    }

    public void setHebergement(Integer hebergement) {
        this.hebergement = hebergement;
    }

    public Integer getRestauration() {
        return restauration;
    }

    public void setRestauration(Integer restauration) {
        this.restauration = restauration;
    }

    public Integer getTauxAvance() {
        return tauxAvance;
    }

    public void setTauxAvance(Integer tauxAvance) {
        this.tauxAvance = tauxAvance;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getEditedBy() {
        return editedBy;
    }

    public void setEditedBy(Integer editedBy) {
        this.editedBy = editedBy;
    }

    public TypeDeTransport getTypeDeTransport() {
        return typeDeTransport;
    }

    public void setTypeDeTransport(TypeDeTransport typeDeTransport) {
        this.typeDeTransport = typeDeTransport;
    }

    public String getRemarques() {
        return remarques;
    }

    public void setRemarques(String remarques) {
        this.remarques = remarques;
    }

    public Integer getIdPointDeVente() {
        return idPointDeVente;
    }

    public void setIdPointDeVente(Integer idPointDeVente) {
        this.idPointDeVente = idPointDeVente;
    }

    public Boolean getValide1() {
        return valide1;
    }

    public void setValide1(Boolean valide1) {
        this.valide1 = valide1;
    }

    public Boolean getValide2() {
        return valide2;
    }

    public void setValide2(Boolean valide2) {
        this.valide2 = valide2;
    }

    public Integer getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Integer idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }
}
