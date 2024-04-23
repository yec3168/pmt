package com.solution.pmt.dto;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberFormDto {

    private String name;
    private String address;
    private String phone;
    private String email;
    private String password;
    private String photo;
    private String url;




}
