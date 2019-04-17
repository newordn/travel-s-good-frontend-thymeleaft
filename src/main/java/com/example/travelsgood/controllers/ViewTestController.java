package com.example.travelsgood.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Neword on 14/04/2019.
 */
@Controller
@RequestMapping("test/view")
public class ViewTestController {

    @GetMapping("/home")
    public  String home()
    {
        return "index";
    }


    @GetMapping("/signin")
    public  String signIn()
    {
        return "signin";
    }



    @GetMapping("/signup")
    public  String signUp()
    {
        return "signup";
    }

}
