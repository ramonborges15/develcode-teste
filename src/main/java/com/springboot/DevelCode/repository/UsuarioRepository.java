package com.springboot.DevelCode.repository;

import java.util.Optional;

import com.springboot.DevelCode.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
    public void deleteById(Long id);
}
