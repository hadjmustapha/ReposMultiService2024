package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.UtilisateurDto;
import com.alfatron.AlfamultiService2024.exception.Custom_EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.RoleMapper;
import com.alfatron.AlfamultiService2024.mapper.UtilisateurMapper;
import com.alfatron.AlfamultiService2024.model.Utilisateur;
import com.alfatron.AlfamultiService2024.model.UtilisateurRole;
import com.alfatron.AlfamultiService2024.repository.UtilisateurRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UtilisateurService {

    private UtilisateurRepository utilisateurRepository;
    private UtilisateurMapper utilisateurMapper;
    private RoleMapper roleMapper;

    public UtilisateurService(UtilisateurRepository utilisateurRepository,UtilisateurMapper utilisateurMapper,RoleMapper roleMapper) {
        this.utilisateurRepository = utilisateurRepository;
        this.utilisateurMapper=utilisateurMapper;
        this.roleMapper = roleMapper;
    }

    public List<UtilisateurDto> findAllUtilisateurs(){
        return utilisateurRepository.findAll()
                .stream()
                .map(utilisateurMapper::toUtilisateurDto)
                .collect(Collectors.toList());
    }

    public UtilisateurDto findUtilisateur_withRoles_ById(Integer id){
        Utilisateur utilisateur = utilisateurRepository.findById(id)
                //.map(utilisateurMapper::toUtilisateurDto)
                .orElseThrow(()->new Custom_EntityNotFoundException("Aucun user trouvé avec id : "+id, ErrorCodes.USER_NOT_FOUND));

        UtilisateurDto utilisateurDto = ListRolesUser_toListRolesUserDto(utilisateur);

        return utilisateurDto;
    }

    public UtilisateurDto filtreRolesParUsername (String username){
        Sort sort = Sort.by(Sort.Direction.DESC,"id");
        Utilisateur utilisateur = utilisateurRepository.filtreParUsername(username,sort)
                //.map(utilisateurMapper::toUtilisateurDto)
                .orElseThrow(()->new Custom_EntityNotFoundException("Aucun user trouvé avec username : "+username, ErrorCodes.USER_NOT_FOUND));
        UtilisateurDto utilisateurDto = ListRolesUser_toListRolesUserDto(utilisateur);
        return utilisateurDto;
    }

    public UtilisateurDto ListRolesUser_toListRolesUserDto(Utilisateur utilisateur){
        UtilisateurDto utilisateurDto = utilisateurMapper.toUtilisateurDto(utilisateur);
        for (UtilisateurRole UserRole : utilisateur.getRoles()) {
            if(UserRole.getRole()!=null){
                utilisateurDto.getRoleDtos().add(UserRole.getRole().getRole());
            }
        }
        return utilisateurDto;
    }

}
