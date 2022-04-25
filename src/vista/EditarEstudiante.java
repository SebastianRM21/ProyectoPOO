/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.EditarController;
import controlador.EstudianteController;
import java.io.IOException;
import javax.swing.JOptionPane;
import modelo.Estudiante;

/**
 *
 * @author Sebastian Rosero
 */
public class EditarEstudiante extends javax.swing.JFrame {

    EditarController controlEditar = new EditarController();
    EstudianteController controlEstudiante = new EstudianteController();

    public EditarEstudiante() {
        initComponents();
//llenamos los campos con el estudiante seleccionado 
        controlEditar.llenarCampos(inputNombre, InputSegundoNombre, InputApellido, InputSegundoApellido, InputId, InputUsuario, InputPass, CrearEstudiante.editarEstudiante);
        jLabelIconError.setVisible(false);
        jLabelIconError1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        InputSegundoNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        InputApellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        InputSegundoApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        InputId = new javax.swing.JTextField();
        jLabelIconError = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        InputUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        InputPass = new javax.swing.JTextField();
        jLabelIconError1 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre:");

        inputNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputNombreKeyTyped(evt);
            }
        });

        jLabel9.setText("Segundo Nombre:");

        jLabel13.setText("No es obligatorio llenar segundo nombre");

        InputSegundoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                InputSegundoNombreKeyTyped(evt);
            }
        });

        jLabel4.setText("Primer Apellido:");

        InputApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                InputApellidoKeyTyped(evt);
            }
        });

        jLabel8.setText("Segundo Apellido:");

        jLabel12.setText("No es obligatorio llenar segundo apellido");

        InputSegundoApellido.setToolTipText("");
        InputSegundoApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                InputSegundoApellidoKeyTyped(evt);
            }
        });

        jLabel3.setText("Identificación");

        InputId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                InputIdKeyTyped(evt);
            }
        });

        jLabelIconError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngwing.com (4).png"))); // NOI18N

        jLabel6.setText("Usuario:");

        InputUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                InputUsuarioKeyTyped(evt);
            }
        });

        jLabel5.setText("Contraseña:");

        InputPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                InputPassKeyTyped(evt);
            }
        });

        jLabelIconError1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngwing.com (4).png"))); // NOI18N

        btnEditar.setBackground(new java.awt.Color(51, 255, 51));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(InputSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(InputApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(InputId, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabelIconError))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(100, 100, 100)
                        .addComponent(InputUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(InputPass, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabelIconError1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(InputSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(InputSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(InputApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(InputSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIconError))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIconError1))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 70, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputNombreKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z'))
            evt.consume();
    }//GEN-LAST:event_inputNombreKeyTyped

    private void InputSegundoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InputSegundoNombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z'))
            evt.consume();
    }//GEN-LAST:event_InputSegundoNombreKeyTyped

    private void InputApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InputApellidoKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z'))
            evt.consume();
    }//GEN-LAST:event_InputApellidoKeyTyped

    private void InputSegundoApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InputSegundoApellidoKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z'))
            evt.consume();
    }//GEN-LAST:event_InputSegundoApellidoKeyTyped

    private void InputIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InputIdKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9'))
            evt.consume();
    }//GEN-LAST:event_InputIdKeyTyped

    private void InputUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InputUsuarioKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c < 'a' || c > 'z') && (c < 'A' || c > 'Z'))
            evt.consume();
    }//GEN-LAST:event_InputUsuarioKeyTyped

    private void InputPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InputPassKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != '.'))
            evt.consume();
    }//GEN-LAST:event_InputPassKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//si se cancela la edicion el estudiante vuelve con la informacion que ya tenia         
        try {
            controlEstudiante.guardarEstudiante(CrearEstudiante.editarEstudiante);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, "Error al actualizar el estudiante en el archivo");
        }

        this.dispose();
        CrearEstudiante vistaCrear = new CrearEstudiante();
        vistaCrear.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed


    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        jLabelIconError.setVisible(false);
        jLabelIconError1.setVisible(false);
