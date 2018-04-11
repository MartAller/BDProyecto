/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import aplicacion.Clase;
import aplicacion.Usuario;

/**
 *
 * @author hammamboutafant
 */
public class VAdmin extends javax.swing.JFrame {

    aplicacion.FachadaAplicacion fa;

    /**
     * Creates new form VAdmin
     */
    public VAdmin(aplicacion.FachadaAplicacion fa) {
        this.fa = fa;
        initComponents();
        //cargarDatos();
        btnAcceder.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JTabbedPane();
        panelCuenta = new javax.swing.JPanel();
        panelBonos = new javax.swing.JPanel();
        buscaIdBono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        buscaPalabrasClave = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaBonos = new javax.swing.JTable();
        btnBuscarBono = new javax.swing.JButton();
        checkBonos = new javax.swing.JCheckBox();
        panelClases = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaClases = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panelMantenimiento = new javax.swing.JPanel();
        panelFinanzas = new javax.swing.JPanel();
        panelUsuarios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        buscaId = new javax.swing.JTextField();
        buscaNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnAcceder = new javax.swing.JButton();
        comboTipo = new javax.swing.JComboBox();
        Nuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelCuentaLayout = new javax.swing.GroupLayout(panelCuenta);
        panelCuenta.setLayout(panelCuentaLayout);
        panelCuentaLayout.setHorizontalGroup(
            panelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 716, Short.MAX_VALUE)
        );
        panelCuentaLayout.setVerticalGroup(
            panelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
        );

        panelPrincipal.addTab("Cuenta", panelCuenta);

        jLabel3.setText("Id Bono");

        jLabel4.setText("Palabras clave");

        tablaBonos.setModel(new ModeloTablaBonos());
        jScrollPane4.setViewportView(tablaBonos);

