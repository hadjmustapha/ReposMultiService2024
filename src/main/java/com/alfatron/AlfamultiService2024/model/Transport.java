package com.alfatron.AlfamultiService2024.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "RH_ODM_TRANSPORT")
@Getter
@Setter
@NoArgsConstructor
public class Transport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    int id;

    @Column(name = "LIBELLE",length = 100)
    String libelle	;

    public Transport(String libelle){
        this.libelle=libelle;
    }
}
