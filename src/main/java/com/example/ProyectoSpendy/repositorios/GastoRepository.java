package com.example.ProyectoSpendy.repositorios;

import com.example.ProyectoSpendy.modelos.Gasto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GastoRepository extends JpaRepository<Gasto, Long> {
}