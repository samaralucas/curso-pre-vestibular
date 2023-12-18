package com.curso.prevestibular.repository;

import com.curso.prevestibular.domain.ResponsavelFinanceiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsavelFinanceiroRepository extends JpaRepository<ResponsavelFinanceiro, Long> {
}
