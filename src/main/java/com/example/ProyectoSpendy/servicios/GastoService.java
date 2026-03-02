package com.example.ProyectoSpendy.servicios;

import com.example.ProyectoSpendy.modelos.Gasto;
import com.example.ProyectoSpendy.repositorios.GastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GastoService {

    @Autowired
    private GastoRepository gastoRepository;

    public List<Gasto> listar() {
        return gastoRepository.findAll();
    }

    public Gasto guardar(Gasto gasto) {
        return gastoRepository.save(gasto);
    }

    public void eliminar(Long id) {
        gastoRepository.deleteById(id);
    }
}