package com.cadastro.cadastro_spring.Ninja;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")

public class NinjaController {
    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boaVindas() {
        return "Esssa e a minha primeira mensagem";
    }
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }
    @GetMapping("/listarID")
    public String mostrarTodosOsNinjasId() {
        return "Ninja criado";
    }
    @PutMapping("/alterarID")
    public String alterarNinjaPorId() {
        return "Alterar Ninja por Id";
    }
    @DeleteMapping("/deletarID")
    public String deletaNinjaPorId() {
        return "Deletar Ninja por ID";
    }
}