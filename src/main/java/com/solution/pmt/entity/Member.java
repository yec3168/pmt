package com.solution.pmt.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
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

}
