package com.solution.pmt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {
    // 로그인
    @GetMapping("/login")
    public String login(){
        return "member/Login";
    }

    // 회원가입
    @GetMapping("/create")
    public String signUp(){
        return "member/Register";
    }

    //
    
    
}