        btnBuscarBono.setText("Buscar");
        btnBuscarBono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarBonoActionPerformed(evt);
            }
        });

        checkBonos.setText("Buscar sólo bonos NO caducados");

        javax.swing.GroupLayout panelBonosLayout = new javax.swing.GroupLayout(panelBonos);
        panelBonos.setLayout(panelBonosLayout);
        panelBonosLayout.setHorizontalGroup(
            panelBonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBonosLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscaIdBono, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscaPalabrasClave, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
            .addGroup(panelBonosLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panelBonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelBonosLayout.createSequentialGroup()
                        .addComponent(checkBonos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarBono))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBonosLayout.setVerticalGroup(
            panelBonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBonosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelBonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscaIdBono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(buscaPalabrasClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarBono)
                    .addComponent(checkBonos))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        panelPrincipal.addTab("Bonos", panelBonos);

        tablaClases.setModel(new ModeloTablaClases());
        jScrollPane3.setViewportView(tablaClases);

        jButton1.setText("Nueva clase");

        jButton2.setText("Editar clase");

        javax.swing.GroupLayout panelClasesLayout = new javax.swing.GroupLayout(panelClases);
        panelClases.setLayout(panelClasesLayout);
        panelClasesLayout.setHorizontalGroup(
            panelClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClasesLayout.createSequentialGroup()
                .addGroup(panelClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClasesLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelClasesLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jButton1)
                        .addGap(57, 57, 57)
                        .addComponent(jButton2)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        panelClasesLayout.setVerticalGroup(
            panelClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClasesLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(panelClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(37, 37, 37))
        );

        panelPrincipal.addTab("Clases", panelClases);

        javax.swing.GroupLayout panelMantenimientoLayout = new javax.swing.GroupLayout(panelMantenimiento);
        panelMantenimiento.setLayout(panelMantenimientoLayout);
        panelMantenimientoLayout.setHorizontalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 716, Short.MAX_VALUE)
        );
        panelMantenimientoLayout.setVerticalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
        );

        panelPrincipal.addTab("Mantenimiento", panelMantenimiento);

        javax.swing.GroupLayout panelFinanzasLayout = new javax.swing.GroupLayout(panelFinanzas);
        panelFinanzas.setLayout(panelFinanzasLayout);
        panelFinanzasLayout.setHorizontalGroup(
            panelFinanzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 716, Short.MAX_VALUE)
        );
        panelFinanzasLayout.setVerticalGroup(
            panelFinanzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
        );

        panelPrincipal.addTab("Finanzas", panelFinanzas);

        tablaUsuarios.setModel(new ModeloTablaUsuarios());
        jScrollPane2.setViewportView(tablaUsuarios);

        jScrollPane1.setViewportView(jScrollPane2);

        jLabel1.setText("Id");

        jLabel2.setText("Nombre");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAcceder.setText("Acceder a usuario");
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "Socio Normal", "Socio Prémium", "Administrador", "Mantenimiento", "Profesor" }));

        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelUsuariosLayout = new javax.swing.GroupLayout(panelUsuarios);
        panelUsuarios.setLayout(panelUsuariosLayout);
        panelUsuariosLayout.setHorizontalGroup(
            panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelUsuariosLayout.createSequentialGroup()
                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUsuariosLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscaId, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelUsuariosLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnAcceder)
                        .addGap(58, 58, 58)
                        .addComponent(Nuevo)
                        .addGap(57, 57, 57)
                        .addComponent(btnBuscar)))
                .addContainerGap(216, Short.MAX_VALUE))
        );
        panelUsuariosLayout.setVerticalGroup(
            panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuariosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAcceder)
                    .addComponent(btnBuscar)
                    .addComponent(Nuevo))
                .addGap(35, 35, 35))
        );

        panelPrincipal.addTab("Usuarios", panelUsuarios);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPrincipal)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addGap(19, 19, 19)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        ModeloTablaUsuarios m;

        m = (ModeloTablaUsuarios) tablaUsuarios.getModel();/*ModeloTablaLibros extiende a AbstractTableModel*/

        //Guardo en el objeto tabla los resultados obtenidos
        m.setFilas(fa.consultarUsuarios((buscaId.getText().isEmpty()) ? null : buscaId.getText(),
                (buscaNombre.getText().isEmpty()) ? null : buscaNombre.getText(), comboTipo.getSelectedItem().toString()));
        /*Si el campo id está vacío se pone a null*/

        //Si la tabla obtenida tras la búsqueda tiene alguna fila:
        if (m.getRowCount() > 0) {
            tablaUsuarios.setRowSelectionInterval(0, 0);//Por defecto selecciono la fila 0
            btnAcceder.setEnabled(true);
        } else {
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_NuevoActionPerformed

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        // TODO add your handling code here:
        fa.NuevoUsuario();
    }//GEN-LAST:event_btnAccederActionPerformed

    private void btnBuscarBonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarBonoActionPerformed
        // TODO add your handling code here:
        ModeloTablaBonos m;
        
        m = (ModeloTablaBonos) tablaBonos.getModel();/*ModeloTablaLibros extiende a AbstractTableModel*/

        //Guardo en el objeto tabla los resultados obtenidos
        m.setFilas(fa.consultarBonos((buscaIdBono.getText().isEmpty()) ? null : Integer.parseInt(buscaIdBono.getText()),
                (buscaPalabrasClave.getText().isEmpty()) ? null : buscaPalabrasClave.getText(), checkBonos.isSelected()));
        /*Si el campo id está vacío se pone a null*/

        //Si la tabla obtenida tras la búsqueda tiene alguna fila:
        if (m.getRowCount() > 0) {
            tablaBonos.setRowSelectionInterval(0, 0);//Por defecto selecciono la fila 0
            //btnAcceder.setEnabled(true);
        }
    }//GEN-LAST:event_btnBuscarBonoActionPerformed



    public void actualizarUsuarios() {
        java.util.List<Usuario> usuarios;

        ModeloTablaUsuarios mu = (ModeloTablaUsuarios) tablaUsuarios.getModel();
        usuarios = fa.consultarUsuarios(null, null, null);

        mu.setFilas(usuarios);//Cada fila es un ejemplar
        if (mu.getRowCount() > 0) {
            tablaUsuarios.setRowSelectionInterval(0, 0);
            btnAcceder.setEnabled(true);
        } else {
            btnAcceder.setEnabled(false);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Nuevo;
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarBono;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField buscaId;
    private javax.swing.JTextField buscaIdBono;
    private javax.swing.JTextField buscaNombre;
    private javax.swing.JTextField buscaPalabrasClave;
    private javax.swing.JCheckBox checkBonos;
    private javax.swing.JComboBox comboTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel panelBonos;
    private javax.swing.JPanel panelClases;
    private javax.swing.JPanel panelCuenta;
    private javax.swing.JPanel panelFinanzas;
    private javax.swing.JPanel panelMantenimiento;
    private javax.swing.JTabbedPane panelPrincipal;
    private javax.swing.JPanel panelUsuarios;
    private javax.swing.JTable tablaBonos;
    private javax.swing.JTable tablaClases;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables


    public void cargarDatos(){
        java.util.List<Clase> clases;
        ModeloTablaClases mu = (ModeloTablaClases) tablaClases.getModel();
        clases = fa.mostrarClases(null);
        mu.setFilas(clases);
    }
}
