package com.springsecurity.payloads.requests;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Created 18/05/2021 - 11:40
 * @Package com.springsecurity.payloads.requests
 * @Project springsecurity
 * @User LegendDZ
 * @Author Abdelaaziz Ouakala
 **/
@Data
@Getter
@Setter
public class JwtLogin {
    private String username;
    private String password;
}
