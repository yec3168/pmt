package com.solution.pmt.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Mail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mail_id")
    public Long id;
    public String title; // 제목
    public String content; // 내용
    public String originFileName; // 원본 파일명.
    public String fileName; // 저장파일명
    public String url; // url
    public LocalDateTime fromDate; // 발신 시간.

    public String sender; // 발신자 이메일
    public LocalDateTime toDate; // 수신 시간.
}
