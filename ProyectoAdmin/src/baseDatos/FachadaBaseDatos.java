/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import aplicacion.Actividad;
import aplicacion.Bono;
import aplicacion.Clase;
import aplicacion.Usuario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author basesdatos
 */
public class FachadaBaseDatos {

    private aplicacion.FachadaAplicacion fa;
    private java.sql.Connection conexion;
    private DAOBonos daoBonos;
    private DAOClases daoClases;
    private DAOUsuarios daoUsuarios;

    public FachadaBaseDatos(aplicacion.FachadaAplicacion fa) {

        Properties configuracion = new Properties();
        this.fa = fa;
        FileInputStream arqConfiguracion;

        try {
            arqConfiguracion = new FileInputStream("baseDatos.properties");
            configuracion.load(arqConfiguracion);
            arqConfiguracion.close();

            Properties usuario = new Properties();

            String gestor = configuracion.getProperty("gestor");

            usuario.setProperty("user", configuracion.getProperty("usuario"));
            usuario.setProperty("password", configuracion.getProperty("clave"));
            //Class.forName("oracle.jdbc.driver.OracleDriver");
            this.conexion = java.sql.DriverManager.getConnection("jdbc:" + gestor + "://"
                    + configuracion.getProperty("servidor") + ":"
                    + configuracion.getProperty("puerto") + "/"
                    + configuracion.getProperty("baseDatos"),
                    usuario);

            daoBonos = new DAOBonos(conexion, fa);
            daoClases = new DAOClases(conexion, fa);
            daoUsuarios = new DAOUsuarios(conexion, fa);

        } catch (FileNotFoundException f) {
            System.out.println(f.getMessage());
            fa.muestraExcepcion(f.getMessage());
        } catch (IOException i) {
            System.out.println(i.getMessage());
            fa.muestraExcepcion(i.getMessage());
        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            fa.muestraExcepcion(e.getMessage());
        }
//        catch (ClassNotFoundException c) {
//            System.out.println(c.getMessage());
//            fa.muestraExcepcion(c.getMessage());
//        }
    }

//////////////USUARIOS//////////////////////
    public Usuario validarUsuario(String idUsuario, String clave) {
        return daoUsuarios.validarUsuario(idUsuario, clave);
    }

    public java.util.List<Usuario> consultarUsuarios(String idUsuario, String nombre, String tipo) {
        return daoUsuarios.consultarUsuarios(idUsuario, nombre, tipo);
    }

    public Usuario consultarUsuario(String id) {
        return daoUsuarios.consultarUsuario(id);
    }

    public java.util.ArrayList<Usuario> consultarProfesores() {
        return daoUsuarios.consultarProfesores();
    }
/////////////CLASES//////////////////////

    public java.util.List<Clase> consultarClases(String orden) {
        return daoClases.consultarClases(orden);
    }

    public java.util.List<Clase> consultarClasesNuevoBono() {
        return daoClases.consultarClasesNuevoBono();
    }

    public java.util.List<Clase> consultarClasesBono(Integer idBono) {
        return daoClases.consultarClasesBono(idBono);
    }

    public void nuevaClase(Clase clase) {
        daoClases.nuevaClase(clase);
    }

    //actividad
    public java.util.ArrayList<Actividad> consultarActividades() {
        return daoClases.consultarActividades();
    }
//////////////BONOS//////////////////////

    public java.util.List<Bono> consultarBonos(Integer idBono, String palabrasClave, boolean noCaducados) {
        return daoBonos.consultarBonos(idBono, palabrasClave, noCaducados);
    }

    public void insertarBono(Bono bono, java.util.List<Clase> clases) {
        daoBonos.insertarBono(bono, clases);
    }

    public void inscribirSocio(String idUsuario, Integer idBono) {
        daoBonos.inscribirSocio(idUsuario, idBono);
    }

}
