package com.example.gui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.example.data.Usuarios;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.border.Border;
import java.awt.Color;

public class GestionarUsuarios extends javax.swing.JFrame {

    static ArrayList<Usuarios> ListaUsuarios = new ArrayList<Usuarios>();

    public ArrayList<Usuarios> getListaUsuarios() {
        return ListaUsuarios;
    }

    DefaultTableModel modelo;

    public GestionarUsuarios() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("Tipo");
        modelo.addColumn("Identificación");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Telefono");
        modelo.addColumn("Rol");
        this.jTable1.setModel(modelo);

        cargardatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tipoDocumento = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        numeroIdentificacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        apellidosUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        telefonoUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tipoRol = new javax.swing.JComboBox<>();
        crearUsuario = new javax.swing.JButton();
        editarUsuario = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        contrasenaUsuario = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        eliminarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Tipo de Identificación");

        tipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula de Ciudadanía ", "Tarjeta de Identidad" }));
        tipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoDocumentoActionPerformed(evt);
            }
        });

        jLabel2.setText("Numero de Identificación");

        numeroIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroIdentificacionActionPerformed(evt);
            }
        });
        numeroIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroIdentificacionKeyTyped(evt);
            }
        });

        jLabel3.setText("Nombres");

        jLabel4.setText("Apellidos");

        apellidosUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidosUsuarioActionPerformed(evt);
            }
        });

        jLabel5.setText("Contraseña");

        jLabel6.setText("Telefono");

        telefonoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoUsuarioKeyTyped(evt);
            }
        });

        jLabel7.setText("Rol");

        tipoRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Capataz" }));

        crearUsuario.setText("Crear Usuario");
        crearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearUsuarioActionPerformed(evt);
            }
        });

        editarUsuario.setText("Editar Usuario");
        editarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarUsuarioActionPerformed(evt);
            }
        });

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(crearUsuario)
                .addGap(43, 43, 43)
                .addComponent(editarUsuario)
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreUsuario)
                            .addComponent(apellidosUsuario)
                            .addComponent(numeroIdentificacion)
                            .addComponent(telefonoUsuario)
                            .addComponent(tipoRol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tipoDocumento, 0, 167, Short.MAX_VALUE)
                            .addComponent(contrasenaUsuario))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(numeroIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(apellidosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(contrasenaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(telefonoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tipoRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearUsuario)
                    .addComponent(editarUsuario))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tipo", "Identificación", "Nombres", "Apellidos", "Telefono", "Rol"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        eliminarUsuario.setText("Eliminar");
        eliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(eliminarUsuario)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eliminarUsuario)
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoDocumentoActionPerformed

    private void numeroIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroIdentificacionActionPerformed

    private void apellidosUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidosUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidosUsuarioActionPerformed

    private void crearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearUsuarioActionPerformed

        Usuarios usuario = new Usuarios();
        usuario.setTipoDocumento(tipoDocumento.getSelectedItem().toString());
        if (numeroIdentificacion.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben ser rellenados", "Numero de Identificacion Incorrecto", JOptionPane.ERROR_MESSAGE);
            numeroIdentificacion.setBackground(new Color(248, 135, 110));

        } else if (nombreUsuario.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben ser rellenados", "Nombre Incorrecto", JOptionPane.ERROR_MESSAGE);
            nombreUsuario.setBackground(new Color(248, 135, 110));

        } else if (apellidosUsuario.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben ser rellenados", "Apellido Incorrecto", JOptionPane.ERROR_MESSAGE);
            apellidosUsuario.setBackground(new Color(248, 135, 110));

        } else if (contrasenaUsuario.getPassword().equals("")) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben ser rellenados", "Contraseña Incorrecta", JOptionPane.ERROR_MESSAGE);
            contrasenaUsuario.setBackground(new Color(248, 135, 110));

        } else if (contrasenaUsuario.getPassword().length < 8) {
            JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos 8 caracteres", "Contraseña Incorrecta", JOptionPane.ERROR_MESSAGE);
            contrasenaUsuario.setBackground(new Color(248, 135, 110));

        } else if (telefonoUsuario.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben ser rellenados", "Telefono incorrecto", JOptionPane.ERROR_MESSAGE);
            telefonoUsuario.setBackground(new Color(248, 135, 110));

        } else if (telefonoUsuario.getText().charAt(0) != '3' || telefonoUsuario.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "El numero de telefono debe empezar por 3 y debe tener 10 digitos", "Telefono incorrecto", JOptionPane.ERROR_MESSAGE);
            telefonoUsuario.setBackground(new Color(248, 135, 110));
        } else {

            usuario.setDocumento(numeroIdentificacion.getText());
            usuario.setNombres(nombreUsuario.getText());
            usuario.setApellidos(apellidosUsuario.getText());
            usuario.setContraseña(contrasenaUsuario.getPassword().toString());
            usuario.setTelefono(telefonoUsuario.getText());
            usuario.setRol(tipoRol.getSelectedItem().toString());
            ListaUsuarios.add(usuario);
            JOptionPane.showMessageDialog(null, "Usuario creado exitosamente");

            String[] datos = new String[6];
            datos[0] = tipoDocumento.getItemAt(0);
            datos[1] = numeroIdentificacion.getText();
            datos[2] = nombreUsuario.getText();
            datos[3] = apellidosUsuario.getText();
            datos[4] = telefonoUsuario.getText();
            datos[5] = tipoRol.getItemAt(0);

            modelo.addRow(datos);

            tipoDocumento.setSelectedIndex(0);
            contrasenaUsuario.setText("");
            numeroIdentificacion.setText("");
            nombreUsuario.setText("");
            apellidosUsuario.setText("");
            telefonoUsuario.setText("");
            tipoRol.getEditor().setItem(0);

            contrasenaUsuario.setBackground(Color.white);
            numeroIdentificacion.setBackground(Color.white);
            nombreUsuario.setBackground(Color.white);
            apellidosUsuario.setBackground(Color.white);
            telefonoUsuario.setBackground(Color.white);

        }

        System.out.println(ListaUsuarios);


    }//GEN-LAST:event_crearUsuarioActionPerformed

    private void editarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarUsuarioActionPerformed


    }//GEN-LAST:event_editarUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        new Menu().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void eliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarUsuarioActionPerformed
        if (jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun usuario", "Usuario sin seleccionar", JOptionPane.WARNING_MESSAGE);
        } else {

            int indexOf = -1;
            String valuedocumento = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();

            for (Usuarios listaUsuarios : ListaUsuarios) {
                if (listaUsuarios.getDocumento().equalsIgnoreCase(valuedocumento)) {
                    indexOf = ListaUsuarios.indexOf(listaUsuarios);
                    break;
                }

            }
            if (indexOf != -1) {
                ListaUsuarios.remove(indexOf);
            }
            modelo.removeRow(jTable1.getSelectedRow());
        }
    }//GEN-LAST:event_eliminarUsuarioActionPerformed

    private void numeroIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroIdentificacionKeyTyped
        if (evt.getKeyChar() < 48 || evt.getKeyChar() > 57) {
            evt.consume();
        }
    }//GEN-LAST:event_numeroIdentificacionKeyTyped

    private void telefonoUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoUsuarioKeyTyped
        if (evt.getKeyChar() < 48 || evt.getKeyChar() > 57) {
            evt.consume();
        }
    }//GEN-LAST:event_telefonoUsuarioKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidosUsuario;
    private javax.swing.JPasswordField contrasenaUsuario;
    private javax.swing.JButton crearUsuario;
    private javax.swing.JButton editarUsuario;
    private javax.swing.JButton eliminarUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombreUsuario;
    private javax.swing.JTextField numeroIdentificacion;
    private javax.swing.JTextField telefonoUsuario;
    private javax.swing.JComboBox<String> tipoDocumento;
    private javax.swing.JComboBox<String> tipoRol;
    // End of variables declaration//GEN-END:variables

    private void cargardatos() {

        for (Usuarios u : ListaUsuarios) {

            String[] datos = new String[6];
            datos[0] = u.getTipoDocumento();
            datos[1] = u.getDocumento();
            datos[2] = u.getNombres();
            datos[3] = u.getApellidos();
            datos[4] = u.getTelefono();
            datos[5] = u.getRol();

            modelo.addRow(datos);
        }

    }
}
