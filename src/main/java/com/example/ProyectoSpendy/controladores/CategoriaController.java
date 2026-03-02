package com.example.ProyectoSpendy.controladores;

import com.example.ProyectoSpendy.modelos.Categoria;
import com.example.ProyectoSpendy.repositorios.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
@CrossOrigin(origins = "*") // Permite que React (5173 o 5174) se conecte sin problemas
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    // 1. Obtener todas las categorías (Para llenar los select y ver los topes)
    @GetMapping
    public List<Categoria> listarTodas() {
        return categoriaRepository.findAll();
    }

    // 2. Guardar una nueva categoría (Opcional, por si quieres crearlas desde el frontend)
    @PostMapping
    public Categoria guardar(@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    // 3. Buscar una categoría por ID
    @GetMapping("/{id}")
    public Categoria buscarPorId(@PathVariable Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }
}