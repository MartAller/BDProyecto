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

    public Bono(Integer id_bono, String descripcion, float precio) {
        this.id_bono = id_bono;
        this.descripcion = descripcion;
        this.precio = precio;

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

}
