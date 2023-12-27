package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.UtilisateurDto;
import com.alfatron.AlfamultiService2024.exception.Custom_EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.RoleMapper;
import com.alfatron.AlfamultiService2024.mapper.UtilisateurMapper;
import com.alfatron.AlfamultiService2024.model.SYS_LOGIN;
import com.alfatron.AlfamultiService2024.model.SYS_LOGIN_PROFIL;
import com.alfatron.AlfamultiService2024.repository.UtilisateurRepository;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import java.util.*;
import java.util.stream.Collectors;

@Service
public class UtilisateurService implements UserDetailsService{

    private UtilisateurRepository utilisateurRepository;
    private UtilisateurMapper utilisateurMapper;
    private RoleMapper roleMapper;
    private PasswordEncoder passwordEncoder;

    public UtilisateurService(UtilisateurRepository utilisateurRepository, UtilisateurMapper utilisateurMapper, RoleMapper roleMapper, PasswordEncoder passwordEncoder) {
        this.utilisateurRepository = utilisateurRepository;
        this.utilisateurMapper = utilisateurMapper;
        this.roleMapper = roleMapper;
        this.passwordEncoder = passwordEncoder;
    }

    public List<UtilisateurDto> findAllUtilisateurs(){
        return utilisateurRepository.findAll()
                .stream()
                .map(utilisateurMapper::toUtilisateurDto)
                .collect(Collectors.toList());
    }

    public UtilisateurDto findUtilisateur_withRoles_ById(Integer id){
        SYS_LOGIN utilisateur = utilisateurRepository.findById(id)
                //.map(utilisateurMapper::toUtilisateurDto)
                .orElseThrow(()->new Custom_EntityNotFoundException("Aucun user trouvé avec id : "+id, ErrorCodes.USER_NOT_FOUND));

        UtilisateurDto utilisateurDto = ListRolesUser_toListRolesUserDto(utilisateur);

        return utilisateurDto;
    }

    public UtilisateurDto filtreRolesParUsername (String username){
        System.out.println("--------------------UtilisateurService : filtreRolesParUsername()---------------------");
        Sort sort = Sort.by(Sort.Direction.DESC,"id");
        SYS_LOGIN utilisateur = utilisateurRepository.filtreParUsername(username,sort)
                //.map(utilisateurMapper::toUtilisateurDto)
                .orElseThrow(()->new Custom_EntityNotFoundException("Aucun user trouvé avec username : "+username, ErrorCodes.USER_NOT_FOUND));
        UtilisateurDto utilisateurDto = ListRolesUser_toListRolesUserDto(utilisateur);
        return utilisateurDto;
    }

    public UtilisateurDto ListRolesUser_toListRolesUserDto(SYS_LOGIN utilisateur){
        UtilisateurDto utilisateurDto = utilisateurMapper.toUtilisateurDto(utilisateur);
        try{
            utilisateur.getRoles();
        }catch (Exception e){
            System.out.println("-------------------------------------E X C E P T I O N 0--------"+e.getMessage());
        }

        try {
            System.out.println("utilisateur.getRoles() : "+utilisateur.getRoles().size());
        }catch (Exception e){
            System.out.println("-------------------------------------E X C E P T I O N 1--------"+e.getMessage());
        }


        for (SYS_LOGIN_PROFIL UserRole : utilisateur.getRoles()) {

            try {
                UserRole.getAlfaRole();
            }catch (Exception e){
                System.out.println("-------------------------------------E X C E P T I O N 2--------"+e.getMessage());
            }
            try {
                if(UserRole.getAlfaRole()!=null){
                    utilisateurDto.getRoleDtos().add(UserRole.getAlfaRole().getRole());
                }
            }catch (Exception e){
                System.out.println("-------------------------------------E X C E P T I O N 3--------"+e.getMessage());
            }

        }

        return utilisateurDto;
    }

    public SYS_LOGIN filtreRolesParUsername2(String username){
        return utilisateurRepository.findByUsername(username)
                .orElseThrow(()->new Custom_EntityNotFoundException("Aucun user trouvé avec username : "+username, ErrorCodes.USER_NOT_FOUND));

    }

    public SYS_LOGIN findUtilisateurById(Integer id){
        return utilisateurRepository.findById(id).get();
    }
/*
 commentaire a eviter
    public UserDetails loadUserByUsername(String username) throws Custom_EntityNotFoundException {
        return  filtreRolesParUsername(username);
    }
*/

/*
    public UserDetailsService userDetailsService(){
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                System.out.println("---------loadUserByUsername 1 -----");
                return filtreRolesParUsername(username);
            }
        };
    }


 */

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("------------------------------UtilisateurService :  loadUserByUsername () -----");
        return filtreRolesParUsername(username);
    }

    public SYS_LOGIN saveUtilisateur(SYS_LOGIN utilisateur){
        utilisateur.setPassword(passwordEncoder.encode(utilisateur.getPassword()));
        return utilisateurRepository.save(utilisateur);
    }


}
