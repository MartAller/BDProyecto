/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import aplicacion.Bono;
import javax.swing.table.*;

/**
 *
 * @author basesdatos
 */
public class ModeloTablaBonos extends AbstractTableModel {

    private java.util.List<Bono> bonos;

    public ModeloTablaBonos() {
        this.bonos = new java.util.ArrayList<Bono>();
    }

    public int getColumnCount() {
        return 6;
    }

    public int getRowCount() {
        return bonos.size();
    }

    @Override
    public String getColumnName(int col) {
        String nombre = "";

        switch (col) {
            case 0:
                nombre = "Id Bono";
                break;
            case 1:
                nombre = "Descripción";
                break;
            case 2:
                nombre = "Precio";
            case 3:
                nombre = "Fecha Inicio";
                break;
            case 4:
                nombre = "Fecha Fin";
                break;
            case 5:
                nombre = "Nº Clases";
                break;
  

        }
        return nombre;
    }

    @Override
    public Class getColumnClass(int col) {
        Class clase = null;

        switch (col) {
            case 0:
                clase = java.lang.Integer.class;
                break;
            case 1:
                clase = java.lang.String.class;
                break;
            case 2:
                clase = java.lang.Float.class;
                break;
            case 3:
                clase = java.lang.String.class;
                break;
            case 4:
                clase = java.lang.String.class;
                break;  
            case 5:
                clase = java.lang.Integer.class;
                break;


        }
        return clase;
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return false;
    }

    public Object getValueAt(int row, int col) {
        Object resultado = null;

        switch (col) {
            case 0:
                resultado = bonos.get(row).getId_bono();
                break;
            case 1:
                resultado = bonos.get(row).getDescripcion();
                break;
            case 2:
                resultado = bonos.get(row).getPrecio();
                break;
            case 3:
                resultado = bonos.get(row).getFechaInicio();//Obtengo el número total de devoluciones pendientes  
                break;
            case 4:
                resultado = bonos.get(row).getFechaFin();
                break;
            case 5:
                resultado = bonos.get(row).getNumeroClases();
                break;
        }
        return resultado;
    }

    public void setFilas(java.util.List<Bono> usuarios) {
        this.bonos = usuarios;
        fireTableDataChanged();/*Notifica a todos los listeners que los valores de las celdas de la tabla
         pueden haber cambiado.*/

    }

    public Bono obtenerUsuario(int i) {
        return this.bonos.get(i);
    }

}
