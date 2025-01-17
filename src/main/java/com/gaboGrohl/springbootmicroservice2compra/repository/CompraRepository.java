package com.gaboGrohl.springbootmicroservice2compra.repository;

import com.gaboGrohl.springbootmicroservice2compra.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompraRepository extends JpaRepository<Compra, Long> {
    List<Compra> findAllByUserId(Long userId);
}
