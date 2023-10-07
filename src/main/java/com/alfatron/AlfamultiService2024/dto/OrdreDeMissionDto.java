package com.alfatron.AlfamultiService2024.dto;


import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
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




}
