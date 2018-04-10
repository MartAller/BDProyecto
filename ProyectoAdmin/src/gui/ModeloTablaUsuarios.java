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
public class ModeloTablaUsuarios extends AbstractTableModel {

    private java.util.List<Usuario> usuarios;

    public ModeloTablaUsuarios() {
        this.usuarios = new java.util.ArrayList<Usuario>();
    }

    public int getColumnCount() {
        return 10;
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
                nombre = "Teléfono";
            case 3:
                nombre = "Dirección";
                break;
            case 4:
                nombre = "E-mail";
                break;
            case 5:
                nombre = "Tipo";
                break;
            case 6:
                nombre = "Puesto";
                break;
            case 7:
                nombre = "Antigüedad";
                break;
            case 8:
                nombre = "Categoría";
                break;
            case 9:
                nombre = "Fecha unión";
                break;

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
                clase = java.lang.String.class;
                break;
            case 3:
                clase = java.lang.String.class;
                break;
            case 4:
                clase = java.lang.String.class;
                break;
            case 5:
                clase = aplicacion.TipoUsuario.class;
                break;
            case 6:
                clase = aplicacion.TipoPuesto.class;
                break;
            case 7:
                clase = java.lang.Integer.class;
                break;
            case 8:
                clase = aplicacion.TipoCategoria.class;
                break;
            case 9:
                clase = java.lang.String.class;
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
                resultado = usuarios.get(row).getTelefono();
                break;
            case 3:
                resultado = usuarios.get(row).getDireccion();//Obtengo el número total de devoluciones pendientes  
                break;
            case 4:
                resultado = usuarios.get(row).getEmail();
                break;
            case 5:
                resultado = usuarios.get(row).getTipoUsuario();
                break;
            case 6:
                resultado = usuarios.get(row).getPuesto();
                break;
            case 7:
                resultado = usuarios.get(row).getAntiguedad();
                if (usuarios.get(row).getPuesto() == null) {
                    resultado = null;
                }
                break;
            case 8:
                resultado = usuarios.get(row).getCategoria();
                break;
            case 9:
                resultado = usuarios.get(row).getFecha_union();
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
