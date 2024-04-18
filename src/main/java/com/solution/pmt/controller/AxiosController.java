package com.solution.pmt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@RestController // controller + responseBody
@Controller
public class AxiosController {

    @GetMapping("/")
    public String mainLayout(){
        return "main/Main";
    }
}
