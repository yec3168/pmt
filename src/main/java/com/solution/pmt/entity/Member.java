package com.solution.pmt.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Member extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    private String name;

    private String nickName;

    private String email;

    private String password;

    private String phone;

    private String address;

    private String fileName; // 대표이미지.

    private String url;

    private String position; // 직급

    private String during; // 장기근무.

    private int rest; // 휴가.

}
