package com.hada.hadaConstruction.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
public class SampleController {

    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("say", "Hello");
        model.addAttribute("say2", "ByeBye");
        return "test";
    }

    @GetMapping("/test2")
    public String test2(Model model) {
        model.addAttribute("company", "회사소개");
        model.addAttribute("ok", "Okay");
        return "linkTest";
    }

    @GetMapping("/test3")
    public String test3(Model model) {
        model.addAttribute("example", "시공사례");
        model.addAttribute("ok", "Okay");
        return "linkTest";
    }

    @GetMapping("/test4")
    public String test4(Model model) {
        model.addAttribute("ok", "Okay");
        model.addAttribute("contact", "Contact");
        return "linkTest";
    }

    @GetMapping("/test5")
    public String test5(Model model) {
        model.addAttribute("online", "온라인 견적 문의");
        model.addAttribute("ok", "Okay");
        return "linkTest";
    }
}
