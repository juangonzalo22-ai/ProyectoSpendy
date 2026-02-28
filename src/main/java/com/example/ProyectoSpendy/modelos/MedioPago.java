package com.example.ProyectoSpendy.modelos;

import jakarta.persistence.*; // Importación necesaria para JPA

@Entity
@Table(name = "medios_pago")
public class MedioPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String franquicia;  // que marca de tarjeta ya sea mastercard, o etc
    private Boolean activo;  // indica si está activo (si) o (no)
    private String cuentaEncriptada; // la cuenta ya sea de ahorros o corriente pero encriptada, no en texto plano por seguridad

    public MedioPago() {}   // constructor vacio


    // Constructor con parámetros
    public MedioPago(Long id, String nombre, String franquicia, Boolean activo, String cuentaEncriptada) {
        this.id = id;
        this.nombre = nombre;
        this.franquicia = franquicia;
        this.activo = activo;
        this.cuentaEncriptada = cuentaEncriptada;
    }
        //getters y setters
        public Long getId () {
            return id;
        }

        public void setId (Long id){
            this.id = id;
        }

        public String getNombre () {
            return nombre;
        }

        public void setNombre (String nombre){
            this.nombre = nombre;
        }

        public String getFranquicia () {
            return franquicia;
        }

        public void setFranquicia (String franquicia){
            this.franquicia = franquicia;
        }

        public Boolean getActivo () {
            return activo;
        }

        public void setActivo (Boolean activo){
            this.activo = activo;
        }

        public String getCuentaEncriptada () {
            return cuentaEncriptada;
        }

        public void setCuentaEncriptada (String cuentaEncriptada){
            this.cuentaEncriptada = cuentaEncriptada;
        }
    }