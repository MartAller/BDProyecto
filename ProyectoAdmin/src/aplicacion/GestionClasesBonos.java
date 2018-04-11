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
    ///////////////BONOS////////////////////
    public java.util.List<Bono> consultarBonos(Integer idBono, String palabrasClave) {
        return fbd.consultarBonos(idBono, palabrasClave);
    }

}
