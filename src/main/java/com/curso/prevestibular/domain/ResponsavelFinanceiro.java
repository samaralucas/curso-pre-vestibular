package com.curso.prevestibular.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table
public class ResponsavelFinanceiro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(name = "cpf", unique = true, nullable = false)
    private String cpf;

    private Date dataNascimento;

    @Embedded
    private Endereco endereco;

    private String telefone;

    private String email;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datacadastro")
    private Date dataCadastro;

    @PrePersist
    protected void onCreate() {
        dataCadastro = new Date();
    }
}
