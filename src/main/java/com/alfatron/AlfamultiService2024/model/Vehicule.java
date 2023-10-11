package com.alfatron.AlfamultiService2024.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "MG_INSTALLATIONS")
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Integer id ;

    @Column(name="CODE",length = 100)
    String code ;

    @Column(name="LIBELLE_INSTAL",length = 100)
    String libelle ;

    @Column(name="DESCRIPTION_INSTAL")
    String description;

    @Column(name = "ID_IMMO")
    Integer idImmo;

    @Column(name ="ETAT")
    Integer etat ;

    @Column(name = "EMPLACEMENT")
    Integer emplcacemet;

    @Column(name ="FAMILLE_INCIDENT")
    Integer famille_incindent;

    @Column(name ="FAMILLE_CONTRAT")
    Integer familleContrat;

    @Column(name ="VEHICULE")
    Boolean vehicule;

    @Column(name ="EQUIPEMENT")
    Boolean equipement;

    @Column(name ="SIM")
    Boolean sim;

    @Column(name ="MATRICULE",length = 100)
    String matricule ;

    @Column(name ="PHOTO")
    String photo;

    @Column(name ="NUMERO_SIM",length = 20)
    String numeroSim;

    @Column(name ="COLOR")
    Integer couleur;

    @OneToMany(mappedBy = "vehicule")
    @JsonIgnore
    private List<OrdreDeMission> ordresDeMissions = new ArrayList<>();

    public Vehicule() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIdImmo() {
        return idImmo;
    }

    public void setIdImmo(Integer idImmo) {
        this.idImmo = idImmo;
    }

    public Integer getEtat() {
        return etat;
    }

    public void setEtat(Integer etat) {
        this.etat = etat;
    }

    public Integer getEmplcacemet() {
        return emplcacemet;
    }

    public void setEmplcacemet(Integer emplcacemet) {
        this.emplcacemet = emplcacemet;
    }

    public Integer getFamille_incindent() {
        return famille_incindent;
    }

    public void setFamille_incindent(Integer famille_incindent) {
        this.famille_incindent = famille_incindent;
    }

    public Integer getFamilleContrat() {
        return familleContrat;
    }

    public void setFamilleContrat(Integer familleContrat) {
        this.familleContrat = familleContrat;
    }

    public Boolean getVehicule() {
        return vehicule;
    }

    public void setVehicule(Boolean vehicule) {
        this.vehicule = vehicule;
    }

    public Boolean getEquipement() {
        return equipement;
    }

    public void setEquipement(Boolean equipement) {
        this.equipement = equipement;
    }

    public Boolean getSim() {
        return sim;
    }

    public void setSim(Boolean sim) {
        this.sim = sim;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getNumeroSim() {
        return numeroSim;
    }

    public void setNumeroSim(String numeroSim) {
        this.numeroSim = numeroSim;
    }

    public Integer getCouleur() {
        return couleur;
    }

    public void setCouleur(Integer couleur) {
        this.couleur = couleur;
    }

    public List<OrdreDeMission> getOrdresDeMissions() {
        return ordresDeMissions;
    }

    public void setOrdresDeMissions(List<OrdreDeMission> ordresDeMissions) {
        this.ordresDeMissions = ordresDeMissions;
    }


}
