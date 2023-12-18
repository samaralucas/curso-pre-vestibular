package com.curso.prevestibular.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Mensalidade {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "aluno_id", referencedColumnName = "id")
        private Aluno aluno;

        @ManyToOne
        @JoinColumn(name = "curso_id", referencedColumnName = "id")
        private Curso curso;

        private double valorPago;

}
