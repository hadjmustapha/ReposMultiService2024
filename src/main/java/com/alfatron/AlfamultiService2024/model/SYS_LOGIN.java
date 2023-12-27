package com.alfatron.AlfamultiService2024.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "SYS_LOGIN")
public class SYS_LOGIN {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Integer id;

    @Column(name = "USERNAME_cu", length = 100)
    String username;

    @Column(name = "PASSWORD_cu", length = 100)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    String password;

    @ManyToOne()
    @JoinColumn(name="ID_EMPLOYEE")
    @JsonIgnore
    ORG_EMPLOYEE employee;

    @Column(name = "ID_PDV")
    @Transient
    @JsonIgnore
    Integer idPdv;

    @Column(name="ACTIVE")
    Boolean active;

    @Column(name="EXPIRE")
    Boolean expire;

    @Column(name="EXPIRE_DATE")
    Date exprieDate;

    //
    @OneToMany(mappedBy = "utilisateur",fetch = FetchType.EAGER)
    @JsonIgnore
    private List<SYS_LOGIN_PROFIL> roles = new ArrayList<>();

    public SYS_LOGIN() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ORG_EMPLOYEE getEmployee() {
        return employee;
    }

    public void setEmployee(ORG_EMPLOYEE employee) {
        this.employee = employee;
    }

    public Integer getIdPdv() {
        return idPdv;
    }

    public void setIdPdv(Integer idPdv) {
        this.idPdv = idPdv;
    }

    public List<SYS_LOGIN_PROFIL> getRoles() {
        return roles;
    }
    public void setRoles(List<SYS_LOGIN_PROFIL> roles) {
        this.roles = roles;
    }

    public Boolean getActive() {
        return true;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getExpire() {
        return expire;
    }

    public void setExpire(Boolean expire) {
        this.expire = expire;
    }

    public Date getExprieDate() {
        return exprieDate;
    }

    public void setExprieDate(Date exprieDate) {
        this.exprieDate = exprieDate;
    }
}