//validacion de campos vacios       
        boolean verificador = controlEstudiante.camposVacios(inputNombre.getText(), InputApellido.getText(), InputId.getText(), InputUsuario.getText(), InputPass.getText());
        if (verificador) {
            JOptionPane.showMessageDialog(this, "Algunos campos estas vacios, por favor llenelos primero");
        } else {
//concatenan los nombres y apellidos
            String nombres = controlEstudiante.concatenarVerificarDatosPersonales(inputNombre.getText(), InputSegundoNombre.getText());
            String apellidos = controlEstudiante.concatenarVerificarDatosPersonales(InputApellido.getText(), InputSegundoApellido.getText());
//verifica los campos contraseña, identificacion y contraseña           
            if (!controlEstudiante.verificadorIdIgualDiez(InputId.getText())) {
                JOptionPane.showMessageDialog(this, "Ingrese un identificador de 10 digitos");
                InputId.requestFocus();
                jLabelIconError.setVisible(true);
            }
            if (!controlEstudiante.verificarTamanoContrasena(InputPass.getText().length())) {
                JOptionPane.showMessageDialog(this, "Por favor, para seguridad, inserte una contraseña con más de 7 caracteres");
                InputPass.requestFocus();
                jLabelIconError1.setVisible(true);
            }

            boolean verificadorEstudianteNombreApellidoRepetido = true;
            boolean verificadorEstudianteIdRepetido = true;
            boolean verificadorEstudianteUserRepetido = true;

            try {
//verifica que la informacion del estudiante no este creada anteriormente 
                verificadorEstudianteNombreApellidoRepetido = controlEstudiante.verificadorEstRepetido(nombres, apellidos);
                verificadorEstudianteIdRepetido = controlEstudiante.verificadorEstIdRepetido(InputId.getText());
                verificadorEstudianteUserRepetido = controlEstudiante.verificadorEstUserRepetido(InputUsuario.getText());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(rootPane, "Error al validar el estudiante en el archivo");
            }

            if (!verificadorEstudianteNombreApellidoRepetido && !verificadorEstudianteIdRepetido) {
                if (!verificadorEstudianteUserRepetido) {
                    if (controlEstudiante.verificarTamanoContrasena(InputPass.getText().length()) && controlEstudiante.verificadorIdIgualDiez(InputId.getText())) {
//si pasa todas las validaciones anterirores se crea el estudiante
                        try {
                            Estudiante estudiante = new Estudiante(nombres, apellidos, InputId.getText(), InputUsuario.getText(), InputPass.getText());
                            controlEstudiante.guardarEstudiante(estudiante);
                            JOptionPane.showMessageDialog(this, "Estudiante actualizado exitosamente");
                            controlEstudiante.limpiarCamposTexto(inputNombre, InputSegundoNombre, InputApellido, InputSegundoApellido, InputId, InputUsuario, InputPass);

                            jLabelIconError.setVisible(false);
                            jLabelIconError1.setVisible(false);
                        } catch (IOException e) {
                            controlEstudiante.limpiarCamposTexto(inputNombre, InputSegundoNombre, InputApellido, InputSegundoApellido, InputId, InputUsuario, InputPass);
                            jLabelIconError.setVisible(false);
                            jLabelIconError1.setVisible(false);
//si ocurre algun error en el archivo nos imprime este mensaje 
                            JOptionPane.showMessageDialog(rootPane, "Error al guardar al estuddiante en el archivo");
                        }
                        this.dispose();
                        CrearEstudiante vistaCrear = new CrearEstudiante();
                        vistaCrear.setVisible(true);

                    }
                } else {
                    JOptionPane.showMessageDialog(this, "El usario ya existe");
                }

            } else {
                if (verificadorEstudianteNombreApellidoRepetido) {
                    JOptionPane.showMessageDialog(this, "Ya hay un estudiante con los mismo nombres y apellidos");
                } else {
                    if (verificadorEstudianteIdRepetido) {
                        JOptionPane.showMessageDialog(this, "Ya hay un estudiante con la misma identificación");
                        InputId.requestFocus();
                        jLabelIconError.setVisible(true);
                    }
                }
            }

        }


    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(EditarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputApellido;
    private javax.swing.JTextField InputId;
    private javax.swing.JTextField InputPass;
    private javax.swing.JTextField InputSegundoApellido;
    private javax.swing.JTextField InputSegundoNombre;
    private javax.swing.JTextField InputUsuario;
    private javax.swing.JButton btnEditar;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelIconError;
    private javax.swing.JLabel jLabelIconError1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
