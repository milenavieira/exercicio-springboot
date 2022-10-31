package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //mapeamento feito pelo spring
public class PrimeiroController {

    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping(path = { "/ola", "/saudacao" })
    public String ola() {
        return "Olá Spring Boot!";
    }


}
