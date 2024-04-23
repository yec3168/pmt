package com.solution.pmt.entity;

import com.solution.pmt.dto.MemberFormDto;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 의미 없는 객체의 생성 제한.
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    /* form에서 받아올 것*/
    private String name;
    private String department_id; //부서명
    private String rank;
    private String address;
    private String phone;

    private String email;
    private String password;

    private LocalDateTime hireDate; //입사일
    private LocalDateTime retireDate; // 퇴사일

    private String photo;
    private String url;

    private int annual; // 연차

    @Builder
    public Member(MemberFormDto memberFormDto){
        this.name = memberFormDto.getName();
        this.address = memberFormDto.getAddress();
        this.phone = memberFormDto.getPhone();
        this.email = memberFormDto.getEmail();
        this.password = memberFormDto.getPassword();
    }

}
