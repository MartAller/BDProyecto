/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import static aplicacion.FachadaAplicacion.cc;
import baseDatos.FachadaBaseDatos;
import gui.FachadaGui;

/**
 *
 * @author alumnogreibd
 */
public class GestionClasesBonos {//Controlador de clases y bonos

    FachadaGui fgui;
    FachadaBaseDatos fbd;

    public GestionClasesBonos(FachadaGui fgui, FachadaBaseDatos fbd) {
        this.fgui = fgui;
        this.fbd = fbd;
    }

    ////////////////USUARIOS//////////////////
    public java.util.List<Clase> consultarClases(String orden) {
        return fbd.consultarClases(orden);
    }

    /////////////CLASES/////////////////
    public java.util.List<Clase> consultarClasesNuevoBono() {
        return fbd.consultarClasesNuevoBono();
    }

    public java.util.List<Clase> consultarClasesBono(Integer idBono) {
        return fbd.consultarClasesBono(idBono);
    }
    
    public void actualizarClase(Clase clase){
        fbd.actualizarClase(clase);
    }
        public void nuevaClase(Clase clase, String fecha){
        fbd.nuevaClase(clase, fecha);
    }
    
    //actividad
    public java.util.ArrayList<Actividad> consultarActividades() {
        return fbd.consultarActividades();
    }

    ///////////////BONOS////////////////////
    public java.util.List<Bono> consultarBonos(Integer idBono, String palabrasClave, boolean noCaducados) {
        return fbd.consultarBonos(idBono, palabrasClave, noCaducados);
    }

    public void ventanaNuevoBono() {
        fgui.ventanaNuevoBono();
    }

    public void ventanaInscripcionBono(Bono bono) {
        fgui.ventanaInscripcionBono(bono);
    }
    
    public void ventanaNuevaClase(java.util.ArrayList<Usuario> profesores, java.util.ArrayList<Actividad> actividades, Clase clase) {
        fgui.ventanaNuevaClase(profesores, actividades, clase);
    }
    
    public void insertarBono(Bono bono, java.util.List<Clase> clases){
        fbd.insertarBono(bono, clases);
    }

    public void inscribirSocio(String idUsuario, Integer idBono) {
        fbd.inscribirSocio(idUsuario, idBono);
    }

}
