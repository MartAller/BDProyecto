/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;
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
    
    public java.util.List<Clase> mostrarClases(String orden){
        java.util.List<Clase> resultado = new java.util.ArrayList<Clase>();
        
        Clase usuarioActual;
        Connection con;
        PreparedStatement stmClases = null;
        ResultSet rsClases;

        //Abro conexión
        con = this.getConexion();
        String consulta = "select * from clase";
        if(orden!= null)
            consulta+=" order by ?";
        
        try{
            stmClases=con.prepareStatement(consulta);
            if(orden!=null)
                stmClases.setString(1, orden);
            rsClases=stmClases.executeQuery();
            while(rsClases.next()){
                Clase clase=new Clase(rsClases.getInt("id_clase"), (java.util.Date)rsClases.getDate("fecha"), rsClases.getString("horaInicio"),
                    rsClases.getInt("nHoras"), rsClases.getInt("plazas"), rsClases.getInt("profesor"));
                resultado.add(clase);
            }
        }catch (SQLException e) {
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
}
