package at.spengergasse.spring_thymeleaf.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping("/cars")
@RequiredArgsConstructor
public class HelloController {

    @GetMapping("")
    public String index() {
        return "index";
    }
}
