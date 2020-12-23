package com.example.testspring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UserTestController {

    @GetMapping("/users")
    public String getUserList(Model model) {

        List<User> users = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            users.add(new User("kkaok" + i, "테스트" + i, "web"));
        }

        User user = new User("테스트ID", "테스터", "web");
        model.addAttribute("user", user);
        model.addAttribute("users", users);
        model.addAttribute("today", new Date());
        model.addAttribute("content", "<div><span style='font-size:20px'>Hello World</span></div>");
        return "users";
    }

    @GetMapping("/users/{userId}")
    public String getUserList(@PathVariable String userId,
                              User pUser,
                              HttpSession session,
                              Model model) {
        session.setAttribute("userId", pUser.getUserId());

        pUser.setName("테스터");
        pUser.setAuthType("facebook");
        System.out.println(pUser.toString());

        model.addAttribute("user", pUser);
        return "user";
    }

}