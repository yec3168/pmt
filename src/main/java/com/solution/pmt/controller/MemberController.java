package com.solution.pmt.controller;

import com.solution.pmt.dto.RegisterFormDto;
import com.solution.pmt.entity.Member;
import com.solution.pmt.service.MemberService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    // 로그인
    @GetMapping("/login")
    public String login(){
        return "member/Login";
    }

    // 회원가입
    @GetMapping("/create")
    public String signUp(Model model){
        model.addAttribute("memberFormDto", new RegisterFormDto());
        return "member/Register";
    }

    @PostMapping("/create")
    public String signU(@Valid RegisterFormDto registerFormDto,
                        @RequestParam("photoFile") MultipartFile photoFile,
                        Model model){
        System.out.println("memberFormDto.getName() = " + registerFormDto.getName());

        Member user = memberService.save(registerFormDto, photoFile);
        if(user == null){
            return "redirect:/404.html";
        }
        return "redirect:/";
    }
    
}
