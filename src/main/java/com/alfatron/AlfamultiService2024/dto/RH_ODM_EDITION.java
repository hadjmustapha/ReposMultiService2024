package com.alfatron.AlfamultiService2024.dto;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class RH_ODM_EDITION {

    Integer id;
    Date    dateOrdreDeMission;
    Date    dateDebut;
    Date    dateFin;
    String  objetDeMissionEdition;
    String  destinationEdition;
    Integer clientEdition;
    Integer employeeEdition;
    Integer natureMissionEdition;
    Integer structureEdition;
    Integer vehiculeEdition;
    Integer fournisseurEdition;
    Integer typeDeTransportEdition;
    String  remarquesEdition;

    List<RH_ODM_LIGNES_EDITION> detailsEdition = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateOrdreDeMission() {
        return dateOrdreDeMission;
    }

    public void setDateOrdreDeMission(Date dateOrdreDeMission) {
        this.dateOrdreDeMission = dateOrdreDeMission;
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

    public String getObjetDeMissionEdition() {
        return objetDeMissionEdition;
    }

    public void setObjetDeMissionEdition(String objetDeMissionEdition) {
        this.objetDeMissionEdition = objetDeMissionEdition;
    }

    public String getDestinationEdition() {
        return destinationEdition;
    }

    public void setDestinationEdition(String destinationEdition) {
        this.destinationEdition = destinationEdition;
    }

    public Integer getClientEdition() {
        return clientEdition;
    }

    public void setClientEdition(Integer clientEdition) {
        this.clientEdition = clientEdition;
    }

    public Integer getEmployeeEdition() {
        return employeeEdition;
    }

    public void setEmployeeEdition(Integer employeeEdition) {
        this.employeeEdition = employeeEdition;
    }

    public Integer getNatureMissionEdition() {
        return natureMissionEdition;
    }

    public void setNatureMissionEdition(Integer natureMissionEdition) {
        this.natureMissionEdition = natureMissionEdition;
    }

    public Integer getStructureEdition() {
        return structureEdition;
    }

    public void setStructureEdition(Integer structureEdition) {
        this.structureEdition = structureEdition;
    }

    public Integer getVehiculeEdition() {
        return vehiculeEdition;
    }

    public void setVehiculeEdition(Integer vehiculeEdition) {
        this.vehiculeEdition = vehiculeEdition;
    }

    public Integer getFournisseurEdition() {
        return fournisseurEdition;
    }

    public void setFournisseurEdition(Integer fournisseurEdition) {
        this.fournisseurEdition = fournisseurEdition;
    }

    public Integer getTypeDeTransportEdition() {
        return typeDeTransportEdition;
    }

    public void setTypeDeTransportEdition(Integer typeDeTransportEdition) {
        this.typeDeTransportEdition = typeDeTransportEdition;
    }

    public String getRemarquesEdition() {
        return remarquesEdition;
    }

    public void setRemarquesEdition(String remarquesEdition) {
        this.remarquesEdition = remarquesEdition;
    }

    public List<RH_ODM_LIGNES_EDITION> getDetailsEdition() {
        return detailsEdition;
    }

    public void setDetailsEdition(List<RH_ODM_LIGNES_EDITION> detailsEdition) {
        this.detailsEdition = detailsEdition;
    }

}
