package com.example.ProyectoSpendy.controladores;

import com.example.ProyectoSpendy.modelos.Gasto;
import com.example.ProyectoSpendy.repositorios.GastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gastos")
@CrossOrigin(origins = "*") // Permite que React se conecte
public class GastoController {

    @Autowired
    private GastoRepository gastoRepository;

    // Obtener todos los gastos
    @GetMapping
    public List<Gasto> listarGastos() {
        return gastoRepository.findAll();
    }

    // Guardar un nuevo gasto (el que viene de tu formulario de React)
    @PostMapping
    public Gasto guardarGasto(@RequestBody Gasto gasto) {
        return gastoRepository.save(gasto);
    }
}