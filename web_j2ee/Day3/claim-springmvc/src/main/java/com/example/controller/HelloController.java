package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class HelloController {


    @RequestMapping("/userclaim")
    public ModelAndView additionOfTwoNumbers(HttpServletRequest request, HttpServletResponse response) {
        String email = request.getParameter("text1");
        String claim = request.getParameter("text2");
        AddServices services = new AddServices();
        String result = services.claimUser(email, claim);
        ModelAndView mv = new ModelAndView("display");
        mv.addObject("display", result);
        return mv;
    }
}
