package com.springboot.DevelCode.controllers;

import java.util.List;
import java.util.Optional;

import com.springboot.DevelCode.model.Usuario;
import com.springboot.DevelCode.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    
    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping("/")
    public Usuario criar(@RequestBody Usuario usuario) {
        return this.usuarioRepository.save(usuario);
    }

    @GetMapping("/")
    public List<Usuario> listar() {
        return this.usuarioRepository.findAll();
    }

    @PutMapping("/{id}")
    public Usuario editar(@PathVariable Long id, @RequestBody Usuario usuarioEditado) {
        Optional<Usuario> usuarioFind = this.usuarioRepository.findById(id);
        
        if(usuarioFind.isPresent()) {
            usuarioEditado.setId(id);
            return this.usuarioRepository.save(usuarioEditado);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        this.usuarioRepository.deleteById(id);
        return;
    }
}
