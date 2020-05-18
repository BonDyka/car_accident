package ru.job4j.police.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.job4j.police.domain.Accident;
import ru.job4j.police.service.AccidentService;

@Controller
public class MainController {

    private AccidentService accidentService;

    @Autowired
    public MainController(AccidentService accidentService) {
        this.accidentService = accidentService;
    }

    @GetMapping
    public String main(Model model) {
        model.addAttribute("accidents", accidentService.findAll());
        return "main";
    }

    @PostMapping
    public String add(@RequestParam String name, @RequestParam String text, @RequestParam String address) {
        accidentService.save(new Accident(name, text, address));
        return "redirect:/";
    }
}
