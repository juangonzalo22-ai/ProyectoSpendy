package com.example.ProyectoSpendy.modelos;

public class Categoria {
        private Long id;
        private String nombre;
        private String fechaCreacion;
        private String responsable;
        private String justificacion;
        private String descripcion;// aca se explica con detalle para que se necesita el gasto
        private String tipoGasto;  // si es para comer, para comprar, o cualquier cosa
        private String iconoGasto;  // el icono correspondiente al gasto ejecutado
        private Boolean esNecesario; // indica si es necesario o no
        private Double topeMensual; // mira la cantidad donde se puede gastar en un mes

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

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoGasto() {
        return tipoGasto;
    }

    public void setTipoGasto(String tipoGasto) {
        this.tipoGasto = tipoGasto;
    }

    public String getIconoGasto() {
        return iconoGasto;
    }

    public void setIconoGasto(String iconoGasto) {
        this.iconoGasto = iconoGasto;
    }

    public Boolean getEsNecesario() {
        return esNecesario;
    }

    public void setEsNecesario(Boolean esNecesario) {
        this.esNecesario = esNecesario;
    }

    public Double getTopeMensual() {
        return topeMensual;
    }

    public void setTopeMensual(Double topeMensual) {
        this.topeMensual = topeMensual;
    }
}