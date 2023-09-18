package com.alfatron.AlfamultiService2024.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "RH_NATURE_ODM")
@Getter
@Setter
@NoArgsConstructor
public class NatureMission{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    int id;

    @Column(name = "LIBELLE", length = 100)
    String libelle;

    @Column(name = "COMPTE_6")
    int compte6;

    public NatureMission(String libelle, int compte6) {
        this.libelle = libelle;
        this.compte6 = compte6;
    }
}
