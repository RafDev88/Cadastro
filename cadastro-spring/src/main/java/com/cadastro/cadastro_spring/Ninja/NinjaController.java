package com.cadastro.cadastro_spring.Ninja;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class NinjaController {
    @GetMapping ("/boasvindas")
    public String boaVindas(){
        return "Esssa e a minha primeira mensagem";
    }
}
