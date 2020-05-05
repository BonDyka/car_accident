package ru.job4j.police.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.job4j.police.model.Accident;
import ru.job4j.police.service.AccidentService;

@Controller
public class IndexController {
    private AccidentService accidentService;

    public IndexController(AccidentService accidentService) {
        this.accidentService = accidentService;
    }

    @GetMapping
    public String showList(ModelMap model) {
        model.addAttribute("listAccident", this.accidentService.findAll());
        return "index";
    }

    @PostMapping("/accident")
    public String addOne(@ModelAttribute Accident accident) {
        this.accidentService.save(accident);
        return "redirect:/";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
