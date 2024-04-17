package com.solution.pmt.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberFormDto {

    private String name;

    private String nickName;

    private String email;

    private String password;

    private String phone;

    private String address;

    private String fileName;

    private String url;

}
