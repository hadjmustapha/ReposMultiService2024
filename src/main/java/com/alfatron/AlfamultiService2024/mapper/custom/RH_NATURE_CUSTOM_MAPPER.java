package com.alfatron.AlfamultiService2024.mapper.custom;

//@Mapper
public interface RH_NATURE_CUSTOM_MAPPER {

    //@Mapping(source = "nature",target = "id")
    //public RH_NATURE_ODM to_RH_NATURE_ODM(RH_ODM rh_odm);
    /*
    {
        if(natureDto == null){
            return null;
        }
        RH_NATURE_ODM natureMission = new RH_NATURE_ODM();
        natureMission.setId(natureDto);
        return natureMission;
    }
*/

   // @Mapping(source = "id",target = "nature",qualifiedByName = "checkThem")
   // public RH_ODM to_RH_ODM_dto(RH_NATURE_ODM natureMission);
    /*
    {
        if(natureMission == null){
            return null;
        }
        Integer natureDto = natureMission.getId();
      return natureDto;
    }

     */
/*
    @Named("checkThem")
    default Integer checkThem(Integer id){
        Integer nature;
        nature = id;
        return nature;
    }
*/
}
