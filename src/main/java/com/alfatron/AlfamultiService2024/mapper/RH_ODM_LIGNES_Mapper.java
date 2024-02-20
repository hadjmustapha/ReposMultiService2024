package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.RH_ODM_LIGNES_EDITION;
import com.alfatron.AlfamultiService2024.model.RH.RH_ODM_LIGNES;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface RH_ODM_LIGNES_Mapper {

    @Mapping(source = "idEdition",target = "id")
    @Mapping(source = "odmEdition",target = "odm.id")
    @Mapping(source = "rubriqueEdition",target = "rubrique.id")
    @Mapping(source = "montantUnitaireEdition",target = "montantUnitaire")
    @Mapping(source = "qteEdition",target = "qte")
    @Mapping(source = "montantTotalEdition",target = "montantTotal")
    @Mapping(source = "avanceEdition",target = "avance")
    @Mapping(source = "tauxAvanceEdition",target = "tauxAvance")
    @Mapping(source = "montantAvanceEdition",target = "montantAvance")
    @Mapping(source = "detailEdition",target = "detail")
    RH_ODM_LIGNES to_RH_ODM_LIGNES(RH_ODM_LIGNES_EDITION rh_odm_lignes_edition);

    @Mapping(source = "id",target = "idEdition")
    @Mapping(source = "odm.id",target = "odmEdition")
    @Mapping(source = "rubrique.id",target = "rubriqueEdition")
    @Mapping(source = "montantUnitaire",target = "montantUnitaireEdition")
    @Mapping(source = "qte",target = "qteEdition")
    @Mapping(source = "montantTotal",target = "montantTotalEdition")
    @Mapping(source = "avance",target = "avanceEdition")
    @Mapping(source = "tauxAvance",target = "tauxAvanceEdition")
    @Mapping(source = "montantAvance",target = "montantAvanceEdition")
    @Mapping(source = "detail",target = "detailEdition")
    RH_ODM_LIGNES_EDITION to_RH_ODM_LIGNES_EDITION(RH_ODM_LIGNES rh_odm_lignes);
}
