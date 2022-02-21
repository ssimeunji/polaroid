package com.project.polaroid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }

    @GetMapping("/main")
    public String main() {
        return "main";
    }

    @GetMapping("/board_detail")
    public String board_detail() {
        return "board_detail";
    }

    @GetMapping("/logout")
    public String logout() {
        return "index";
    }

    @GetMapping("/mypage")
    public String mypage() {
        return "mypage";
    }
}
