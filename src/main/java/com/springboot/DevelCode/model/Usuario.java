package com.springboot.DevelCode.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long codigo;
    private String nome;
    private Date dataNascimento;
    private String foto;
    
}
