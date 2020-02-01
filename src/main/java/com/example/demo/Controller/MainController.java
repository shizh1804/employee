package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {
    @RequestMapping("/index")
    public String  index(){
        return "/index";
    }
    @RequestMapping("/login")
    public String login(){
        return "/login";
    }
    @RequestMapping("/403")
    public String forbitten(){
        return "/403";
    }
}
