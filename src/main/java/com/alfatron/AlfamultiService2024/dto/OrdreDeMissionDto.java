package com.alfatron.AlfamultiService2024.dto;


import lombok.Getter;
import lombok.Setter;

import java.sql.Date;


public class OrdreDeMissionDto {

    Integer id;

    Date dateOrdreDeMission;

    Date dateDebut;

    Date dateFin;

    String objetDeMission;

    String destination;

    ClientDto clientDto;

    EmployeeDto employeeDto;

    NatureMissionDto natureMissionDto;

    StructureDto structureDto;

    VehiculeDto vehiculeDto;

    FournisseurDto fournisseurDto;

    TypeDeTransportDto typeDeTransportDto;

    String remarquesDto;

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

    public String getObjetDeMission() {
        return objetDeMission;
    }

    public void setObjetDeMission(String objetDeMission) {
        this.objetDeMission = objetDeMission;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public ClientDto getClientDto() {
        return clientDto;
    }

    public void setClientDto(ClientDto clientDto) {
        this.clientDto = clientDto;
    }

    public EmployeeDto getEmployeeDto() {
        return employeeDto;
    }

    public void setEmployeeDto(EmployeeDto employeeDto) {
        this.employeeDto = employeeDto;
    }

    public NatureMissionDto getNatureMissionDto() {
        return natureMissionDto;
    }

    public void setNatureMissionDto(NatureMissionDto natureMissionDto) {
        this.natureMissionDto = natureMissionDto;
    }

    public StructureDto getStructureDto() {
        return structureDto;
    }

    public void setStructureDto(StructureDto structureDto) {
        this.structureDto = structureDto;
    }

    public VehiculeDto getVehiculeDto() {
        return vehiculeDto;
    }

    public void setVehiculeDto(VehiculeDto vehiculeDto) {
        this.vehiculeDto = vehiculeDto;
    }

    public FournisseurDto getFournisseurDto() {
        return fournisseurDto;
    }

    public void setFournisseurDto(FournisseurDto fournisseurDto) {
        this.fournisseurDto = fournisseurDto;
    }

    public TypeDeTransportDto getTypeDeTransportDto() {
        return typeDeTransportDto;
    }

    public void setTypeDeTransportDto(TypeDeTransportDto typeDeTransportDto) {
        this.typeDeTransportDto = typeDeTransportDto;
    }

    public String getRemarquesDto() {
        return remarquesDto;
    }

    public void setRemarquesDto(String remarquesDto) {
        this.remarquesDto = remarquesDto;
    }
}
