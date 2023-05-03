package com.shop.dto;

import com.shop.constant.Role;
import com.shop.entity.Member;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
public class MemberFormDto {

    private String name;
    private String email;
    private String password;
    private String address;

    @Enumerated(EnumType.STRING)
    private Role role;



}
