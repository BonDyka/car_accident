package ru.job4j.police.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.job4j.police.service.AccidentService;

@Controller
public class IndexController {
    private AccidentService accidentService;

    public IndexController(AccidentService accidentService) {
        this.accidentService = accidentService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showList(ModelMap model) {
        model.addAttribute("listAccident", this.accidentService.findAll());
        return "index";
    }
}
