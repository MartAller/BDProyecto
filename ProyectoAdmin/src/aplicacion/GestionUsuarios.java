/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import gui.FachadaGui;
import baseDatos.FachadaBaseDatos;

/**
 *
 * @author basesdatos
 */
public class GestionUsuarios {//Controlador de usuarios

    FachadaGui fgui;
    FachadaBaseDatos fbd;

    public GestionUsuarios(FachadaGui fgui, FachadaBaseDatos fbd) {
        this.fgui = fgui;
        this.fbd = fbd;
    }

    /*Comprueba que el par idUsuario-clave se encuentra en la base de datos y que además
     se corresponde con un usuario de tipo administrador.*/
    public Boolean comprobarAutentificacion(String idUsuario, String clave) {
        Usuario u;

        u = fbd.validarUsuario(idUsuario, clave);/*Si el par nombreUsuario-contraseña que introdujo el usuario
         es correcto, validarUsuario() devolverá un usuario (u será distinto de null)*/

        if (u != null) {
            return u.getPuesto() == TipoPuesto.Administrador;//Para poder acceder a la base de datos hay que ser administrador
        } else {
            return false;
        }
    }

    public java.util.List<Usuario> consultarUsuarios(String idUsuario, String nombre, String tipo) {
        return fbd.consultarUsuarios(idUsuario, nombre, tipo);
    }
    public void NuevoUsuario(String id){
        Usuario u;
        u=fbd.consultarUsuario(id);
        fgui.NuevoUsuario(u);
    }

}
