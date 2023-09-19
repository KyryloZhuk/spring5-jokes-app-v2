package com.kjcode.chucknorrisjokes.service;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokesService {

    ChuckNorrisQuotes chuckNorrisQuotes;

    public String getRandomQuote(){
        return "test";
    }
}
