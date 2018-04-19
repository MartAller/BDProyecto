/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

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
    public java.util.List<Clase> mostrarClases(String orden) {
        return fbd.mostrarClases(orden);
    }

    /////////////CLASES/////////////////
    public java.util.List<Clase> consultarClasesNuevoBono() {
        return fbd.consultarClasesNuevoBono();
    }
    
    public void nuevaClase(Clase clase){
        fbd.nuevaClase(clase);
    }
    
    //actividad
    public java.util.ArrayList<Actividad> consultarActividades(){
        return fbd.consultarActividades();
    }

    ///////////////BONOS////////////////////

    public java.util.List<Bono> consultarBonos(Integer idBono, String palabrasClave, boolean noCaducados) {
        return fbd.consultarBonos(idBono, palabrasClave, noCaducados);
    }

    public void ventanaNuevoBono() {
        fgui.ventanaNuevoBono();
    }
    
    public void ventanaNuevaClase(java.util.ArrayList<Usuario> profesores, java.util.ArrayList<Actividad> actividades) {
        fgui.ventanaNuevaClase(profesores, actividades);
    }
    
    public void insertarBono(Bono bono, java.util.List<Clase> clases){
        fbd.insertarBono(bono, clases);
    }

}
