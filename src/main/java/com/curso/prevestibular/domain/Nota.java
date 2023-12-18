package com.curso.prevestibular.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table
@Data
public class Nota {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        private Aluno aluno;

        @ManyToOne
        private Curso curso;

        @ManyToOne
        private Professor professor;

        @Temporal(TemporalType.TIMESTAMP)
        @Column(name = "datalancamento")
        private Date dataLancamento;

        @PrePersist
        protected void onCreate() {
            dataLancamento = new Date();
        }

        private double nota;

}
