package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
    @GetMapping("/member/save")
    public String saveForm(){
        return "save";
    }

    // postMapping : save.html의 <form> 메소드 : post => 정보 전달을 의미 하므로 postMapping으로 정보를 받아줌
    // RequestParam : save.html의 <input> name과 일치하게 작성한 후 파라미터로 정보를 받아 옴
    @PostMapping("/member/save")
    public String save(@RequestParam("memberEmail") String memberEmail,
                       @RequestParam("memberPassword") String memberPassword,
                       @RequestParam("memberName") String memberName){
        System.out.println("MemberController.save");
        System.out.println("MemberEmail = " + memberEmail + ", memberPassword = " + memberPassword + ", memberName = " + memberName);
        return "index";
    }
}
