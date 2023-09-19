package com.alfatron.AlfamultiService2024.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "SYS_ROLE")
@Getter
@Setter
@NoArgsConstructor
public class Role {

    @Id
    @Column(name = "ROLE",length = 50)
    String role;

    @Column(name = "LIBELLE",length = 100)
    String libelle;

}
