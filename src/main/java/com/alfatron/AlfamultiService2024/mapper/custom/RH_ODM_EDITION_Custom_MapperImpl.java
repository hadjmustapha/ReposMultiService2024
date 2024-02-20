
package com.alfatron.AlfamultiService2024.mapper.custom;

import com.alfatron.AlfamultiService2024.dto.RH_ODM_EDITION;
import com.alfatron.AlfamultiService2024.dto.RH_ODM_LIGNES_EDITION;
import com.alfatron.AlfamultiService2024.mapper.RH_ODM_EDITION_Mapper;
import com.alfatron.AlfamultiService2024.mapper.RH_ODM_LIGNES_Mapper;
import com.alfatron.AlfamultiService2024.model.ACHAT.ACH_FOURNISSEUR;
import com.alfatron.AlfamultiService2024.model.COM.COM_CLIENT;
import com.alfatron.AlfamultiService2024.model.MGX.MG_INSTALLATIONS;
import com.alfatron.AlfamultiService2024.model.RH.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class RH_ODM_EDITION_Custom_MapperImpl implements RH_ODM_EDITION_Mapper {

    private RH_ODM_LIGNES_Mapper rH_ODM_LIGNES_Mapper;

    public RH_ODM_EDITION_Custom_MapperImpl(RH_ODM_LIGNES_Mapper rH_ODM_LIGNES_Mapper) {
        this.rH_ODM_LIGNES_Mapper = rH_ODM_LIGNES_Mapper;
    }

    public RH_ODM toOrdreDeMission(RH_ODM_EDITION ordreDeMissionEdition) {
        if ( ordreDeMissionEdition == null ) {
            return null;
        }
        RH_ODM rH_ODM = new RH_ODM();

        //rH_ODM.setTypeDeTransport( rH_ODM_EDITIONToRH_ODM_TRANSPORT( ordreDeMissionEdition ) );
        if(ordreDeMissionEdition.getTypeDeTransportEdition()!=null){
            RH_ODM_TRANSPORT rh_odm_transport = new RH_ODM_TRANSPORT();
            rh_odm_transport.setId(ordreDeMissionEdition.getTypeDeTransportEdition());
            rH_ODM.setTypeDeTransport(rh_odm_transport);
        }

        //rH_ODM.setFournisseur( rH_ODM_EDITIONToACH_FOURNISSEUR( ordreDeMissionEdition ) );
        if(ordreDeMissionEdition.getFournisseurEdition() != null){
            ACH_FOURNISSEUR ach_fournisseur = new ACH_FOURNISSEUR();
            ach_fournisseur.setId(ordreDeMissionEdition.getFournisseurEdition());
            rH_ODM.setFournisseur(ach_fournisseur);
        }

        //rH_ODM.setVehicule( rH_ODM_EDITIONToMG_INSTALLATIONS( ordreDeMissionEdition ) );
        if(ordreDeMissionEdition.getVehiculeEdition() != null){
            MG_INSTALLATIONS mg_installations = new MG_INSTALLATIONS();
            mg_installations.setId(ordreDeMissionEdition.getVehiculeEdition());
            rH_ODM.setVehicule(mg_installations);
        }

        //rH_ODM.setStructure( rH_ODM_EDITIONToORG_STRUCTURE( ordreDeMissionEdition ) );
        if(ordreDeMissionEdition.getStructureEdition() != null){
            ORG_STRUCTURE org_structure = new ORG_STRUCTURE();
            org_structure.setId(ordreDeMissionEdition.getStructureEdition());
            rH_ODM.setStructure(org_structure);
        }

        //rH_ODM.setNatureMission( rH_ODM_EDITIONToRH_NATURE_ODM( ordreDeMissionEdition ) );
        if(ordreDeMissionEdition.getNatureMissionEdition() != null){
            RH_NATURE_ODM rh_nature_odm = new RH_NATURE_ODM();
            rh_nature_odm.setId(ordreDeMissionEdition.getNatureMissionEdition());
            rH_ODM.setNatureMission(rh_nature_odm);
        }

        //rH_ODM.setEmployee( rH_ODM_EDITIONToORG_EMPLOYEE( ordreDeMissionEdition ) );
        if(ordreDeMissionEdition.getEmployeeEdition() != null){
            ORG_EMPLOYEE org_employee = new ORG_EMPLOYEE();
            org_employee.setId(ordreDeMissionEdition.getEmployeeEdition());
            rH_ODM.setEmployee(org_employee);
        }

        //rH_ODM.getClient().setId( ordreDeMissionEdition.getClientEdition() );
        if(ordreDeMissionEdition.getClientEdition() != null){
            COM_CLIENT comClient = new COM_CLIENT();
            comClient.setId(ordreDeMissionEdition.getClientEdition());
            rH_ODM.setClient(comClient);
        }

        rH_ODM.setReferences( ordreDeMissionEdition.getObjetDeMissionEdition() );
        rH_ODM.setRemarques( ordreDeMissionEdition.getRemarquesEdition() );
        rH_ODM.setId( ordreDeMissionEdition.getId() );
        rH_ODM.setDateDebut( ordreDeMissionEdition.getDateDebut() );
        rH_ODM.setDateFin( ordreDeMissionEdition.getDateFin() );
        rH_ODM.setDateOrdreDeMission( ordreDeMissionEdition.getDateOrdreDeMission() );
        rH_ODM.setDestination(ordreDeMissionEdition.getDestinationEdition());

        rH_ODM.setDetails(this.rH_ODM_LIGNES_EDITIONListToRH_ODM_LIGNESList(ordreDeMissionEdition.getDetailsEdition()));

        for(RH_ODM_LIGNES item : rH_ODM.getDetails()){
            item.setOdm(rH_ODM);
        }
        return rH_ODM;
    }
    public RH_ODM_EDITION toOrdreDeMissionEdition(RH_ODM ordreDeMission) {

        if ( ordreDeMission == null ) {
            return null;
        }

        RH_ODM_EDITION rH_ODM_EDITION = new RH_ODM_EDITION();

        if(ordreDeMission.getTypeDeTransport() != null){
            rH_ODM_EDITION.setTypeDeTransportEdition(ordreDeMission.getTypeDeTransport().getId());
        }

        if(ordreDeMission.getFournisseur() != null){
            rH_ODM_EDITION.setFournisseurEdition(ordreDeMission.getFournisseur().getId());
        }

        if(ordreDeMission.getVehicule() != null){
            rH_ODM_EDITION.setVehiculeEdition(ordreDeMission.getVehicule().getId());
        }

        if(ordreDeMission.getStructure() != null){
            rH_ODM_EDITION.setStructureEdition(ordreDeMission.getStructure().getId());
        }

        if(ordreDeMission.getNatureMission() != null){
            rH_ODM_EDITION.setNatureMissionEdition(ordreDeMission.getNatureMission().getId());
        }

        if(ordreDeMission.getEmployee() != null){
            rH_ODM_EDITION.setEmployeeEdition(ordreDeMission.getEmployee().getId());
        }

        if(ordreDeMission.getClient() != null){
            rH_ODM_EDITION.setClientEdition( ordreDeMission.getClient().getId() );
        }

        rH_ODM_EDITION.setObjetDeMissionEdition(ordreDeMission.getReferences());
        rH_ODM_EDITION.setRemarquesEdition( ordreDeMission.getRemarques() );
        rH_ODM_EDITION.setId( ordreDeMission.getId() );
        rH_ODM_EDITION.setDateDebut( ordreDeMission.getDateDebut() );
        rH_ODM_EDITION.setDateFin( ordreDeMission.getDateFin() );
        rH_ODM_EDITION.setDateOrdreDeMission( ordreDeMission.getDateOrdreDeMission() );
        rH_ODM_EDITION.setDestinationEdition(ordreDeMission.getDestination());
        rH_ODM_EDITION.setDetailsEdition(this.rH_ODM_LIGNESListToRH_ODM_LIGNES_EDITIONList(ordreDeMission.getDetails()));
        return rH_ODM_EDITION;
    }
    protected List<RH_ODM_LIGNES> rH_ODM_LIGNES_EDITIONListToRH_ODM_LIGNESList(List<RH_ODM_LIGNES_EDITION> list) {
        if (list == null) {
            return null;
        } else {
            List<RH_ODM_LIGNES> list1 = new ArrayList(list.size());
            Iterator var3 = list.iterator();

            while(var3.hasNext()) {
                RH_ODM_LIGNES_EDITION rH_ODM_LIGNES_EDITION = (RH_ODM_LIGNES_EDITION)var3.next();
                list1.add(this.rH_ODM_LIGNES_Mapper.to_RH_ODM_LIGNES(rH_ODM_LIGNES_EDITION));
            }

            return list1;
        }
    }
    protected List<RH_ODM_LIGNES_EDITION> rH_ODM_LIGNESListToRH_ODM_LIGNES_EDITIONList(List<RH_ODM_LIGNES> list) {
        if (list == null) {
            return null;
        } else {
            List<RH_ODM_LIGNES_EDITION> list1 = new ArrayList(list.size());
            Iterator var3 = list.iterator();

            while(var3.hasNext()) {
                RH_ODM_LIGNES rH_ODM_LIGNES = (RH_ODM_LIGNES)var3.next();
                list1.add(this.rH_ODM_LIGNES_Mapper.to_RH_ODM_LIGNES_EDITION(rH_ODM_LIGNES));
            }

            return list1;
        }
    }
}
