package com.alfatron.AlfamultiService2024.model.COM;

import com.alfatron.AlfamultiService2024.model.RH.RH_ODM;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "COM_CLIENT")
public class COM_CLIENT {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name="REFERENCE",length = 50)
    String references;

    @Column(name="RAISON_SOCIALE",length = 300)
    String raisonSociale;

    @Column(name="FAMILLE")
    Integer famille;

    @Column(name="NOM_CONTACT",length = 50)
    String nomContact;

    @Column(name="FONCTION_CONTACT",length = 100)
    String fonctionContact;

    @Column(name="EMAIL",length = 50)
    String email;

    @Column(name="MOBILE",length = 50)
    String mobile;

    @Column(name="TELEPHONE",length = 50)
    String telephone;

    @Column(name="FAX",length = 50)
    String fax;

    @Column(name="ADRESSE_1",length = 200)
    String adresse1;

    @Column(name="ADRESSE_2",length = 200)
    String adresse2;

    @Column(name="CP",length = 50)
    String codePostale;

    @Column(name="VILLE")
    Integer ville;

    @Column(name="PAYS")
    Integer pays;

    @Column(name="COMPTE",length = 50)
    String compte;

    @Column(name="COMPTE_4",length = 50)
    String compte4;

    @Column(name="LIV_ADRESSE_1",length = 200)
    String livraisonAdresse1;

    @Column(name="LIV_ADRESSE_2",length = 200)
    String livraisonAdresse2;

    @Column(name="LIV_CP",length = 50)
    String livraisonCodepostale;

    @Column(name="LIV_VILLE")
    Integer livraisonVille;

    @Column(name="LIV_PAYS")
    Integer livraisonPays;

    @Column(name="LIVRAISON_IDENTIQUE")
    Boolean livraisonIdentique;

    @Column(name="LIMITE_CREDIT")
    Boolean limiteCredit;

    @Column(name="MT_CREDIT")
    Float mtCredit;

    @Column(name="MODALITE_CREDIT")
    Boolean modaliteCredit;

    @Column(name="CREDIT_JRS")
    Integer creditJours;

    @Column(name="COMPTE_BANQUE",length = 50)
    String compteBanque;

    @Column(name="TARIF")
    Integer tarif;

    @Column(name="NOTES")
    String notes;

    @Column(name="CONDITIONS_CREDIT")
    String conditionCredit;

    @Column(name="COMPTE_AUX")
    String compteAux;

    @Column(name="AUX_COMPLET")
    String auxComplet;

    @Column(name="RC",length = 100)
    String registreDeCommerce;

    @Column(name="IDF",length = 100)
    String identifiantFiscale;

    @Column(name="AIMPO",length = 100)
    String aimpo;

    @Column(name="NIS",length = 100)
    String numeroIdentifiantSociale;

    @Column(name="REGION",length = 50)
    String region;

    @Column(name="EXONERE")
    Boolean exonere;

    @Column(name="SITE_WEB",length = 100)
    String siteWeb;

    @Column(name="BLOQUER")
    Boolean bloquer;

    @Column(name="DATE_CREATION")
    Date dateCreation;

    @Column(name="REF_COMPLET")
    String refComplet;

    @Column(name="PROSPECT")
    Boolean prospect;

    @Column(name="ID_USER")
    Integer idUser;

    @Column(name="ID_PDV_C")
    Integer idPdvClient;

    @OneToMany(mappedBy = "client")
    @JsonIgnore
    private List<RH_ODM> ordresDeMissions = new ArrayList<>();

    public COM_CLIENT() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReferences() {
        return references;
    }

    public void setReferences(String references) {
        this.references = references;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public Integer getFamille() {
        return famille;
    }

    public void setFamille(Integer famille) {
        this.famille = famille;
    }

    public String getNomContact() {
        return nomContact;
    }

    public void setNomContact(String nomContact) {
        this.nomContact = nomContact;
    }

    public String getFonctionContact() {
        return fonctionContact;
    }

    public void setFonctionContact(String fonctionContact) {
        this.fonctionContact = fonctionContact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getAdresse1() {
        return adresse1;
    }

    public void setAdresse1(String adresse1) {
        this.adresse1 = adresse1;
    }

    public String getAdresse2() {
        return adresse2;
    }

    public void setAdresse2(String adresse2) {
        this.adresse2 = adresse2;
    }

    public String getCodePostale() {
        return codePostale;
    }

    public void setCodePostale(String codePostale) {
        this.codePostale = codePostale;
    }

    public Integer getVille() {
        return ville;
    }

    public void setVille(Integer ville) {
        this.ville = ville;
    }

    public Integer getPays() {
        return pays;
    }

    public void setPays(Integer pays) {
        this.pays = pays;
    }

    public String getCompte() {
        return compte;
    }

    public void setCompte(String compte) {
        this.compte = compte;
    }

    public String getCompte4() {
        return compte4;
    }

    public void setCompte4(String compte4) {
        this.compte4 = compte4;
    }

    public String getLivraisonAdresse1() {
        return livraisonAdresse1;
    }

    public void setLivraisonAdresse1(String livraisonAdresse1) {
        this.livraisonAdresse1 = livraisonAdresse1;
    }

    public String getLivraisonAdresse2() {
        return livraisonAdresse2;
    }

    public void setLivraisonAdresse2(String livraisonAdresse2) {
        this.livraisonAdresse2 = livraisonAdresse2;
    }

    public String getLivraisonCodepostale() {
        return livraisonCodepostale;
    }

    public void setLivraisonCodepostale(String livraisonCodepostale) {
        this.livraisonCodepostale = livraisonCodepostale;
    }

    public Integer getLivraisonVille() {
        return livraisonVille;
    }

    public void setLivraisonVille(Integer livraisonVille) {
        this.livraisonVille = livraisonVille;
    }

    public Integer getLivraisonPays() {
        return livraisonPays;
    }

    public void setLivraisonPays(Integer livraisonPays) {
        this.livraisonPays = livraisonPays;
    }

    public Boolean getLivraisonIdentique() {
        return livraisonIdentique;
    }

    public void setLivraisonIdentique(Boolean livraisonIdentique) {
        this.livraisonIdentique = livraisonIdentique;
    }

    public Boolean getLimiteCredit() {
        return limiteCredit;
    }

    public void setLimiteCredit(Boolean limiteCredit) {
        this.limiteCredit = limiteCredit;
    }

    public Float getMtCredit() {
        return mtCredit;
    }

    public void setMtCredit(Float mtCredit) {
        this.mtCredit = mtCredit;
    }

    public Boolean getModaliteCredit() {
        return modaliteCredit;
    }

    public void setModaliteCredit(Boolean modaliteCredit) {
        this.modaliteCredit = modaliteCredit;
    }

    public Integer getCreditJours() {
        return creditJours;
    }

    public void setCreditJours(Integer creditJours) {
        this.creditJours = creditJours;
    }

    public String getCompteBanque() {
        return compteBanque;
    }

    public void setCompteBanque(String compteBanque) {
        this.compteBanque = compteBanque;
    }

    public Integer getTarif() {
        return tarif;
    }

    public void setTarif(Integer tarif) {
        this.tarif = tarif;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getConditionCredit() {
        return conditionCredit;
    }

    public void setConditionCredit(String conditionCredit) {
        this.conditionCredit = conditionCredit;
    }

    public String getCompteAux() {
        return compteAux;
    }

    public void setCompteAux(String compteAux) {
        this.compteAux = compteAux;
    }

    public String getAuxComplet() {
        return auxComplet;
    }

    public void setAuxComplet(String auxComplet) {
        this.auxComplet = auxComplet;
    }

    public String getRegistreDeCommerce() {
        return registreDeCommerce;
    }

    public void setRegistreDeCommerce(String registreDeCommerce) {
        this.registreDeCommerce = registreDeCommerce;
    }

    public String getIdentifiantFiscale() {
        return identifiantFiscale;
    }

    public void setIdentifiantFiscale(String identifiantFiscale) {
        this.identifiantFiscale = identifiantFiscale;
    }

    public String getAimpo() {
        return aimpo;
    }

    public void setAimpo(String aimpo) {
        this.aimpo = aimpo;
    }

    public String getNumeroIdentifiantSociale() {
        return numeroIdentifiantSociale;
    }

    public void setNumeroIdentifiantSociale(String numeroIdentifiantSociale) {
        this.numeroIdentifiantSociale = numeroIdentifiantSociale;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Boolean getExonere() {
        return exonere;
    }

    public void setExonere(Boolean exonere) {
        this.exonere = exonere;
    }

    public String getSiteWeb() {
        return siteWeb;
    }

    public void setSiteWeb(String siteWeb) {
        this.siteWeb = siteWeb;
    }

    public Boolean getBloquer() {
        return bloquer;
    }

    public void setBloquer(Boolean bloquer) {
        this.bloquer = bloquer;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getRefComplet() {
        return refComplet;
    }

    public void setRefComplet(String refComplet) {
        this.refComplet = refComplet;
    }

    public Boolean getProspect() {
        return prospect;
    }

    public void setProspect(Boolean prospect) {
        this.prospect = prospect;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdPdvClient() {
        return idPdvClient;
    }

    public void setIdPdvClient(Integer idPdvClient) {
        this.idPdvClient = idPdvClient;
    }

    public List<RH_ODM> getOrdresDeMissions() {
        return ordresDeMissions;
    }

    public void setOrdresDeMissions(List<RH_ODM> ordresDeMissions) {
        this.ordresDeMissions = ordresDeMissions;
    }




}
