package com.alfatron.AlfamultiService2024.repository;

import com.alfatron.AlfamultiService2024.model.RH.RH_ODM;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface RH_ODM_Repository extends JpaRepository<RH_ODM,Integer> {

    @Query("Select odm from RH_ODM odm where odm.employee.nom LIKE CONCAT('%',:nomEmployee,'%')")
    List<RH_ODM> filtreParNomEmployee(String nomEmployee, Sort sort);

    @Query("Select odm from RH_ODM odm where odm.destination LIKE CONCAT('%',:destinationParam,'%')")
    List<RH_ODM> filtreParDestination(String destinationParam, Sort sort);

    @Query("Select odm from RH_ODM odm where odm.references LIKE CONCAT('%',:objet,'%')")
    List<RH_ODM> filtreParObjetDeMission(String objet, Sort sort);

    @Query("Select odm from RH_ODM odm where odm.structure.libelle LIKE CONCAT('%',:structure,'%')")
    List<RH_ODM> filtreParStructure(String structure, Sort sort);

    @Query("Select odm from RH_ODM odm where odm.dateOrdreDeMission = :date")
    List<RH_ODM> filtreParDateOrdreDeMission(Date date, Sort sort);

    @Query("Select odm from RH_ODM odm where cast(odm.dateOrdreDeMission as string) LIKE CONCAT('%',:date,'%')")
    List<RH_ODM> filtreParDateOrdreDeMission(String date, Sort sort);

    @Query("Select odm from RH_ODM odm where odm.client.raisonSociale LIKE CONCAT('%',:raisonSociale,'%')")
    List<RH_ODM> filtreParRaisonSocialeClient(String raisonSociale, Sort sort);

    @Query("Select odm from RH_ODM odm where odm.fournisseur.raisonSociale LIKE CONCAT('%',:raisonSociale,'%')")
    List<RH_ODM> filtreParRaisonSocialeFournisseur(String raisonSociale, Sort sort);

/*

    List<OrdreDeMission> filtreEntreDeuxDates(Date dateDebut, Date dateFin);

*/
    /*
    requete intéressante pour la recherche par date
    select cast(cast('12/03/23' as date)as nvarchar) as colone
where cast(cast('12/03/23' as date)as nvarchar) like '%12%'
     */
}
