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
 * @author hammamboutafant
 */
public class FachadaAplicacion {

    static gui.FachadaGui fgui;
    static baseDatos.FachadaBaseDatos fbd;
    static GestionClasesBonos cc;
    static GestionUsuarios cu;

    public FachadaAplicacion() {
        fgui = new gui.FachadaGui(this);
        fbd = new baseDatos.FachadaBaseDatos(this);
        cc = new GestionClasesBonos(fgui, fbd);
        cu = new GestionUsuarios(fgui, fbd);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FachadaAplicacion fa;

        System.out.println("Hola222334477");
        System.out.println("Hola2222");
        System.out.println("Hola33");
        System.out.println("version1");
        fa = new FachadaAplicacion();
        fa.iniciaInterfazAdmin();
    }

    public void iniciaInterfazAdmin() {
        fgui.iniciaVista();
    }

    public void muestraExcepcion(String e) {
        fgui.muestraExcepcion(e);
    }

    public void NuevoUsuario(String id) {
        cu.NuevoUsuario(id);
    }

    //////////////USUARIOS/////////////////

    public Boolean comprobarAutentificacion(String idUsuario, String clave) {
        return cu.comprobarAutentificacion(idUsuario, clave);
    }

    public java.util.List<Usuario> consultarUsuarios(String idUsuario, String nombre, String tipo) {
        return cu.consultarUsuarios(idUsuario, nombre, tipo);
    }
    
    public java.util.ArrayList<Usuario> consultarProfesores(){
        return cu.consultarProfesores();
    }

    /////////////CLASES//////////////////
    public java.util.List<Clase> consultarClases(String orden) {
        return cc.consultarClases(orden);
    }

    public java.util.List<Clase> consultarClasesNuevoBono() {
        return cc.consultarClasesNuevoBono();
    }
    public void nuevaClase(Clase clase, String fecha){
        cc.nuevaClase(clase, fecha);
    }
    
    public java.util.ArrayList<Actividad> consultarActividades(){
        return cc.consultarActividades();
    }

    /////////////BONOS//////////////////
    public java.util.List<Bono> consultarBonos(Integer idBono, String palabrasClave, boolean noCaducados) {
        return cc.consultarBonos(idBono, palabrasClave, noCaducados);
    }

    public void ventanaNuevoBono() {
        cc.ventanaNuevoBono();
    }
    
    public void ventanaNuevaClase(java.util.ArrayList<Usuario> profesores, java.util.ArrayList<Actividad> actividades) {
        cc.ventanaNuevaClase(profesores, actividades);
    }
    
    public void insertarBono(Bono bono, java.util.List<Clase> clases){
        cc.insertarBono(bono, clases);
    }
    public void ventanaInscripcionBono(Bono bono) {
        cc.ventanaInscripcionBono(bono);
    }

}
