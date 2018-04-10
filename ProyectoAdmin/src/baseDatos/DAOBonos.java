/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import aplicacion.TipoCategoria;
import aplicacion.TipoPuesto;
import aplicacion.TipoUsuario;
import aplicacion.Bono;
import java.sql.*;

/**
 *
 * @author alumnogreibd
 */
public class DAOBonos extends AbstractDAO {

    public DAOBonos(Connection conexion, aplicacion.FachadaAplicacion fa) {
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }

    public java.util.List<Bono> consultarBonos(String idBono, String palabrasClave) {
        java.util.List<Bono> resultado = new java.util.ArrayList<Bono>();

        Bono bonoActual;
        Connection con;
        PreparedStatement stmBonos = null;
        ResultSet rsBonos;

        //Abro conexión
        con = this.getConexion();
        String consulta = "select id_bono, descripcion, precio"
                + " from bono "
                + "where true";

        //Si se ha introducido algún id o algún nombre los utilizo para las búsqueda
        if (idBono != null) {
            consulta = consulta + " and id_usuario like ? ";
        }

        if (palabrasClave != null) {
            consulta = consulta + "  and nombre like ? ";
        }


        try {

            stmBonos = con.prepareStatement(consulta);

            if (idBono != null) {
                stmBonos.setString(1, "%" + idBono + "%");
            }
            if (palabrasClave != null && idBono == null) {//Caso en el que el usuario introduce nombre pero no introduce id
                stmBonos.setString(1, "%" + palabrasClave + "%");
            } else if (palabrasClave != null && idBono != null) {//Caso en el que el usuario introduce tanto nombre como id
                stmBonos.setString(2, "%" + palabrasClave + "%");
            }

            rsBonos = stmBonos.executeQuery();
            while (rsBonos.next()) {
                bonoActual = new Bono(rsBonos.getInt("id_bono"), rsBonos.getString("descripcion"), rsBonos.getFloat("precio"));
                resultado.add(bonoActual);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());

            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmBonos.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }
}
