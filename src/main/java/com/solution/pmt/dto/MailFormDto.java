package com.solution.pmt.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class MailFormDto {
    public String title; // 제목
    public String content; // 내용
//    public String originFileName; // 원본 파일명.
//    public String fileName; // 파일명
//    public String url; // url
    public LocalDateTime fromDate; // 발신 시간.

    public String sender; // 발신자 이메일
    public LocalDateTime toDate; // 수신 시간.
}
