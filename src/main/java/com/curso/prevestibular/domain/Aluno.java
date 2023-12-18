package com.curso.prevestibular.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "aluno")
@Data
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String nome;

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
