/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import aplicacion.Actividad;
import aplicacion.Usuario;
import aplicacion.Clase;

/**
 *
 * @author alumno
 */
public class FachadaGui {

    aplicacion.FachadaAplicacion fa;
    VAdmin vAd;

    public FachadaGui(aplicacion.FachadaAplicacion fa) {
        this.fa = fa;
        this.vAd = new VAdmin(fa);
    }

    public void iniciaVista() {
        VAutentificacion va;

        va = new VAutentificacion(vAd, true, fa);
        vAd.cargarClases(null);
        vAd.cargarBonos();
        vAd.cargarUsuarios();
        vAd.setVisible(true);
        va.setVisible(true);
    }

    public void muestraExcepcion(String txtExcepcion) {
        VAviso va;

        va = new VAviso(vAd, true, txtExcepcion);
        va.setVisible(true);
    }

    public VAdmin getVAd() {
        return vAd;
    }

    //////////USUARIOS//////////////
    public void NuevoUsuario(Usuario u) {
        VUsuario v = new VUsuario(vAd, true, fa, u);
        v.setVisible(true);
    }
//////////////////CLASES////////////////////////

    public void ventanaNuevaClase(java.util.ArrayList<Usuario> profesores, java.util.ArrayList<Actividad> actividades, Clase clase) {
        VClase vc = new VClase(vAd, true, fa, profesores, actividades, clase);
        vc.setVisible(true);
    }

    /////////////////////////////BONOS////////////////////////////////
    public void ventanaNuevoBono() {
        VInsertaBono vib = new VInsertaBono(vAd, true, fa);
        vib.setVisible(true);
    }

    public void ventanaInscripcionBono(aplicacion.Bono bono) {
        VInscripcionBono vib = new VInscripcionBono(vAd, true, fa, bono);
        vib.setVisible(true);
    }

}
