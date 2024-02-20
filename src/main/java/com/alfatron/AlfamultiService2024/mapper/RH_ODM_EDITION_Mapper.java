package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.RH_ODM_EDITION;
import com.alfatron.AlfamultiService2024.model.COM.COM_CLIENT;
import com.alfatron.AlfamultiService2024.model.RH.RH_ODM;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

import static org.mapstruct.NullValuePropertyMappingStrategy.SET_TO_NULL;

//@Mapper//(uses = {RH_ODM_LIGNES_Mapper.class})
//@Mapper
//@Component
public interface RH_ODM_EDITION_Mapper {
/*
    @Mapping(source = "typeDeTransportEdition" ,target = "typeDeTransport.id")
    @Mapping(source = "fournisseurEdition"     ,target = "fournisseur.id")
    @Mapping(source = "vehiculeEdition"        ,target = "vehicule.id")
    @Mapping(source = "structureEdition"       ,target = "structure.id")
    @Mapping(source = "natureMissionEdition"   ,target = "natureMission.id")
    //@Mapping(source = "natureDto"            ,target = "natureMission")
    @Mapping(source = "employeeEdition"        ,target = "employee.id")
    @Mapping(source = "objetDeMissionEdition"  ,target = "references")
    //@Mapping(source = "clientEdition"          ,target = "client.id")
    @Mapping(expression = "java(null == rH_ODM_EDITION.getClientEdition() ? = null : rH_ODM_EDITION.getClientEdition())"
            ,target = "client.id" )
    @Mapping(source = "remarquesEdition"       ,target = "remarques")
    //@Mapping(source = "detailsEdition"       ,target = "details")
    */
    RH_ODM toOrdreDeMission(RH_ODM_EDITION ordreDeMissionEdition);
/*
    @Mapping(source = "typeDeTransport.id"     ,target = "typeDeTransportEdition")
    @Mapping(source = "fournisseur.id"         ,target = "fournisseurEdition")
    @Mapping(source = "vehicule.id"            ,target = "vehiculeEdition")
    @Mapping(source = "structure.id"           ,target = "structureEdition")
    @Mapping(source = "natureMission.id"       ,target = "natureMissionEdition")
    //@Mapping(source = "natureMission"        ,target = "natureDto")
    @Mapping(source = "employee.id"            ,target = "employeeEdition")
    @Mapping(source = "references"             ,target = "objetDeMissionEdition")
    //@Mapping(source = "client.id"              ,target = "clientEdition" )
    //java(null == myobjectdetailmapper.getlastone(myobject) ? null : myobjectdetailmapper.getlastone(myobject).getnumber())
    @Mapping(expression = "java(null == ordreDeMission.getClient() ? null : ordreDeMission.getClient().getId())"
            ,target = "clientEdition" )
    @Mapping(source = "remarques"              ,target = "remarquesEdition")
    //@Mapping(source = "details"              ,target = "detailsEdition")
  */
    RH_ODM_EDITION toOrdreDeMissionEdition(RH_ODM ordreDeMission);
}
