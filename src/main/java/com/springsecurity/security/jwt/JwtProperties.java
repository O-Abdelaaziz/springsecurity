package com.springsecurity.security.jwt;

/**
 * @Created 18/05/2021 - 11:50
 * @Package com.springsecurity.security.jwt
 * @Project springsecurity
 * @User LegendDZ
 * @Author Abdelaaziz Ouakala
 **/
public class JwtProperties {
    public static final String SECRET = "3ecd1ef0-b7c7-11eb-8529-0242ac130003";
    public static final int EXPIRATION_TIME = 864_000_000; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
}
