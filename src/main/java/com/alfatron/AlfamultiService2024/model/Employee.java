package com.alfatron.AlfamultiService2024.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;
import java.util.Date;

@Entity
@Table(name = "ORG_EMPLOYEE")
@Getter
@Setter
@NoArgsConstructor
public class Employee {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name="MATRICULE")
    int matricule;

    @Column(name="COMPTE_AUX",length = 100)
    String compteAux;

    @Column(name="NOM",length = 50)
    String nom;

    @Column(name="PRENOM",length = 100)
    String prenom;

    @Column(name="ID_CATEGORIE")
    int id_categorie;

    @Column(name="ID_STRUCTURE")
    int idStructure;

    @Column(name="ID_POSTE")
    int idPoste;

    @Column(name="DATE_ENTREE")
    Date dateEntree;

    @Column(name="DATE_POSTE")
    Date datePoste;

    @Column(name="PHOTO")
    String photo;


    @Column(name="MAINTENANCE")
    boolean maintenance;

    @Column(name="DATE_NAISSANCE")
    Date dateDeNaissance;

    @Column(name="GROUPE_SANG",length = 3)
    String groupeSanguin;

    @Column(name="ID_FAMILLE")
    int idFamille;

    @Transient
    @Column(name="NOM_PRENOM")
    String nomPrenom;

    @Transient
    @Column(name="AUX_COMPLET")
    String auxComplet;

    @Column(name="bit1")
    boolean bit1;

    @Column(name="bit2")
    boolean bite2;

    @Column(name="ID_POSITION_GS")
    int idPositionGs;

    @Column(name="TELEPHONE",length = 100)
    String telephone;

    @Column(name="EMAIL",length = 100)
    String email;

    @Column(name="ID_CONTRAT")
    int idContrat;

    @Column(name="NUM_SS",length = 100)
    String numeroSecuriteSociale;

    @Column(name="ID_SEC_CAISSE")
    int idSecCaisse;

    @Column(name="MODE_REG")
    int modeReglement;

    @Column(name="NUM_BANQUE",length = 100)
    String numBanque;

    @Column(name="ID_BANQUE_EMP")
    int idBanqueEmp;

    @Column(name="ID_BANQUE_EN")
    int idBanqueEntreprise;

    @Column(name="ADRESSE",length = 200)
    String adresse;

    @Column(name="VILLE",length = 200)
    String ville;

    @Column(name="CODE_P",length = 100)
    String codePostale;

    @Column(name="NOM_JF",length = 100)
    String nomJeuneFille;

    @Column(name="SIT_FAM")
    int situationFamillial;

    @Column(name="NB_ENFANT_CHR")
    int nbEnfant;

    @Column(name="SEXE")
    int sexe;

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
    boolean conjointActive;

    @Column(name="NUM_CNI",length = 100)
    String numeroCarteNational;

    @Column(name="NUM_ID_NAT",length = 100)
    String numeroIdentificationNational;

    @Column(name="NUM_PC",length = 100)
    String numPc;

    @Column(name="NUM_PASS",length = 100)
    String numPass;

    @Column(name="ETRANGE")
    boolean etrange;

    @Column(name="CODE_NAT",length = 50)
    String codeNat;

    @Column(name="COCHE")
    boolean coche;

    @Column(name="ACTIVE")
    boolean active;

    @Column(name="UNITE")
    int unite;

    public Employee(int matricule, String compteAux, String nom, String prenom, int id_categorie, int idStructure, int idPoste, Date dateEntree, Date datePoste, String photo, boolean maintenance, Date dateDeNaissance, String groupeSanguin, int idFamille, String nomPrenom, String auxComplet, boolean bit1, boolean bite2, int idPositionGs, String telephone, String email, int idContrat, String numeroSecuriteSociale, int idSecCaisse, int modeReglement, String numBanque, int idBanqueEmp, int idBanqueEntreprise, String adresse, String ville, String codePostale, String nomJeuneFille, int situationFamillial, int nbEnfant, int sexe, String lieuDeNaissance, String numeroActDeNaissance, String communeNaissance, String nomPere, String nomMere, String prenomMere, Date dateMariage, String nomPrenomConjoint, boolean conjointActive, String numeroCarteNational, String numeroIdentificationNational, String numPc, String numPass, boolean etrange, String codeNat, boolean coche, boolean active, int unite) {

        this.matricule = matricule;
        this.compteAux = compteAux;
        this.nom = nom;
        this.prenom = prenom;
        this.id_categorie = id_categorie;
        this.idStructure = idStructure;
        this.idPoste = idPoste;
        this.dateEntree = dateEntree;
        this.datePoste = datePoste;
        this.photo = photo;
        this.maintenance = maintenance;
        this.dateDeNaissance = dateDeNaissance;
        this.groupeSanguin = groupeSanguin;
        this.idFamille = idFamille;
        this.nomPrenom = nomPrenom;
        this.auxComplet = auxComplet;
        this.bit1 = bit1;
        this.bite2 = bite2;
        this.idPositionGs = idPositionGs;
        this.telephone = telephone;
        this.email = email;
        this.idContrat = idContrat;
        this.numeroSecuriteSociale = numeroSecuriteSociale;
        this.idSecCaisse = idSecCaisse;
        this.modeReglement = modeReglement;
        this.numBanque = numBanque;
        this.idBanqueEmp = idBanqueEmp;
        this.idBanqueEntreprise = idBanqueEntreprise;
        this.adresse = adresse;
        this.ville = ville;
        this.codePostale = codePostale;
        this.nomJeuneFille = nomJeuneFille;
        this.situationFamillial = situationFamillial;
        this.nbEnfant = nbEnfant;
        this.sexe = sexe;
        this.lieuDeNaissance = lieuDeNaissance;
        this.numeroActDeNaissance = numeroActDeNaissance;
        this.communeNaissance = communeNaissance;
        this.nomPere = nomPere;
        this.nomMere = nomMere;
        this.prenomMere = prenomMere;
        this.dateMariage = dateMariage;
        this.nomPrenomConjoint = nomPrenomConjoint;
        this.conjointActive = conjointActive;
        this.numeroCarteNational = numeroCarteNational;
        this.numeroIdentificationNational = numeroIdentificationNational;
        this.numPc = numPc;
        this.numPass = numPass;
        this.etrange = etrange;
        this.codeNat = codeNat;
        this.coche = coche;
        this.active = active;
        this.unite = unite;
    }
}
