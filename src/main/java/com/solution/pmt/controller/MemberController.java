package com.solution.pmt.controller;

import com.solution.pmt.dto.MemberFormDto;
import jakarta.validation.Valid;
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
    // 로그인
    @GetMapping("/login")
    public String login(){
        return "member/Login";
    }

    // 회원가입
    @GetMapping("/create")
    public String signUp(Model model){
        model.addAttribute("memberFormDto", new MemberFormDto());
        return "member/Register";
    }

    @PostMapping("/create")
    public String signU(@Valid MemberFormDto memberFormDto,
//                        @RequestParam("photoFile") MultipartFile photoFile,
                        Model model){
        System.out.println("memberFormDto.getName() = " + memberFormDto.getName());
//        if(photoFile.isEmpty()){
//            System.out.println("비어있음.");
//        }

        return "redirect:/";
    }
    
}
