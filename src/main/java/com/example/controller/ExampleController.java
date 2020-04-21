package com.example.controller;

import com.example.model.Member;
import com.example.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

@RestController
public class ExampleController {

    @Autowired
    MemberService memberService;

    @GetMapping("/example")
    public HashMap loginPage(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {
        HashMap result = new HashMap();
        result.put("message", "안녕하세요!!!!");
        return result;

    }

    @PostMapping("/registMember")
    public String registMember(@RequestBody Member member) throws Exception {

        if(member != null){
            memberService.registMember(member);
        }

        return "example";
    }

}
