package com.curso.prevestibular.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", unique = true, nullable = false)
    private String nome;

    private Date dataInicio;

    private Date dataFim;

    private double valorMensalidade;

    private double valorMatricula;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datacadastro")
    private Date dataCadastro;

    @PrePersist
    protected void onCreate() {
        dataCadastro = new Date();
    }
}
