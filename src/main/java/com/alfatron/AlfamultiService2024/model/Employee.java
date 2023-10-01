package com.alfatron.AlfamultiService2024.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Immutable;

import java.awt.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ORG_EMPLOYEE")
@Getter
@Setter
@NoArgsConstructor
@DynamicUpdate
public class Employee {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name="MATRICULE")
    Integer matricule;

    @Column(name="COMPTE_AUX",length = 100)
    String compteAux;

    @Column(name="NOM",length = 50)
    String nom;

    @Column(name="PRENOM",length = 100)
    String prenom;

    @Column(name="ID_CATEGORIE")
    Integer id_categorie;

    @Column(name="ID_STRUCTURE")
    Integer idStructure;

    @Column(name="ID_POSTE")
    Integer idPoste;

    @Column(name="DATE_ENTREE")
    //@JsonFormat(pattern="dd-MM-yyyy", timezone = "")
    java.sql.Date dateEntree;

    @Column(name="DATE_POSTE")
    Date datePoste;

    @Column(name="PHOTO")
    @Immutable
    String photo;

    @Column(name="MAINTENANCE")
    Boolean maintenance;

    @Column(name="DATE_NAISSANCE")
    Date dateDeNaissance;

    @Column(name="GROUPE_SANG",length = 3)
    String groupeSanguin;

    @Column(name="ID_FAMILLE")
    Integer idFamille;

    @Column(name="NOM_PRENOM")
    @Immutable
    String nomPrenom;

    @Column(name="AUX_COMPLET")
    @Immutable
    String auxComplet;

    @Column(name="bit1")
    Boolean bit1;

    @Column(name="bit2")
    Boolean bite2;

    @Column(name="ID_POSITION_GS")
    Integer idPositionGs;

    @Column(name="TELEPHONE",length = 100)
    String telephone;

    @Column(name="EMAIL",length = 100)
    String email;

    @Column(name="ID_CONTRAT")
    Integer idContrat;

    @Column(name="NUM_SS",length = 100)
    String numeroSecuriteSociale;

    @Column(name="ID_SEC_CAISSE")
    Integer idSecCaisse;

    @Column(name="MODE_REG")
    Integer modeReglement;

    @Column(name="NUM_BANQUE",length = 100)
    String numBanque;

    @Column(name="ID_BANQUE_EMP")
    Integer idBanqueEmp;

    @Column(name="ID_BANQUE_EN")
    Integer idBanqueEntreprise;

    @Column(name="ADRESSE",length = 200)
    String adresse;

    @Column(name="VILLE",length = 200)
    String ville;

    @Column(name="CODE_P",length = 100)
    String codePostale;

    @Column(name="NOM_JF",length = 100)
    String nomJeuneFille;

    @Column(name="SIT_FAM")
    Integer situationFamillial;

    @Column(name="NB_ENFANT_CHR")
    Integer nbEnfant;

    @Column(name="SEXE")
    Integer sexe;

    @Column(name="LIEU_NAISSANCE",length = 200)
    String lieuDeNaissance;

    @Column(name="NUM_ACTE_NAISSANCE",length = 100)
    String numeroActDeNaissance;

    @Column(name="COMMUNE_NAISSANCE",length = 100)
    String communeNaissance;

    @Column(name="PRENOM_PERE",length = 100)
    String nomPere;

    @Column(name="NOM_MERE",length = 100)
    String nomMere;

    @Column(name="PRENOM_MERE",length = 100)
    String prenomMere;

    @Column(name="DATE_MARIAGE")
    Date dateMariage;

    @Column(name="NOM_PRENOM_CONJ",length = 100)
    String nomPrenomConjoint;

    @Column(name="CONJOINT_ACTIVE")
    Boolean conjointActive;

    @Column(name="NUM_CNI",length = 100)
    String numeroCarteNational;

    @Column(name="NUM_ID_NAT",length = 100)
    String numeroIdentificationNational;

    @Column(name="NUM_PC",length = 100)
    String numPc;

    @Column(name="NUM_PASS",length = 100)
    String numPass;

    @Column(name="ETRANGE")
    Boolean etrange;

    @Column(name="CODE_NAT",length = 50)
    String codeNat;

    @Column(name="COCHE")
    Boolean coche;

    @Column(name="ACTIVE")
    Boolean active;

    @Column(name="UNITE")
    Integer unite;

    @OneToMany(mappedBy = "employee")
    @JsonIgnore
    private List<OrdreDeMission> ordresDeMissions = new ArrayList<>();

    @Transactional
    public void addOrdreDeMission(OrdreDeMission odm){
        ordresDeMissions.add(odm);
        odm.setEmployee(this);
    }
    @Transactional
    public void deleteOrdreDeMission(OrdreDeMission odm){
        odm.setEmployee(null);
        ordresDeMissions.remove(odm);
    }
}
