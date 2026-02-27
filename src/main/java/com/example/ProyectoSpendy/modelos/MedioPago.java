package com.example.ProyectoSpendy.modelos;

public class MedioPago {
    private Long id;
    private String nombre;
    private String franquicia;
    private Boolean activo;
    private String cuentaEncriptada;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(String franquicia) {
        this.franquicia = franquicia;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getCuentaEncriptada() {
        return cuentaEncriptada;
    }

    public void setCuentaEncriptada(String cuentaEncriptada) {
        this.cuentaEncriptada = cuentaEncriptada;
    }
}