/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.util.Date;

/**
 *
 * @author alumnogreibd
 */
public class Clase {
    private Integer id_clase;
    private java.util.Date fecha;
    private String horaInicio;
    private Integer nHoras;
    private Integer plazas;
    //private Integer precio; //añadido
    private Integer plazasDisponibles;
    private String profesor;
    private String actividad;

    public Clase(Integer id_clase, Date fecha, String horaInicio, Integer nHoras, Integer plazas, /*Integer precio,*/ Integer plazasDisponibles, String profesor, String actividad) {
        this.id_clase = id_clase;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.nHoras = nHoras;
        this.plazas = plazas;
        //this.precio=precio;
        this.plazasDisponibles = plazasDisponibles;
        this.profesor = profesor;
        this.actividad = actividad;
    }



    public Integer getId_clase() {
        return id_clase;
    }

    public void setId_clase(Integer id_clase) {
        this.id_clase = id_clase;
    }

    public java.util.Date getFecha() {
        return fecha;
    }

    public void setFecha(java.util.Date fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Integer getnHoras() {
        return nHoras;
    }

    public void setnHoras(Integer nHoras) {
        this.nHoras = nHoras;
    }

    public Integer getPlazas() {
        return plazas;
    }
    /*

    public Integer getPrecio() {
        return precio;
    }
    */
    
    
    public String getProfesor() {
        return profesor;
    }

    public void setPlazas(Integer plazas) {
        this.plazas = plazas;
    }

    public Integer getPlazasDisponibles() {
        return plazasDisponibles;
    }

    public void setPlazasDisponibles(Integer plazasDisponibles) {
        this.plazasDisponibles = plazasDisponibles;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
    
    
    
    
}


