package com.example.ProyectoSpendy.modelos;

import jakarta.persistence.*; // Importa todas las herramientas de Jakarta

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    // 1.constructor vacio
    public Usuario() {}

    // 2. Constructor con parámetros
    public Usuario(Long id, String nombres, String tipoDocumento, String nroDocumento, Integer edad, String direccion, String celular, String ultimoIngreso, String fotoPerfil, String ciudadDomicilio) {
        this.id = id;
        this.nombres = nombres;
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.edad = edad;
        this.direccion = direccion;
        this.celular = celular;
        this.ultimoIngreso = ultimoIngreso;
        this.fotoPerfil = fotoPerfil;
        this.ciudadDomicilio = ciudadDomicilio;
    }
    //getters y setters
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