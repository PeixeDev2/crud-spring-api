package com.daniel.crud_spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControleer {

    @GetMapping
    public String listar() {
        return "Funcionando!";
    }
}
