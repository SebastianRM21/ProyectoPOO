/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.UsuarioController;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastian Rosero
 */
public class Login extends javax.swing.JFrame {

    UsuarioController controladorUsuario = new UsuarioController();

    public Login() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFondo = new javax.swing.JPanel();
        inputUser = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        inputpass = new javax.swing.JPasswordField();
        lblValidUser = new javax.swing.JLabel();
        lblValiPass = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(900, 570));
        setMinimumSize(new java.awt.Dimension(900, 570));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 570));

        lblFondo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUserActionPerformed(evt);
            }
        });
        lblFondo.add(inputUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 190, 30));

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setText("Iniciar Sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        lblFondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 150, 40));
        lblFondo.add(inputpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 190, 30));

        lblValidUser.setForeground(new java.awt.Color(255, 0, 0));
        lblFondo.add(lblValidUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 190, 14));

        lblValiPass.setForeground(new java.awt.Color(255, 0, 0));
        lblFondo.add(lblValiPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 180, 16));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Log in");
        lblFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 140, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Contraseña:");
        lblFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 100, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Usuario:");
        lblFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 100, 20));

        jLabel5.setBackground(new java.awt.Color(255, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/unnamed.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        lblFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/WhatsApp Image 2022-02-28 at 12.47.56 PM.jpeg"))); // NOI18N
        lblFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 400, 560));

        jLabel6.setBackground(new java.awt.Color(255, 0, 51));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oleg-laptev-7jQh3EiS8Bs-unsplash.jpg"))); // NOI18N
        lblFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//validamos los campos
        if (controladorUsuario.validarCamposUsuario(inputUser, inputpass)) {
            try {
//identificamos el rol
                int rol;
                rol = controladorUsuario.inicioSesion(inputUser.getText(), inputpass.getText());
                if (rol == 0) {
                    MenuProfesor menu = new MenuProfesor();
                    menu.setVisible(true);
                    this.dispose();
                }
                if (rol == 1) {
                    MenuEstudiante menuEstudiante = new MenuEstudiante();
                    menuEstudiante.setVisible(true);
                    this.dispose();
                }
                if (rol == 2) {
                    JOptionPane.showMessageDialog(this, "Las credenciales son invalidas");
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(rootPane, "Error al validar los datos en el archivo");
            }
//se limpian los campos y las advertencias
            controladorUsuario.limpiarCampos(inputUser, inputpass);
            controladorUsuario.limpiarLabels(lblValidUser, lblValiPass);
        } else {
//indicamos que campo esta vacio 
            if (inputUser.getText().equals("")) {
                lblValidUser.setText("Campo vacio");
            } else {
                lblValidUser.setText("");
            }
            if (inputpass.getText().equals("")) {
                lblValiPass.setText("Campo vacio");
            } else {
                lblValiPass.setText("");
            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputUser;
    private javax.swing.JPasswordField inputpass;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel lblFondo;
    private javax.swing.JLabel lblValiPass;
    private javax.swing.JLabel lblValidUser;
    // End of variables declaration//GEN-END:variables

}
