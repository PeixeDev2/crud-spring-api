package com.daniel.crud_spring.controller;


import com.daniel.crud_spring.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControleer {
    private final UsuarioRepository usuarioRepository;
    public UsuarioControleer(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    @GetMapping
    public Object listar() {
        return usuarioRepository.findAll();
    }
}
