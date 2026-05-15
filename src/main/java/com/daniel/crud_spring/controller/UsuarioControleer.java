package com.daniel.crud_spring.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.daniel.crud_spring.model.Usuario;
import com.daniel.crud_spring.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
    @PostMapping
    public Usuario cadastrar(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Long id) {

        usuarioRepository.deleteById(id);

        return "Usuário deletado!";
    }
}
