package com.kjcode.chucknorrisjokes.controller;

import com.kjcode.chucknorrisjokes.service.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "joke")
public class JokesController {

    private JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @GetMapping
    public String getRandomJoke(Model model){
        model.addAttribute("joke", jokesService.getJoke());
        return "index";
    }
}


