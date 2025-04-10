package com.github.acnaweb.study_apir.repository;

import com.github.acnaweb.study_apir.model.Itens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItensRepository extends JpaRepository<Itens, Long> {
}
