/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import aplicacion.Usuario;
import javax.swing.table.*;

/**
 *
 * @author basesdatos
 */
public class ModeloTablaUsuariosReducido extends AbstractTableModel {

    private java.util.List<Usuario> usuarios;

    public ModeloTablaUsuariosReducido() {
        this.usuarios = new java.util.ArrayList<Usuario>();
    }

    public int getColumnCount() {
        return 3;
    }

    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public String getColumnName(int col) {
        String nombre = "";

        switch (col) {
            case 0:
                nombre = "Id";
                break;
            case 1:
                nombre = "Nombre";
                break;
            case 2:
                nombre = "Categoría";

        }
        return nombre;
    }

    @Override
    public Class getColumnClass(int col) {
        Class clase = null;

        switch (col) {
            case 0:
                clase = java.lang.String.class;
                break;
            case 1:
                clase = java.lang.String.class;
                break;
            case 2:
                clase = aplicacion.TipoCategoria.class;
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
                resultado = usuarios.get(row).getIdUsuario();
                break;
            case 1:
                resultado = usuarios.get(row).getNombre();
                break;
            case 2:
                resultado = usuarios.get(row).getCategoria();
                break;

        }
        return resultado;
    }

    public void setFilas(java.util.List<Usuario> usuarios) {
        this.usuarios = usuarios;
        fireTableDataChanged();/*Notifica a todos los listeners que los valores de las celdas de la tabla
         pueden haber cambiado.*/

    }

    public Usuario obtenerUsuario(int i) {
        return this.usuarios.get(i);
    }

}
