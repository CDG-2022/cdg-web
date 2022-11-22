package com.cdg.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@RestController
@Controller
class TestController {

    @GetMapping("/api/v1/cdg-names")
    public String gethome() {

        // 대충 디비랑 통신해서 로그인정보를 가져옴

        return "/test.html";
//        return "[ '최강훈', '이상훈' ]";
    }

}