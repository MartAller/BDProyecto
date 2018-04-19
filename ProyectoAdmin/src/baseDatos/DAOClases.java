/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import aplicacion.Actividad;
import aplicacion.Clase;
import java.sql.*;

/**
 *
 * @author alumnogreibd
 */
public class DAOClases extends AbstractDAO {

    public DAOClases(Connection conexion, aplicacion.FachadaAplicacion fa) {
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }

    public java.util.List<Clase> mostrarClases(String orden) {
        java.util.List<Clase> resultado = new java.util.ArrayList<Clase>();

        Connection con;
        PreparedStatement stmClases = null;
        ResultSet rsClases;

        //Abro conexión
        con = this.getConexion();
        String consulta = "select * from clase";
        if (orden != null) {
            consulta += " order by ?";
        }

        try {
            stmClases = con.prepareStatement(consulta);
            if (orden != null) {
                stmClases.setString(1, orden);
            }
            rsClases = stmClases.executeQuery();
            while (rsClases.next()) {
                Clase clase = new Clase(rsClases.getInt("id_clase"), (java.util.Date) rsClases.getDate("fecha"), rsClases.getString("horaInicio"),
                        rsClases.getInt("nHoras"), rsClases.getInt("plazas"), null, rsClases.getString("profesor"), rsClases.getString("actividad"));
                resultado.add(clase);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());

            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmClases.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    /*Realiza una consulta de aquellas clases que podrían incorporarse a un nuevo bono (clases
    no caducadas cuyo límite de plazas no haya sido excedido)*/
    public java.util.List<Clase> consultarClasesNuevoBono() {
        java.util.List<Clase> resultado = new java.util.ArrayList<Clase>();

        Connection con;
        PreparedStatement stmClases = null;
        ResultSet rsClases;

        //Abro conexión
        con = this.getConexion();
        String consulta = "SELECT c.id_clase, c.fecha, c.horaInicio, c.nHoras, c.plazas, (c.plazas - count(*)) as plazasDisponibles, c.profesor, c.actividad " +
                            " FROM inscripcion i " +
                            " JOIN clasesBono cb USING (bono) " +
                            " JOIN clase c ON (cb.idClase = c.id_clase) " +
                            " GROUP BY c.id_clase, c.fecha, c.horaInicio, c.nHoras, c.plazas " +
                            " HAVING count(*) < c.plazas AND c.fecha > CURRENT_DATE";
                
 

        try {
            stmClases = con.prepareStatement(consulta);

            rsClases = stmClases.executeQuery();
            while (rsClases.next()) {
                Clase clase = new Clase(rsClases.getInt("id_clase"), (java.util.Date) rsClases.getDate("fecha"), rsClases.getString("horaInicio"),
                        rsClases.getInt("nHoras"), rsClases.getInt("plazas"), rsClases.getInt("plazasDisponibles"), rsClases.getString("profesor"), rsClases.getString("actividad"));
                resultado.add(clase);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());

            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmClases.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }
    
    public java.util.ArrayList<Actividad> consultarActividades(){
        java.util.ArrayList<Actividad> actividades= new java.util.ArrayList<>();
        
        Connection con;
        PreparedStatement stmActividad = null;
        ResultSet rsActividad=null;

        //Abro conexión
        con = this.getConexion();
        String consulta = "select * from actividad";

        try {
            stmActividad = con.prepareStatement(consulta);
            rsActividad = stmActividad.executeQuery();
            
            while (rsActividad.next()) {
                actividades.add( new Actividad(rsActividad.getString("nombre"), rsActividad.getString("descripcion"), 
                        rsActividad.getString("instalacion"), rsActividad.getFloat("preciohora")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());

            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmActividad.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return actividades;
    }
    
    public void nuevaClase(Clase clase){
        Connection con;
        PreparedStatement stmClase=null;

        con=super.getConexion();

        try {
            stmClase=con.prepareStatement("insert into clase "+  //(id_clase, horainicio, nhoras, precio, plazas, profesor, actividad)
                                          "values (?,?,?,?,?,?,?,?)");
            stmClase.setInt(1, clase.getId_clase());
            stmClase.setDate(2, (java.sql.Date)clase.getFecha());
            stmClase.setString(3, clase.getHoraInicio());
            stmClase.setInt(4, clase.getnHoras());
            stmClase.setDouble(5,0.0); //añadir precio a Clase
            stmClase.setInt(6,clase.getPlazas());
            stmClase.setString(7, clase.getProfesor());
            stmClase.setString(8, clase.getActividad());
            stmClase.executeUpdate();
        
        } catch (SQLException e){
          System.out.println(e.getMessage());
          this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        }finally{
          try {stmClase.close();} catch (SQLException e){System.out.println("Imposible cerrar cursores");}
        }
    }
}
