/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import aplicacion.Clase;

/**
 *
 * @author alumnogreibd
 */
public class VInsertaBono extends javax.swing.JDialog {

    private aplicacion.FachadaAplicacion fa;
    private VAdmin padre;

    public VInsertaBono(java.awt.Frame parent, boolean modal, aplicacion.FachadaAplicacion fa) {
        super(parent, modal);
        this.fa = fa;
        initComponents();
        mostrarClases();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClases = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        insertaIdBono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCrearBono = new javax.swing.JButton();
        btnBonoAtras = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        insertaDescripcion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaClasesBono = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnAnhadirClase = new javax.swing.JButton();
        btnQuitarClase = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo bono");

        tablaClases.setModel(new ModeloTablaClases());
        jScrollPane1.setViewportView(tablaClases);

        jLabel1.setText("Clases disponibles:");

        insertaIdBono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertaIdBonoActionPerformed(evt);
            }
        });

        jLabel3.setText("IdBono");

        btnCrearBono.setText("Crear bono");
        btnCrearBono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearBonoActionPerformed(evt);
            }
        });

        btnBonoAtras.setText("Atrás");
        btnBonoAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBonoAtrasActionPerformed(evt);
            }
        });

        insertaDescripcion.setColumns(20);
        insertaDescripcion.setRows(5);
        jScrollPane2.setViewportView(insertaDescripcion);

        jLabel4.setText("Descripción:");

        tablaClasesBono.setModel(new ModeloTablaClases());
        jScrollPane3.setViewportView(tablaClasesBono);

        jLabel5.setText("Clases añadidas al bono:");

        btnAnhadirClase.setText("Añadir clase");
        btnAnhadirClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnhadirClaseActionPerformed(evt);
            }
        });

        btnQuitarClase.setText("Quitar clase");
        btnQuitarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarClaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(4, 4, 4)
                                .addComponent(insertaIdBono, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAnhadirClase, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnQuitarClase))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel1)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3)))
                                .addContainerGap(42, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnCrearBono, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBonoAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertaIdBono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBonoAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearBono, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnhadirClase)
                    .addComponent(btnQuitarClase))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertaIdBonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertaIdBonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertaIdBonoActionPerformed

    private void btnCrearBonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearBonoActionPerformed
        // TODO add your handling code here:
        ModeloTablaClases m = (ModeloTablaClases) tablaClasesBono.getModel();
        java.util.List<Clase> clases = m.obtenerListaClases();
        Integer idBono = Integer.parseInt(insertaIdBono.getText());
        String descripcion = insertaDescripcion.getText();
        
        aplicacion.Bono bono = new aplicacion.Bono(idBono, descripcion, 0, null, null, null);
        fa.insertarBono(bono, clases);
    }//GEN-LAST:event_btnCrearBonoActionPerformed

    private void btnBonoAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBonoAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnBonoAtrasActionPerformed

    private void btnAnhadirClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnhadirClaseActionPerformed
        ModeloTablaClases m1, m2;
        Integer i; //Índice de la fila seleccionada en la tabla de clases.

        m1 = (ModeloTablaClases) tablaClases.getModel();
        m2 = (ModeloTablaClases) tablaClasesBono.getModel();
        i = tablaClases.getSelectedRow();

        //Creo un objeto de tipo Clase
        Integer idClase = (Integer) m1.getValueAt(i, 0);
        java.util.Date fecha = (java.util.Date) m1.getValueAt(i, 1);
        String horaInicio = m1.getValueAt(i, 2).toString();
        Integer nHoras = (Integer) m1.getValueAt(i, 3);
        Integer plazas = (Integer) m1.getValueAt(i, 4);
        Integer plazasDisponibles = (Integer) m1.getValueAt(i, 5);
        String profesor = m1.getValueAt(i, 5).toString();
        String actividad = m1.getValueAt(i, 6).toString();

        //Añado una fila a la tabla de clases del bono
        Clase c = new Clase(idClase, fecha, horaInicio, nHoras, plazas, plazasDisponibles, profesor, actividad, null);
        m2.addRow(c);

        //Quito la fila de la tabla de clases (no se puede añadir una clase dos veces al mismo bono)
        m1.removeRow(i);
    }//GEN-LAST:event_btnAnhadirClaseActionPerformed

    private void btnQuitarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarClaseActionPerformed
        ModeloTablaClases m1, m2;
        Integer i; //Índice de la fila seleccionada en la tabla de clases.

        m1 = (ModeloTablaClases) tablaClases.getModel();
        m2 = (ModeloTablaClases) tablaClasesBono.getModel();
        i = tablaClases.getSelectedRow();

        //Creo un objeto de tipo Clase
        Integer idClase = (Integer) m2.getValueAt(i, 0);
        java.util.Date fecha = (java.util.Date) m2.getValueAt(i, 1);
        String horaInicio = m2.getValueAt(i, 2).toString();
        Integer nHoras = (Integer) m2.getValueAt(i, 3);
        Integer plazas = (Integer) m2.getValueAt(i, 4);
        Integer plazasDisponibles = (Integer) m2.getValueAt(i, 5);
        String profesor = m2.getValueAt(i, 5).toString();
        String actividad = m2.getValueAt(i, 6).toString();

        //Añado una fila a la tabla de clases del bono
        Clase c = new Clase(idClase, fecha, horaInicio, nHoras, plazas, plazasDisponibles, profesor, actividad, null);
        m1.addRow(c);

        //Quito la fila de la tabla de clases (no se puede añadir una clase dos veces al mismo bono)
        m2.removeRow(i);
    }//GEN-LAST:event_btnQuitarClaseActionPerformed

    private void mostrarClases() {
        ModeloTablaClases m;

        m = (ModeloTablaClases) tablaClases.getModel();/*ModeloTablaLibros extiende a AbstractTableModel*/

        m.setFilas(fa.consultarClasesNuevoBono());
        //Si la tabla obtenida tras la búsqueda tiene alguna fila:
        if (m.getRowCount() > 0) {
            tablaClases.setRowSelectionInterval(0, 0);//Por defecto selecciono la fila 0
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnhadirClase;
    private javax.swing.JButton btnBonoAtras;
    private javax.swing.JButton btnCrearBono;
    private javax.swing.JButton btnQuitarClase;
    private javax.swing.JTextArea insertaDescripcion;
    private javax.swing.JTextField insertaIdBono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaClases;
    private javax.swing.JTable tablaClasesBono;
    // End of variables declaration//GEN-END:variables
}
