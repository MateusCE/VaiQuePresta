package com.example.enviando.email.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    @GetMapping("/exemplo")
    public String exemploGet() {
        return "Olá, mundo! Este é um exemplo de resposta para uma requisição GET.";
    }
    @GetMapping("/teste")
    public String teste(){
        return "MEU PÊNIS";
    }
}


