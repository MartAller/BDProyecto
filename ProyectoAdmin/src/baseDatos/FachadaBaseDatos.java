/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

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
/////////////CLASES//////////////////////

    public java.util.List<Clase> mostrarClases(String orden) {
        return daoClases.mostrarClases(orden);
    }
//////////////BONOS//////////////////////

    public java.util.List<Bono> consultarBonos(Integer idBono, String palabrasClave) {
        return daoBonos.consultarBonos(idBono, palabrasClave);
    }
}
