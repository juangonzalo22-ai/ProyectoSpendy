package com.example.ProyectoSpendy.modelos;

import jakarta.persistence.*; // Importación necesaria para JPA

@Entity
@Table(name = "comercios")
public class Comercio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String nit;  // id. tributaria de la empresa o comercio
     private String nombre;
     private String actividad;  // actividad que se desarrolla en al entidad
     private String correo;  // correo del comercio
     private String direccionComercio;
     private Boolean esFrecuente;// indica la frecuencia con el que usuario va a ese comercio
     private String rangoPrecios;  //indica el rango de precios correspondiente a lo que el usuario compra
     private String metodoPago;  //ya sea tarjeta, transferencia, cash, etc.
     private String telefonoContacto; //el numero de contacto del comercio

    // constructor vacio
    public Comercio() {}

    // constructor con parametros
    public Comercio(Long id, String nit, String nombre, String actividad, String correo, String direccionComercio, Boolean esFrecuente, String rangoPrecios, String metodoPago, String telefonoContacto) {
        this.id = id;
        this.nit = nit;
        this.nombre = nombre;
        this.actividad = actividad;
        this.correo = correo;
        this.direccionComercio = direccionComercio;
        this.esFrecuente = esFrecuente;
        this.rangoPrecios = rangoPrecios;
        this.metodoPago = metodoPago;
        this.telefonoContacto = telefonoContacto;
    }
    //getters y setters
    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccionComercio() {
        return direccionComercio;
    }

    public void setDireccionComercio(String direccionComercio) {
        this.direccionComercio = direccionComercio;
    }

    public Boolean getEsFrecuente() {
        return esFrecuente;
    }

    public void setEsFrecuente(Boolean esFrecuente) {
        this.esFrecuente = esFrecuente;
    }

    public String getRangoPrecios() {
        return rangoPrecios;
    }

    public void setRangoPrecios(String rangoPrecios) {
        this.rangoPrecios = rangoPrecios;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }
}