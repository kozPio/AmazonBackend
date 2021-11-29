package com.example.amazonbackend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(@RequestParam(name="name", required = false, defaultValue = "Ahmed") String name, Model model) {

        model.addAttribute(name);
        return "home";
    }
}
