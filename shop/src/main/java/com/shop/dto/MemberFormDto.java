package com.shop.dto;

import com.shop.constant.Role;
import com.shop.entity.Member;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
/*validation
    @NotEmpty 널체크 및 문자열길이(0)검사
    @NotBlank 널체크 및 문자열길이(0)및 빈문자열(" ")검사
    @Length(min= ,max=) 최소 최대 길이 검사
    @Email 이메일형식검사
    @Max(숫자) @Min(숫자) - 지정값 대소검사
    @Null 널값인지 검사
    @NotNull 널이아닌지검사
 */
@Getter
@Setter
public class MemberFormDto {

    @NotBlank(message = "이름필수.")
    private String name;

    @NotEmpty(message = "이멜쓰셈")
    @Email(message = "@쓰셈ㅋㅋ")
    private String email;

    @NotEmpty(message = "비번치셈")
    @Length(min=8,max = 16,message = "비밀번호 8~16자리")
    private String password;

    @NotEmpty(message = "주소 ㅇㄷ")
    private String address;

//    @Enumerated(EnumType.STRING)
//    private Role role;

}
