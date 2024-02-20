package com.alfatron.AlfamultiService2024.model.RH;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name = "RH_ODM_LIGNES")
@DynamicUpdate
public class RH_ODM_LIGNES {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @ManyToOne
    @JoinColumn(name="ID_ODM")
    RH_ODM odm;

    @ManyToOne
    @JoinColumn(name="ID_RUBRIQUE")
    RH_ODM_RUB rubrique;

    @Column(name="MT_U")
    Float montantUnitaire;

    @Column(name="QTE")
    Float qte;

    @Column(name="MT_TOTAL")
    @Transient
    Float montantTotal;

    @Column(name="AVANCE")
    Boolean avance;

    @Column(name="TAUX_AVANCE")
    Integer tauxAvance;

    @Column(name="MT_AVANCE")
    @Transient
    Float montantAvance;

    @Column(name="DETAIL")
    String detail;

    public RH_ODM_LIGNES() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RH_ODM getOdm() {
        return odm;
    }

    public void setOdm(RH_ODM odm) {
        this.odm = odm;
    }

    public RH_ODM_RUB getRubrique() {
        return rubrique;
    }

    public void setRubrique(RH_ODM_RUB rubrique) {
        this.rubrique = rubrique;
    }

    public Float getMontantUnitaire() {
        return montantUnitaire;
    }

    public void setMontantUnitaire(Float montantUnitaire) {
        this.montantUnitaire = montantUnitaire;
    }

    public Float getQte() {
        return qte;
    }

    public void setQte(Float qte) {
        this.qte = qte;
    }

    public Float getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(Float montantTotal) {
        this.montantTotal = montantTotal;
    }

    public Boolean getAvance() {
        return avance;
    }

    public void setAvance(Boolean avance) {
        this.avance = avance;
    }

    public Integer getTauxAvance() {
        return tauxAvance;
    }

    public void setTauxAvance(Integer tauxAvance) {
        this.tauxAvance = tauxAvance;
    }

    public Float getMontantAvance() {
        return montantAvance;
    }

    public void setMontantAvance(Float montantAvance) {
        this.montantAvance = montantAvance;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

}
