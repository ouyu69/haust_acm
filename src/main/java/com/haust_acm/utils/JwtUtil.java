package com.haust_acm.utils;

import com.haust_acm.entity.po.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @FileName JwtUtil
 * @Description
 * @Author ouyu
 * @Date 2025-09-17
 **/
@Component
public class JwtUtil {
    private static final String SECRET = ProperUtils.getString("jwt.secret");
    private static final long EXPIRATION = 86400000; // 24小时

    public String generateToken(User user) {
        Date expirationDate = new Date(System.currentTimeMillis() + EXPIRATION);

        return Jwts.builder()
                .setSubject(user.getUserId().toString())
                .claim("email", user.getEmail())
                .claim("username", user.getUserName())
                .setExpiration(expirationDate)
                .signWith(SignatureAlgorithm.HS512, SECRET)
                .compact();
    }

    public Claims parseToken(String token) {
        try {
            return Jwts.parser()
                    .setSigningKey(SECRET)
                    .parseClaimsJws(token)
                    .getBody();
        } catch (Exception e) {
            return null;
        }
    }
}
