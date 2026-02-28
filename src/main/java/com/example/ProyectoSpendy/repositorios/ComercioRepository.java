package com.example.ProyectoSpendy.repositorios;

import com.example.ProyectoSpendy.modelos.Comercio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComercioRepository extends JpaRepository<Comercio, Long> {
}