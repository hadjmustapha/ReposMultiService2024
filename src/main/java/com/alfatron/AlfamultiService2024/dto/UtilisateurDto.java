package com.alfatron.AlfamultiService2024.dto;

import jakarta.transaction.Transactional;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

public class UtilisateurDto implements UserDetails {

    String username;

    String password;

    Set<String> roleDtos = new HashSet<>();

    public UtilisateurDto() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRoleDtos() {
        return roleDtos;
    }

    public void setRoleDtos(Set<String> roleDtos) {
        this.roleDtos = roleDtos;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        System.out.println("------------------------------ UtilisateurDto : getAuthorities-------------------");
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        getRoleDtos().forEach(roleDto -> {
            authorities.add(new SimpleGrantedAuthority(roleDto));
        });
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }


}
