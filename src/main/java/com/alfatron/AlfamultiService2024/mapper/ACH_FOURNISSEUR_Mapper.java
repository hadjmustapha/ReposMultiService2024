package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.FournisseurDto;
import com.alfatron.AlfamultiService2024.model.ACHAT.ACH_FOURNISSEUR;
import org.mapstruct.Mapper;

@Mapper
public interface ACH_FOURNISSEUR_Mapper {

    FournisseurDto toFournisseurDto(ACH_FOURNISSEUR fournisseur);

    ACH_FOURNISSEUR toFournisseur(FournisseurDto fournisseurDto);

}
