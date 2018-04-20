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
public class Instalacion {
    private Integer id_instalacion;
    private String descripcion;
    private Double precioHora;

    public Instalacion(Integer id_instalacion, String descripcion, Double precioHora) {
        this.id_instalacion = id_instalacion;
        this.descripcion = descripcion;
        this.precioHora = precioHora;
    }

    public Integer getId_instalacion() {
        return id_instalacion;
    }

    public void setId_instalacion(Integer id_instalacion) {
        this.id_instalacion = id_instalacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(Double precioHora) {
        this.precioHora = precioHora;
    }
    
    
}
