package com.alfatron.AlfamultiService2024.config.Auth;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.function.Function;
import java.security.Key;
import java.util.Date;

@Service
public class JwtService {
    //13215166256156256251225258262622692962962595626959669549626296

    private static final String TOP_SECRET_KEY  = "c2VjcmV013215166256156256251225258262622692962962595626959669549626296";

    public String generateToken(UserDetails user){
        System.out.println("------------------------------JwtService : generateToken() --------------------------");
        return Jwts.builder()
                .setSubject(user.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis()+ 1000*60*5))
                .signWith(getSignKey(), SignatureAlgorithm.HS256)
                .compact()
                ;
    }

    public String generateRefreshToken(Map<String,Object> extractClaims,UserDetails userDetails){
        System.out.println("------------------------------JwtService : generateRefreshToken ()--------------------------");
        return Jwts.builder().setClaims(extractClaims)
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis()+ 604800000))
                .signWith(getSignKey(), SignatureAlgorithm.HS256)
                .compact()
                ;
    }

    private Key getSignKey(){
        System.out.println("------------------------------JwtService : getSignKey() --------------------------");
      byte[] key = Decoders.BASE64.decode(TOP_SECRET_KEY);
      return Keys.hmacShaKeyFor(key);
    }

    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        System.out.println("------------------------------JwtService : extractClaim() --------------------------");
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }

    private Claims extractAllClaims(String token) {
        System.out.println("------------------------------JwtService : extractAllClaims() --------------------------");
        return Jwts.parserBuilder()
                .setSigningKey(getSignKey()).build().parseClaimsJws(token).getBody();
    }

    public String extractUsername(String token) {
        System.out.println("------------------------------JwtService : extractUsername() --------------------------");
        return extractClaim(token,Claims::getSubject);
    }

    public boolean isTokenValid(String token, UserDetails userDetails) {
        System.out.println("------------------------------JwtService : isTokenValid() --------------------------");
        final String username = extractUsername(token);
        return (username.equals(userDetails.getUsername())) && !isTokenExpired(token);
    }

    private boolean isTokenExpired(String token) {
        System.out.println("------------------------------JwtService : isTokenExpired() --------------------------");
        return extractExpiration(token).before(new Date());
    }

    private Date extractExpiration(String token) {
        System.out.println("------------------------------JwtService : extractExpiration() --------------------------");
        return extractClaim(token, Claims::getExpiration);
    }

}
