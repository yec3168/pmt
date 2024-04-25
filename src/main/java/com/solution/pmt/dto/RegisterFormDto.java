package com.solution.pmt.dto;

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
    private String photo;
    private String url;

//
//    public MemberFormDto(String name, String address, String phone,
//                         String email, String password, String photo, String url){
//        this.name = name;
//        this.address = address;
//        this.phone = phone;
//        this.email = email;
//        this.password = password;
//        this.photo =photo;
//        this.url =url;
//    }
//
//    public MemberFormDto toDto(String name, String address, String phone,
//                         String email, String password, String photo, String url){
//        MemberFormDto memberFormDto = MemberFormDto.builder()
//                .name(name)
//                .address(address)
//                .phone(phone)
//                .email(email)
//                .password(password)
//                .photo(photo)
//                .url(url)
//                .build();
//
//        return memberFormDto;
//    }


}
