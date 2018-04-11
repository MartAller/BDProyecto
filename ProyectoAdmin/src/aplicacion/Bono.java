/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author alumnogreibd
 */
public class Bono {

    private Integer id_bono;
    private String descripcion;
    private float precio;
    private String fechaInicio;
    private String fechaFin;
    private Integer numeroClases;

    public Bono(Integer id_bono, String descripcion, float precio, String fechaInicio, String fechaFin, Integer numeroClases) {
        this.id_bono = id_bono;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.numeroClases = numeroClases;
    }



    public Integer getId_bono() {
        return id_bono;
    }

    public void setId_bono(Integer id_bono) {
        this.id_bono = id_bono;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getNumeroClases() {
        return numeroClases;
    }

    public void setNumeroClases(Integer numeroClases) {
        this.numeroClases = numeroClases;
    }
    
    

}
