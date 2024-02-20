package com.alfatron.AlfamultiService2024.model.MGX;

import jakarta.persistence.*;

@Entity
@Table(name = "MG_DEMANDE")
public class MG_DEMANDE {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;


    /*



    [ID]
      ,[ID_PARENT]
      ,[DATE]
      ,[ECHEANCE]
      ,[CATEGORIE]
      ,[PRIORITE]
      ,[ETAT]
      ,[ID_INSTALL]
      ,[ID_SALLE]
      ,[DESCRIPTION_SHORT]
      ,[DESCRIPTION]
      ,[PHOTO]
      ,[INITIATEUR]
      ,[AFFECTATION]
      ,[RESERV_DATE_D]
      ,[RESERV_DATE_F]
      ,[MEETING_ORG]
      ,[MEETING_NB]
      ,[Options]
      ,[EventType]
      ,[ID_EMPLOYEE_SIM]
      ,[ID_DEMANDE]
      ,[MODULE]
      ,[ID_USER]
      ,[ID_PDV]
      ,[VALIDE_1]
      ,[VALIDE_2]
      ,[ID_PDV_FRS]
     */

}
