package com.alfatron.AlfamultiService2024.repository;

import com.alfatron.AlfamultiService2024.dto.OrdreDeMissionDto;
import com.alfatron.AlfamultiService2024.model.OrdreDeMission;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface OrdreDeMissionRepository extends JpaRepository<OrdreDeMission,Integer> {

    @Query("Select odm from OrdreDeMission odm where odm.employee.nom LIKE CONCAT('%',:nomEmployee,'%')")
    List<OrdreDeMission> filtreParNomEmployee(String nomEmployee,Sort sort);

    @Query("Select odm from OrdreDeMission odm where odm.destination LIKE CONCAT('%',:destinationParam,'%')")
    List<OrdreDeMission> filtreParDestination(String destinationParam,Sort sort);

    @Query("Select odm from OrdreDeMission odm where odm.references LIKE CONCAT('%',:objet,'%')")
    List<OrdreDeMission> filtreParObjetDeMission(String objet,Sort sort);

    @Query("Select odm from OrdreDeMission odm where odm.structure.libelle LIKE CONCAT('%',:structure,'%')")
    List<OrdreDeMission> filtreParStructure(String structure,Sort sort);

    @Query("Select odm from OrdreDeMission odm where odm.dateOrdreDeMission = :date")
    List<OrdreDeMission> filtreParDateOrdreDeMission(Date date,Sort sort);

    @Query("Select odm from OrdreDeMission odm where cast(odm.dateOrdreDeMission as string) LIKE CONCAT('%',:date,'%')")
    List<OrdreDeMission> RechercheParDateOrdreDeMission(String date,Sort sort);

    @Query("Select odm from OrdreDeMission odm where odm.client.raisonSociale LIKE CONCAT('%',:raisonSociale,'%')")
    List<OrdreDeMission> filtreParRaisonSocialeClient(String raisonSociale,Sort sort);

    @Query("Select odm from OrdreDeMission odm where odm.fournisseur.raisonSociale LIKE CONCAT('%',:raisonSociale,'%')")
    List<OrdreDeMission> filtreParRaisonSocialeFournisseur(String raisonSociale,Sort sort);

/*

    List<OrdreDeMission> filtreEntreDeuxDates(Date dateDebut, Date dateFin);

*/
    /*
    requete intéressante pour la recherche par date
    select cast(cast('12/03/23' as date)as nvarchar) as colone
where cast(cast('12/03/23' as date)as nvarchar) like '%12%'
     */
}
