package com.kjcode.chucknorrisjokes.controller;

import com.kjcode.chucknorrisjokes.service.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "joke")
public class ChuckNorrisJokesController {

    private JokesService jokesService;

    @Autowired
    public ChuckNorrisJokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @GetMapping
    public ResponseEntity<Object> getRandomJoke(){
        return new ResponseEntity(jokesService.getJoke(), HttpStatus.OK);
    }
}


