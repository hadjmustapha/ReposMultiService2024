package com.alfatron.AlfamultiService2024.dto;

import com.alfatron.AlfamultiService2024.model.RH.RH_ODM;
import com.alfatron.AlfamultiService2024.model.RH.RH_ODM_RUB;
import jakarta.persistence.*;

public class RH_ODM_LIGNES_EDITION {

    Integer idEdition;

    Integer odmEdition;

    Integer rubriqueEdition;

    Float montantUnitaireEdition;

    Float qteEdition;

    Float montantTotalEdition;

    Boolean avanceEdition;

    Integer tauxAvanceEdition;

    Float montantAvanceEdition;

    String detailEdition;

    public Integer getIdEdition() {
        return idEdition;
    }

    public void setIdEdition(Integer idEdition) {
        this.idEdition = idEdition;
    }

    public Integer getOdmEdition() {
        return odmEdition;
    }

    public void setOdmEdition(Integer odmEdition) {
        this.odmEdition = odmEdition;
    }

    public Integer getRubriqueEdition() {
        return rubriqueEdition;
    }

    public void setRubriqueEdition(Integer rubriqueEdition) {
        this.rubriqueEdition = rubriqueEdition;
    }

    public Float getMontantUnitaireEdition() {
        return montantUnitaireEdition;
    }

    public void setMontantUnitaireEdition(Float montantUnitaireEdition) {
        this.montantUnitaireEdition = montantUnitaireEdition;
    }

    public Float getQteEdition() {
        return qteEdition;
    }

    public void setQteEdition(Float qteEdition) {
        this.qteEdition = qteEdition;
    }

    public Float getMontantTotalEdition() {
        return montantTotalEdition;
    }

    public void setMontantTotalEdition(Float montantTotalEdition) {
        this.montantTotalEdition = montantTotalEdition;
    }

    public Boolean getAvanceEdition() {
        return avanceEdition;
    }

    public void setAvanceEdition(Boolean avanceEdition) {
        this.avanceEdition = avanceEdition;
    }

    public Integer getTauxAvanceEdition() {
        return tauxAvanceEdition;
    }

    public void setTauxAvanceEdition(Integer tauxAvanceEdition) {
        this.tauxAvanceEdition = tauxAvanceEdition;
    }

    public Float getMontantAvanceEdition() {
        return montantAvanceEdition;
    }

    public void setMontantAvanceEdition(Float montantAvanceEdition) {
        this.montantAvanceEdition = montantAvanceEdition;
    }

    public String getDetailEdition() {
        return detailEdition;
    }

    public void setDetailEdition(String detailEdition) {
        this.detailEdition = detailEdition;
    }
}
