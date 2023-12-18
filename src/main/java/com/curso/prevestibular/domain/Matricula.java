package com.curso.prevestibular.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "matricula")
@Data
public class Matricula {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @ManyToOne
        @JoinColumn(name = "aluno_id", referencedColumnName = "id")
        private Aluno aluno;

        @ManyToOne
        @JoinColumn(name = "curso_id", referencedColumnName = "id")
        private Curso curso;

        @ManyToMany
        @JoinTable(
                name = "matricula_professor",
                joinColumns = @JoinColumn(name = "matricula_id"),
                inverseJoinColumns = {
                        @JoinColumn(name = "professor_id"),
                }
        )
        private List<Professor> professores = new ArrayList<>();

        private Date dataMatricula;

        private Date dataCancelamento;

        private double valorMatricula;

        private double valorMensalidade;

}
