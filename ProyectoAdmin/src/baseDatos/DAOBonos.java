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
import aplicacion.Clase;
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

    public java.util.List<Bono> consultarBonos(Integer idBono, String palabrasClave, boolean noCaducados) {//Autor: Martín Aller
        java.util.List<Bono> resultado = new java.util.ArrayList<Bono>();

        Bono bonoActual;
        Connection con;
        PreparedStatement stmBonos = null;
        ResultSet rsBonos;

        //Abro conexión
        con = this.getConexion();
        String consulta = "SELECT b.id_bono, b.descripcion, b.precio, min(cb.fechaClase) as fInicio, max(cb.fechaClase) as fFin, count(*) as nClases "
                + "FROM bono b JOIN clasesBono cb ON (b.id_bono = cb.bono) "
                + "WHERE true ";

        //Si se ha introducido algún id o algún nombre los utilizo para las búsqueda
        if (idBono != null) {
            consulta = consulta + " and id_bono = ? ";
        }

        if (palabrasClave != null) {
            consulta = consulta + "  and descripcion like ? ";
        }

        consulta += " GROUP BY b.id_bono, b.descripcion, b.precio";

        /*Un bono está caducado si la fecha de su última clase es anterior a la 
         fecha actual*/
        if (noCaducados == true) {
            consulta += " HAVING max(cb.fechaClase) > current_date";
        }

        try {

            stmBonos = con.prepareStatement(consulta);

            if (idBono != null) {
                stmBonos.setInt(1, idBono);
            }
            if (palabrasClave != null && idBono == null) {//Caso en el que el usuario introduce nombre pero no introduce id
                stmBonos.setString(1, "%" + palabrasClave + "%");
            } else if (palabrasClave != null && idBono != null) {//Caso en el que el usuario introduce tanto nombre como id
                stmBonos.setString(2, "%" + palabrasClave + "%");
            }

            rsBonos = stmBonos.executeQuery();
            while (rsBonos.next()) {
                bonoActual = new Bono(rsBonos.getInt("id_bono"), rsBonos.getString("descripcion"), rsBonos.getFloat("precio"),
                        rsBonos.getString("fInicio"), rsBonos.getString("fFin"), rsBonos.getInt("nClases"));
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

    public void insertarBono(Bono bono, java.util.List<Clase> clases) {//Autor: Martín Aller
        Connection con;
        PreparedStatement stmBonos = null, stmClasesBono = null;

        //Abro conexión
        con = this.getConexion();
        String consulta1 = "INSERT INTO bono VALUES(?,?,?)";
        String consulta2 = "INSERT INTO clasesBono VALUES(?,?,?,?)";

        try {
            //Inserción del bono en la tabla Bono
            stmBonos = con.prepareStatement(consulta1);
            stmBonos.setInt(1, bono.getId_bono());
            stmBonos.setString(2, bono.getDescripcion());
            stmBonos.setFloat(3, bono.getPrecio());

            stmBonos.executeUpdate();

            //Inserción del bono en la tabla clasesBono (se inserta una nueva tupla por cada clase que tenga el bono)
            try {
                stmClasesBono = con.prepareStatement(consulta2);

                for (Clase c : clases) {
                    stmClasesBono.setInt(1, bono.getId_bono());
                    stmClasesBono.setInt(2, c.getId_clase());
                    stmClasesBono.setDate(3, new java.sql.Date(c.getFecha().getTime()));//Convierto java.util.Date en java.sql.Date
                    stmClasesBono.setString(4, c.getHoraInicio());
                    stmClasesBono.executeUpdate();
                }
            } catch (SQLException e2) {
                System.out.println(e2.getMessage());
                this.getFachadaAplicacion().muestraExcepcion(e2.getMessage());

            } finally {
                try {
                    stmClasesBono.close();
                } catch (SQLException e) {
                    System.out.println("Imposible cerrar cursores");
                }
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

    }

    public void inscribirSocio(String idUsuario, Integer idBono) {//Autor: Martín Aller
        Connection con;
        PreparedStatement stmBonos = null;

        //Abro conexión
        con = this.getConexion();
        String cadena = "INSERT INTO inscripcion VALUES(?,?,CURRENT_DATE)";

        try {
            //Inserción del bono en la tabla Bono
            stmBonos = con.prepareStatement(cadena);
            stmBonos.setString(1, idUsuario);
            stmBonos.setInt(2, idBono);
            //stmBonos.setFloat(3, bono.getPrecio());
            stmBonos.executeUpdate();

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

    }

}
