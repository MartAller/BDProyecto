/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import aplicacion.*;
import gui.ModeloTablaUsuarios;
import java.sql.*;

/**
 *
 * @author alumnogreibd
 */
public class DAOUsuarios extends AbstractDAO {

    public DAOUsuarios(Connection conexion, aplicacion.FachadaAplicacion fa) {
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }

    /*Comprueba si en la tabla de usuarios hay alguna tupla con id idUsuario y 
     contraseña clave.*/
    public Usuario validarUsuario(String idUsuario, String clave) {
        Usuario resultado = null;
        Connection con;
        PreparedStatement stmUsuario = null;
        ResultSet rsUsuario;

        con = this.getConexion();

        try {
            stmUsuario = con.prepareStatement("select id_usuario, clave, nombre, direccion, email, tipo_usuario, puesto, categoria, fecha_union "
                    + "from usuario "
                    + "where id_usuario = ? and clave = ?");
            stmUsuario.setString(1, idUsuario);
            stmUsuario.setString(2, clave);
            rsUsuario = stmUsuario.executeQuery();
            if (rsUsuario.next()) {//Como sólo puede haber un resultado no es necesario usar while
//                resultado = new Usuario(rsUsuario.getString("id_usuario"), rsUsuario.getString("clave"),
//                        rsUsuario.getString("nombre"), rsUsuario.getString("direccion"),
//                        rsUsuario.getString("email"), TipoUsuario.valueOf(rsUsuario.getString("tipoUsuario")), TipoPuesto.valueOf(rsUsuario.getString("puesto")), TipoCategoria.valueOf(rsUsuario.getString("categoria")),rsUsuario.getString("fecha_union"));
                String p = rsUsuario.getString("puesto");
                TipoPuesto puesto = null;
                if (p != null) {
                    puesto = TipoPuesto.valueOf(p);
                }
                resultado = new Usuario(rsUsuario.getString("id_usuario"), rsUsuario.getString("clave"),
                        null, null, null, null, null, puesto, null, null, null);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmUsuario.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public java.util.List<Usuario> consultarUsuarios(String idUsuario, String nombre, String tipo) {
        java.util.List<Usuario> resultado = new java.util.ArrayList<Usuario>();

        Usuario usuarioActual;
        Connection con;
        PreparedStatement stmUsuarios = null;
        ResultSet rsUsuarios;

        //Abro conexión
        con = this.getConexion();
        String consulta = "select id_usuario, nombre, telefono, direccion, email, tipo_usuario, puesto, antiguedad, categoria, fecha_union"
                + " from usuario "
                + "where true";

        //Si se ha introducido algún id o algún nombre los utilizo para las búsqueda
        if (idUsuario != null) {
            consulta = consulta + " and id_usuario like ? ";
        }

        if (nombre != null) {
            consulta = consulta + "  and nombre like ? ";
        }
        if (tipo != null) {

            if (tipo.equals("Socio Normal")) {
                consulta = consulta + "  and categoria = 'Normal' ";
                System.out.println("P1");

            } else if (tipo.equals("Socio Prémium")) {
                consulta = consulta + "  and categoria = 'Premium' ";
                System.out.println("P2");

            } else if (tipo.equals("Administrador") || tipo.equals("Profesor") || tipo.equals("Mantenimiento")) {
                consulta = consulta + "  and puesto = '" + tipo + "' ";
                //El valor de tipo se obtiene a partir de un JComboBox, por lo que no se pueden realizar inyecciones SQL
                System.out.println("P3");
            } 


        }

        try {

            stmUsuarios = con.prepareStatement(consulta);

            if (idUsuario != null) {
                stmUsuarios.setString(1, "%" + idUsuario + "%");
            }
            if (nombre != null && idUsuario == null) {//Caso en el que el usuario introduce nombre pero no introduce id
                stmUsuarios.setString(1, "%" + nombre + "%");
            } else if (nombre != null && idUsuario != null) {//Caso en el que el usuario introduce tanto nombre como id
                stmUsuarios.setString(2, "%" + nombre + "%");
            }

            rsUsuarios = stmUsuarios.executeQuery();
            while (rsUsuarios.next()) {
                //Puesto comprobación
                String p = rsUsuarios.getString("puesto");
                TipoPuesto puesto = null;
                if (p != null) {
                    puesto = TipoPuesto.valueOf(p);
                }
                //Categoría comprobación
                String c = rsUsuarios.getString("categoria");
                TipoCategoria categoria = null;
                if (c != null) {
                    categoria = TipoCategoria.valueOf(c);
                }

                usuarioActual = new Usuario(rsUsuarios.getString("id_usuario"), null, rsUsuarios.getString("nombre"), rsUsuarios.getString("telefono"),
                        rsUsuarios.getString("direccion"), rsUsuarios.getString("email"), TipoUsuario.valueOf(rsUsuarios.getString("tipo_usuario")), puesto, rsUsuarios.getInt("antiguedad"), categoria, rsUsuarios.getString("fecha_union"));
                resultado.add(usuarioActual);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());

            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmUsuarios.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

}
