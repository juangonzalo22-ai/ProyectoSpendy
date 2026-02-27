package com.example.ProyectoSpendy.modelos;

public class Gasto {
     private Long id;
     private String nit;
     private String nombre;
     private String actividad;
     private String correo;
     private String direccionComercio; // dirección del comercio donde acude el usuario
     private Boolean esFrecuente; // indica si el cliente es frecuente en el comercio correspondiente
     private String rangoPrecios;   // determinar la cantidad de precios que hay en el comercio
     private String metodoPago;  // ya sea tarjeta, transferencia, efectivo,etc.
     private String telefonoContacto;  // el télefono donde pude contactar

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

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
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