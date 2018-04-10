/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;



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
        vAd.setVisible(true);
        va.setVisible(true);
    }



    public void muestraExcepcion(String txtExcepcion) {
        VAviso va;

        va = new VAviso(vAd, true, txtExcepcion);
        va.setVisible(true);
    }
    public void NuevoUsuario(){
        VUsuario u = new VUsuario(vAd,true,fa);
         u.setVisible(true);
    }


}
