package com.solution.pmt.entity;

import com.solution.pmt.dto.RegisterFormDto;
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
    private String address;
    private String phone;
    private String email;
    private String password;
    private String photo;
    private String url;

    /*admin만 수정 가능.*/
    private LocalDateTime hireDate; //입사일  // admin만 수정
    private LocalDateTime retireDate; // 퇴사일
    private String department_name; //부서명 (솔루션사업부, erp사업부, si사업부, 경영지원실, 교육사업부...)
    private String rank; // 사장, 전무, 상무, 이사, 부장, 차장, 과장, 대리 ,사원, 교육생.
    private int annual; // 연차



    @Builder
    public Member(String name, String address, String phone, String email, String password,
                  String photo, String url, String department_name, String rank,
                  LocalDateTime hireDate, LocalDateTime retireDate, int annual){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.photo = photo;
        this.url = url;
        this.department_name = department_name;
        this.rank = rank;
        this.hireDate = hireDate;
        this.retireDate = retireDate;
        this.annual = annual;
    }

}
