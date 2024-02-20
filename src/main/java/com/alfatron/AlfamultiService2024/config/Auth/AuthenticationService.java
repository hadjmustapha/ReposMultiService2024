package com.alfatron.AlfamultiService2024.config.Auth;

import com.alfatron.AlfamultiService2024.dto.AuthenticationRequest;
import com.alfatron.AlfamultiService2024.dto.AuthenticationResponse;
import com.alfatron.AlfamultiService2024.repository.SYS_LOGIN_Repository;
import com.alfatron.AlfamultiService2024.service.SYS_LOGIN_Service;
import lombok.RequiredArgsConstructor;
import org.jfree.util.Log;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final SYS_LOGIN_Repository utilisateurRepository;

    private final SYS_LOGIN_Service utilisateurService;

    private final PasswordEncoder passwordEncoder;

    private final AuthenticationManager authenticationManager;

    private final JwtService jwtService;

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        System.out.println("------------------------------AuthenticationService :  authenticate()--------------------");
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(),request.getPassword()));
            System.out.println("------------------------------AuthenticationService :   authenticationManager.authenticate()---> UsernamePasswordAuthenticationToken--------------------");
        }catch (Exception e){
            System.out.println("mon exception *******************************"+e.getMessage());
            Log.error("--------------------------------------------------------------------"+e.getMessage());
        }

        var user = utilisateurService.filtreRolesParUsername(request.getUsername());

        //user.setPassword(passwordEncoder.encode(user.getPassword()));

        var jwtToken = jwtService.generateToken(user);
        var refreshToken = jwtService.generateRefreshToken(new HashMap<>(),user);

        AuthenticationResponse authenticationResponse = new AuthenticationResponse();
        authenticationResponse.setAccessToken(jwtToken);
        authenticationResponse.setRefreshToken(refreshToken);
        return authenticationResponse;
    }
/*
    public AuthenticationResponse register(RegisterRequest request) {
        var user = Utilisateur.builder()
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .build();
        // manque save user via repository
        var user = utilisateurService
                .filtreRolesParUsername(request.getUsername());
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder().accessToken(jwtToken).build();
    }

 */

}
