package com.curso.prevestibular.repository;

import com.curso.prevestibular.domain.Mensalidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensalidadeRepository extends JpaRepository<Mensalidade, Long> {
}
