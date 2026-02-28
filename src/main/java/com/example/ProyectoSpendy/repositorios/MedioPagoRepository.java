package com.example.ProyectoSpendy.repositorios;

import com.example.ProyectoSpendy.modelos.MedioPago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedioPagoRepository extends JpaRepository<MedioPago, Long> {
}