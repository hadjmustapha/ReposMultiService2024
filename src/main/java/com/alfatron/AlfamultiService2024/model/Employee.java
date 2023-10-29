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

    @ManyToOne()
    @JoinColumn(name="ID_POSTE")
    Poste posteEmployee;

    public Employee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMatricule() {
        return matricule;
    }

    public void setMatricule(Integer matricule) {
        this.matricule = matricule;
    }

    public String getCompteAux() {
        return compteAux;
    }

    public void setCompteAux(String compteAux) {
        this.compteAux = compteAux;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getId_categorie() {
        return id_categorie;
    }

    public void setId_categorie(Integer id_categorie) {
        this.id_categorie = id_categorie;
    }

    public Integer getIdStructure() {
        return idStructure;
    }

    public void setIdStructure(Integer idStructure) {
        this.idStructure = idStructure;
    }

    public Date getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(Date dateEntree) {
        this.dateEntree = dateEntree;
    }

    public Date getDatePoste() {
        return datePoste;
    }

    public void setDatePoste(Date datePoste) {
        this.datePoste = datePoste;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Boolean getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(Boolean maintenance) {
        this.maintenance = maintenance;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getGroupeSanguin() {
        return groupeSanguin;
    }

    public void setGroupeSanguin(String groupeSanguin) {
        this.groupeSanguin = groupeSanguin;
    }

    public Integer getIdFamille() {
        return idFamille;
    }

    public void setIdFamille(Integer idFamille) {
        this.idFamille = idFamille;
    }

    public String getNomPrenom() {
        return nomPrenom;
    }

    public void setNomPrenom(String nomPrenom) {
        this.nomPrenom = nomPrenom;
    }

    public String getAuxComplet() {
        return auxComplet;
    }

    public void setAuxComplet(String auxComplet) {
        this.auxComplet = auxComplet;
    }

    public Boolean getBit1() {
        return bit1;
    }

    public void setBit1(Boolean bit1) {
        this.bit1 = bit1;
    }

    public Boolean getBite2() {
        return bite2;
    }

    public void setBite2(Boolean bite2) {
        this.bite2 = bite2;
    }

    public Integer getIdPositionGs() {
        return idPositionGs;
    }

    public void setIdPositionGs(Integer idPositionGs) {
        this.idPositionGs = idPositionGs;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdContrat() {
        return idContrat;
    }

    public void setIdContrat(Integer idContrat) {
        this.idContrat = idContrat;
    }

    public String getNumeroSecuriteSociale() {
        return numeroSecuriteSociale;
    }

    public void setNumeroSecuriteSociale(String numeroSecuriteSociale) {
        this.numeroSecuriteSociale = numeroSecuriteSociale;
    }

    public Integer getIdSecCaisse() {
        return idSecCaisse;
    }

    public void setIdSecCaisse(Integer idSecCaisse) {
        this.idSecCaisse = idSecCaisse;
    }

    public Integer getModeReglement() {
        return modeReglement;
    }

    public void setModeReglement(Integer modeReglement) {
        this.modeReglement = modeReglement;
    }

    public String getNumBanque() {
        return numBanque;
    }

    public void setNumBanque(String numBanque) {
        this.numBanque = numBanque;
    }

    public Integer getIdBanqueEmp() {
        return idBanqueEmp;
    }

    public void setIdBanqueEmp(Integer idBanqueEmp) {
        this.idBanqueEmp = idBanqueEmp;
    }

    public Integer getIdBanqueEntreprise() {
        return idBanqueEntreprise;
    }

    public void setIdBanqueEntreprise(Integer idBanqueEntreprise) {
        this.idBanqueEntreprise = idBanqueEntreprise;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostale() {
        return codePostale;
    }

    public void setCodePostale(String codePostale) {
        this.codePostale = codePostale;
    }

    public String getNomJeuneFille() {
        return nomJeuneFille;
    }

    public void setNomJeuneFille(String nomJeuneFille) {
        this.nomJeuneFille = nomJeuneFille;
    }

    public Integer getSituationFamillial() {
        return situationFamillial;
    }

    public void setSituationFamillial(Integer situationFamillial) {
        this.situationFamillial = situationFamillial;
    }

    public Integer getNbEnfant() {
        return nbEnfant;
    }

    public void setNbEnfant(Integer nbEnfant) {
        this.nbEnfant = nbEnfant;
    }

    public Integer getSexe() {
        return sexe;
    }

    public void setSexe(Integer sexe) {
        this.sexe = sexe;
    }

    public String getLieuDeNaissance() {
        return lieuDeNaissance;
    }

    public void setLieuDeNaissance(String lieuDeNaissance) {
        this.lieuDeNaissance = lieuDeNaissance;
    }

    public String getNumeroActDeNaissance() {
        return numeroActDeNaissance;
    }

    public void setNumeroActDeNaissance(String numeroActDeNaissance) {
        this.numeroActDeNaissance = numeroActDeNaissance;
    }

    public String getCommuneNaissance() {
        return communeNaissance;
    }

    public void setCommuneNaissance(String communeNaissance) {
        this.communeNaissance = communeNaissance;
    }

    public String getNomPere() {
        return nomPere;
    }

    public void setNomPere(String nomPere) {
        this.nomPere = nomPere;
    }

    public String getNomMere() {
        return nomMere;
    }

    public void setNomMere(String nomMere) {
        this.nomMere = nomMere;
    }

    public String getPrenomMere() {
        return prenomMere;
    }

    public void setPrenomMere(String prenomMere) {
        this.prenomMere = prenomMere;
    }

    public Date getDateMariage() {
        return dateMariage;
    }

    public void setDateMariage(Date dateMariage) {
        this.dateMariage = dateMariage;
    }

    public String getNomPrenomConjoint() {
        return nomPrenomConjoint;
    }

    public void setNomPrenomConjoint(String nomPrenomConjoint) {
        this.nomPrenomConjoint = nomPrenomConjoint;
    }

    public Boolean getConjointActive() {
        return conjointActive;
    }

    public void setConjointActive(Boolean conjointActive) {
        this.conjointActive = conjointActive;
    }

    public String getNumeroCarteNational() {
        return numeroCarteNational;
    }

    public void setNumeroCarteNational(String numeroCarteNational) {
        this.numeroCarteNational = numeroCarteNational;
    }

    public String getNumeroIdentificationNational() {
        return numeroIdentificationNational;
    }

    public void setNumeroIdentificationNational(String numeroIdentificationNational) {
        this.numeroIdentificationNational = numeroIdentificationNational;
    }

    public String getNumPc() {
        return numPc;
    }

    public void setNumPc(String numPc) {
        this.numPc = numPc;
    }

    public String getNumPass() {
        return numPass;
    }

    public void setNumPass(String numPass) {
        this.numPass = numPass;
    }

    public Boolean getEtrange() {
        return etrange;
    }

    public void setEtrange(Boolean etrange) {
        this.etrange = etrange;
    }

    public String getCodeNat() {
        return codeNat;
    }

    public void setCodeNat(String codeNat) {
        this.codeNat = codeNat;
    }

    public Boolean getCoche() {
        return coche;
    }

    public void setCoche(Boolean coche) {
        this.coche = coche;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getUnite() {
        return unite;
    }

    public void setUnite(Integer unite) {
        this.unite = unite;
    }

    public List<OrdreDeMission> getOrdresDeMissions() {
        return ordresDeMissions;
    }

    public void setOrdresDeMissions(List<OrdreDeMission> ordresDeMissions) {
        this.ordresDeMissions = ordresDeMissions;
    }

    public Poste getPosteEmployee() {
        return posteEmployee;
    }

    public void setPosteEmployee(Poste posteEmployee) {
        this.posteEmployee = posteEmployee;
    }
}
