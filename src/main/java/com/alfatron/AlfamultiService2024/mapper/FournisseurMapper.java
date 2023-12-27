package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.FournisseurDto;
import com.alfatron.AlfamultiService2024.model.ACH_FOURNISSEUR;
import org.mapstruct.Mapper;

@Mapper
public interface FournisseurMapper {

    FournisseurDto toFournisseurDto(ACH_FOURNISSEUR fournisseur);

    ACH_FOURNISSEUR toFournisseur(FournisseurDto fournisseurDto);

}
