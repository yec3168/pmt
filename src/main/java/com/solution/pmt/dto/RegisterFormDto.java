package com.solution.pmt.dto;

import com.solution.pmt.entity.Member;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
//@Builder
public class RegisterFormDto {

    private String name;
    private String phone;
    private String address;
    private String email;
    private String password;

//
//    public MemberFormDto(String name, String address, String phone,
//                         String email, String password){
//        this.name = name;
//        this.address = address;
//        this.phone = phone;
//        this.email = email;
//        this.password = password;
//    }
//
//    public Member toEntity(){
//        return Member.builder()
//                .name(name)
//                .phone(phone)
//                .address(address)
//                .email(email)
//                .password(password)
//                .build();
//    }


}
