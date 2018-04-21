/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import aplicacion.Bono;
import aplicacion.Clase;
import aplicacion.Usuario;

/**
 *
 * @author alumnogreibd
 */
public class VInscripcionBono extends javax.swing.JDialog {

    private aplicacion.FachadaAplicacion fa;
    private VAdmin padre;
    private Bono bono;

    /**
     * Creates new form VIncripcionBono
     */
    public VInscripcionBono(java.awt.Frame parent, boolean modal, aplicacion.FachadaAplicacion fa, Bono bono) {
        super(parent, modal);
        this.fa = fa;
        this.bono = bono;
        initComponents();
        cargarSocios();
        cargarClasesBono();

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
        tablaSocios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaClasesBono = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnInscribir = new javax.swing.JButton();
        buscaNombre = new javax.swing.JTextField();
        buscaId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaInscritos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inscripción en bono");

        tablaSocios.setModel(new ModeloTablaUsuariosReducido());
        jScrollPane1.setViewportView(tablaSocios);

        jLabel1.setText("Socios:");

        tablaClasesBono.setModel(new ModeloTablaClases());
        jScrollPane2.setViewportView(tablaClasesBono);

        jLabel2.setText("Clases del bono:");

        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnInscribir.setText("Inscribir");
        btnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirActionPerformed(evt);
            }
        });

        buscaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaNombreActionPerformed(evt);
            }
        });

        buscaId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaIdActionPerformed(evt);
            }
        });

        jLabel3.setText("Id");

        jLabel4.setText("Nombre");

        jLabel5.setText("Socios inscritos en el bono:");

        tablaInscritos.setModel(new ModeloTablaUsuariosReducido());
        tablaInscritos.setToolTipText("");
        jScrollPane3.setViewportView(tablaInscritos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscaId, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(btnInscribir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buscaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(buscaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInscribir)
                    .addComponent(btnAtras))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void buscaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscaNombreActionPerformed

    private void buscaIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscaIdActionPerformed

    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed
        // TODO add your handling code here:
        ModeloTablaUsuariosReducido m = (ModeloTablaUsuariosReducido) tablaSocios.getModel();
        String idUsuario = m.getValueAt(tablaSocios.getSelectedRow(), 0).toString();
        fa.inscribirSocio(idUsuario, this.bono.getId_bono());
    }//GEN-LAST:event_btnInscribirActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnInscribir;
    private javax.swing.JTextField buscaId;
    private javax.swing.JTextField buscaNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaClasesBono;
    private javax.swing.JTable tablaInscritos;
    private javax.swing.JTable tablaSocios;
    // End of variables declaration//GEN-END:variables

    public void cargarSocios() {
        java.util.List<Usuario> usuarios;
        ModeloTablaUsuariosReducido m = (ModeloTablaUsuariosReducido) tablaSocios.getModel();
        usuarios = fa.consultarUsuarios(null, null, "Socio");//Realizo una consulta de los bonos sin restricciones
        m.setFilas(usuarios);
        if (m.getRowCount() > 0) {
            tablaSocios.setRowSelectionInterval(0, 0);
            //btnInscribir.setEnabled(true);
        } else {
            //btnInscribir.setEnabled(false);
        }
    }

    public void cargarInscritos() {
        java.util.List<Usuario> usuarios;
        ModeloTablaUsuariosReducido m = (ModeloTablaUsuariosReducido) tablaSocios.getModel();
        usuarios = fa.consultarUsuarios(null, null, "Socio");//Realizo una consulta de los bonos sin restricciones
        m.setFilas(usuarios);
        if (m.getRowCount() > 0) {
            tablaSocios.setRowSelectionInterval(0, 0);
            //btnInscribir.setEnabled(true);
        } else {
            //btnInscribir.setEnabled(false);
        }
    }

    public void cargarClasesBono() {
        java.util.List<Clase> clases;
        ModeloTablaClases mu = (ModeloTablaClases) tablaClasesBono.getModel();
        clases = fa.consultarClasesBono(this.bono.getId_bono());
        mu.setFilas(clases);
    }
}
