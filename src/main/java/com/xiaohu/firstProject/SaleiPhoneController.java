package com.xiaohu.firstProject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaleiPhoneController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/helloworld")
    public String helloWorld() {
        return "helloworld";
    }

    @RequestMapping("/buy/phone")
    public String buyPhone(int number) {
        String phoneWord = "phone";
        String predicateWord = "is";
        if (number > 1) {
            phoneWord = "phones";
            predicateWord = "are";
        }
        return "Here " + predicateWord + " your new " + phoneWord + ", thanks and look farwad your coming next time";
    }
}
