package com.example.ProyectoSpendy.modelos;

import jakarta.persistence.*; // Importa todas las herramientas de JPA

@Entity
@Table(name = "gastos") // Define el nombre de la tabla en la Bd
public class Gasto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera el ID automáticamente
    private Long id;
    private String descripcion;   //descripción del gasto correspondiente
    private String fecha; // fecha en que se realiza el ggasto
    private Double valor; // lo que cuesta cada ggasto
    private String icono;  // el icono correspondiente a cada gasto que realiza
    private String categoria;  // Para saber si es comida, transporte, etc
    private String metodoPago; //Para saber si fue efectivo, tarjeta, etc.
    private Boolean esNecesario;//  Para diferenciar gastos obligatorios de "antojos" si o no.
    private String comercio; //Nombre del lugar donde se hizo el gasto.
    private String ubicacion; // ubicación real donde se realizó.

    // Constructor Vacío
    public Gasto() {}

    // Constructor con parámetros
    public Gasto(Long id, String descripcion, String fecha, Double valor, String icono, String categoria, String metodoPago, Boolean esNecesario, String comercio, String ubicacion) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.valor = valor;
        this.icono = icono;
        this.categoria = categoria;
        this.metodoPago = metodoPago;
        this.esNecesario = esNecesario;
        this.comercio = comercio;
        this.ubicacion = ubicacion;
    }

    //getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Boolean getEsNecesario() {
        return esNecesario;
    }

    public void setEsNecesario(Boolean esNecesario) {
        this.esNecesario = esNecesario;
    }

    public String getComercio() {
        return comercio;
    }

    public void setComercio(String comercio) {
        this.comercio = comercio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }


}