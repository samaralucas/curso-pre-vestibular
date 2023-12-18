package com.curso.prevestibular.repository;

import com.curso.prevestibular.domain.Falta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaltaRepository extends JpaRepository<Falta, Long> {
}
