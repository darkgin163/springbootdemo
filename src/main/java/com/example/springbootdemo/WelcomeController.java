package com.example.springbootdemo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {

    @GetMapping ("")
    public ModelAndView welcome(){
        ModelAndView view = new ModelAndView();
        view.setViewName("welcome");
        return view;
    }
}
