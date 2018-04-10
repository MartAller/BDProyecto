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
public class Clase {
    private Integer id_clase;
    private java.util.Date fecha;
    private String horaInicio;
    private Integer nHoras;
    private Integer plazas;
    private Integer profesor;

    public Clase(Integer id_clase, java.util.Date fecha, String horaInicio, Integer nHoras, Integer plazas, Integer profesor) {
        this.id_clase = id_clase;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.nHoras = nHoras;
        this.plazas = plazas;
        this.profesor=profesor;
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
    
    public Integer getProfesor() {
        return profesor;
    }

    public void setPlazas(Integer plazas) {
        this.plazas = plazas;
    }
    
    
    
}


