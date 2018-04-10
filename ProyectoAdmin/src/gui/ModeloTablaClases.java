/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import aplicacion.Clase;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Carlos
 */
public class ModeloTablaClases extends AbstractTableModel{
    private java.util.List<Clase> clases;
    public ModeloTablaClases(){
        this.clases = new java.util.ArrayList<Clase>();
    }
    public int getColumnCount() {
        return 6;
    }

    public int getRowCount() {
        return clases.size();
    }
    
    @Override
    public String getColumnName(int col) {
        String nombre = "";

        switch (col) {
            case 0:
                nombre = "Id";
                break;
            case 1:
                nombre = "Fecha";
                break;
            case 2:
                nombre = "Hora inicio";
            case 3:
                nombre = "Numero horas";
                break;
            case 4:
                nombre = "Plazas";
                break;
            case 5:
                nombre = "Profesor";
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
                clase = java.util.Date.class;
                break;
            case 2:
                clase = java.lang.String.class;
                break;
            case 3:
                clase = java.lang.Integer.class;
                break;
            case 4:
                clase = java.lang.Integer.class;
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
                resultado = clases.get(row).getId_clase();
                break;
            case 1:
                resultado = clases.get(row).getFecha();
                break;
            case 2:
                resultado = clases.get(row).getHoraInicio();
                break;
            case 3:
                resultado = clases.get(row).getnHoras();//Obtengo el número total de devoluciones pendientes  
                break;
            case 4:
                resultado = clases.get(row).getPlazas();
                break;
            case 5:
                resultado = clases.get(row).getProfesor();
                break;
        }
        return resultado;
    }

    public void setFilas(java.util.List<Clase> clases) {
        this.clases = clases;
        fireTableDataChanged();/*Notifica a todos los listeners que los valores de las celdas de la tabla
         pueden haber cambiado.*/

    }

    public Clase obtenerUsuario(int i) {
        return this.clases.get(i);
    }
}
