package com.alfatron.AlfamultiService2024.config.Auth;

import com.alfatron.AlfamultiService2024.dto.UtilisateurDto;
import com.alfatron.AlfamultiService2024.service.UtilisateurService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final JwtService jwtService;
    private final UtilisateurService utilisateurService;
    //private final UserDetailsService userDetailsService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        if (request.getServletPath().contains("/MultiService2024/v1/auth/authenticate")) {
            System.out.println("------------------------------si il s'agit d'une authentification alors tu passe au filtre suivant --------------------------");
            filterChain.doFilter(request, response);
            return;
        }

        System.out.println("------------------------------JwtAuthenticationFilter :  doFilterInternal() --------------------------");
        final String authHeader = request.getHeader("Authorization");
        final String jwt;
        final String userName;

        if(authHeader == null || !authHeader.startsWith("Bearer ")){
        System.out.println("------------------------------JwtAuthenticationFilter :  doFilterInternal()  : pas de bearer tu passe au filtre suivant  --------------------------");
            filterChain.doFilter(request,response);
            return ;
        }

        jwt = authHeader.substring(7);
        userName = jwtService.extractUsername(jwt);

        if (userName != null && SecurityContextHolder.getContext().getAuthentication() == null) {
           UserDetails userDetails = utilisateurService.loadUserByUsername(userName);
            //UserDetails userDetails = utilisateurService.userDetailsService().loadUserByUsername(userName);
            //UserDetails userDetails = userDetailsService.loadUserByUsername(userName);
        try {
            if(jwtService.isTokenValid(jwt,userDetails)){
                //SecurityContext securityContext = SecurityContextHolder.createEmptyContext();
                System.out.println("------------------------------JwtAuthenticationFilter : le token est valide donc : creation de object : UsernamePasswordAuthenticationToken--------------------");
                UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(
                        userDetails,null,userDetails.getAuthorities()
                );

                authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                System.out.println("------------------------------JwtAuthenticationFilter : passassion de object : UsernamePasswordAuthenticationToken a security context holder------------------------------");
                SecurityContextHolder.getContext().setAuthentication(authToken);
                //securityContext.setAuthentication(authToken);
                //SecurityContextHolder.setContext(securityContext);
            }
        }catch (Exception e){
            System.out.println("MS 2024 : le Token n'est pas valide");
        }


        }
        filterChain.doFilter(request,response);

    }


}
