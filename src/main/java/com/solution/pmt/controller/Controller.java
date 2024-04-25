package com.solution.pmt.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//@RestController // controller + responseBody
@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String mainLayout(){
        return "main/Main";
    }

    @GetMapping("/404")
    public String error(Model model){
        return "404";
    }

}
