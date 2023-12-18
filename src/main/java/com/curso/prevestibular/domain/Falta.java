package com.curso.prevestibular.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Falta {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        private Aluno aluno;

        @ManyToOne
        private Curso curso;

        private int quantidadeFaltas;

}
