package com.example.ProyectoSpendy.controladores;

import com.example.ProyectoSpendy.modelos.Gasto;
import com.example.ProyectoSpendy.servicios.GastoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gastos")
@CrossOrigin(origins = "*")
public class GastoController {

    @Autowired
    private GastoService gastoService;

    // Obtener todos los gastos
    @GetMapping
    public List<Gasto> listarGastos() {
        return gastoService.listar();
    }

    // Guardar un nuevo gasto
    @PostMapping
    public Gasto guardarGasto(@RequestBody Gasto gasto) {
        return gastoService.guardar(gasto);
    }
}