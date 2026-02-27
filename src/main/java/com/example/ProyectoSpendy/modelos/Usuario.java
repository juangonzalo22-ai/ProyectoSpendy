package com.example.ProyectoSpendy.modelos;

public class Usuario {
   private Long id;
   private String nombres;
   private String tipoDocumento;
   private String nroDocumento;
   private Integer edad;
   private String direccion;//su dirección de residencia
   private String celular;//su numero celular
   private String ultimoIngreso;  //la ultima vez que ingresó
   private String fotoPerfil;  //muestra su foto de perfil
   private String ciudadDomicilio;  //la ciudad en doonde vive


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getUltimoIngreso() {
        return ultimoIngreso;
    }

    public void setUltimoIngreso(String ultimoIngreso) {
        this.ultimoIngreso = ultimoIngreso;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getCiudadDomicilio() {
        return ciudadDomicilio;
    }

    public void setCiudadDomicilio(String ciudadDomicilio) {
        this.ciudadDomicilio = ciudadDomicilio;
    }
}