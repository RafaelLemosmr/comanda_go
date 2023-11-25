package com.fatec.ComandaGO.model.repository;

import com.fatec.ComandaGO.model.entity.Comanda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComandaRepository extends JpaRepository<Comanda, Long> {
}
