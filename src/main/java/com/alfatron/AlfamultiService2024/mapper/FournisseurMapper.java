package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.FournisseurDto;
import com.alfatron.AlfamultiService2024.model.Fournisseur;
import org.mapstruct.Mapper;

@Mapper
public interface FournisseurMapper {

    FournisseurDto toFournisseurDto(Fournisseur fournisseur);

    Fournisseur toFournisseur(FournisseurDto fournisseurDto);

}
