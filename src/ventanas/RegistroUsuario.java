/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;


import javax.swing.JOptionPane;

/**
 *
 * @author Juan Camilo
 */
public class RegistroUsuario extends javax.swing.JFrame {



    public RegistroUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private void guardarUsuario(String nombre, String apellido, String contrasena, String tipoUsuario) {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1Titulo = new javax.swing.JLabel();
        jTextField1NombreUsuario1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField1ApellidoUsuario = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jTextField1ContrasenaUsuario = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jComboBox1TipoUsuario = new javax.swing.JComboBox<>();
        jLabel1User = new javax.swing.JLabel();
        jLabel2Aca = new javax.swing.JLabel();
        jLabel1FlechaAtras = new javax.swing.JLabel();
        jButton1RegistrarUsuarioB = new javax.swing.JButton();
        jLabel1Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1Titulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1Titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1Titulo.setText("REGISTRO DE USUARIO");
        getContentPane().add(jLabel1Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 450, -1));

        jTextField1NombreUsuario1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1NombreUsuario1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1NombreUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1NombreUsuario1.setText("Nombre");
        jTextField1NombreUsuario1.setBorder(null);
        jTextField1NombreUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1NombreUsuario1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1NombreUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 200, 30));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 200, 20));

        jTextField1ApellidoUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1ApellidoUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1ApellidoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1ApellidoUsuario.setText("Apellido");
        jTextField1ApellidoUsuario.setBorder(null);
        jTextField1ApellidoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ApellidoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1ApellidoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 200, 30));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 200, 20));

        jTextField1ContrasenaUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1ContrasenaUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1ContrasenaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1ContrasenaUsuario.setText("Contraseña");
        jTextField1ContrasenaUsuario.setBorder(null);
        jTextField1ContrasenaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ContrasenaUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1ContrasenaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 200, 30));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 200, 20));

        jComboBox1TipoUsuario.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox1TipoUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1TipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jefe", "Empleado" }));
        jComboBox1TipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1TipoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1TipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 200, 40));

        jLabel1User.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Webp.net-resizeimage.png"))); // NOI18N
        getContentPane().add(jLabel1User, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 450, 160));

        jLabel2Aca.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2Aca.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2Aca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2Aca.setText("Tipo de usuario");
        getContentPane().add(jLabel2Aca, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 200, -1));

        jLabel1FlechaAtras.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1FlechaAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Picture4.png"))); // NOI18N
        jLabel1FlechaAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1FlechaAtrasMouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1FlechaAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 50, 50));

        jButton1RegistrarUsuarioB.setBackground(new java.awt.Color(0, 102, 102));
        jButton1RegistrarUsuarioB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1RegistrarUsuarioB.setText("Registrar");
        jButton1RegistrarUsuarioB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1RegistrarUsuarioBActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1RegistrarUsuarioB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 130, 40));

        jLabel1Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
        getContentPane().add(jLabel1Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1NombreUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1NombreUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1NombreUsuario1ActionPerformed

    private void jTextField1ApellidoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ApellidoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ApellidoUsuarioActionPerformed

    private void jTextField1ContrasenaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ContrasenaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ContrasenaUsuarioActionPerformed

    private void jComboBox1TipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1TipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1TipoUsuarioActionPerformed

    private void jLabel1FlechaAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1FlechaAtrasMouseClicked
        Login LI = new Login();
        LI.show();
        dispose();
    }//GEN-LAST:event_jLabel1FlechaAtrasMouseClicked

    private void jButton1RegistrarUsuarioBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1RegistrarUsuarioBActionPerformed
        // TODO add your handling code here:
        Login LI = new Login();
        String nombre = jTextField1NombreUsuario1.getText();
        String apellido = jTextField1ApellidoUsuario.getText();
        String contrasena = jTextField1ContrasenaUsuario.getText();
        String Tipou = jComboBox1TipoUsuario.getSelectedItem().toString();
      
        LI.llenaUs();
        LI.setUsuarios(nombre, apellido, contrasena, Tipou);
        LI.show();
        dispose();

    }//GEN-LAST:event_jButton1RegistrarUsuarioBActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1RegistrarUsuarioB;
    public static javax.swing.JComboBox<String> jComboBox1TipoUsuario;
    private javax.swing.JLabel jLabel1FlechaAtras;
    private javax.swing.JLabel jLabel1Fondo;
    private javax.swing.JLabel jLabel1Titulo;
    private javax.swing.JLabel jLabel1User;
    private javax.swing.JLabel jLabel2Aca;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public static javax.swing.JTextField jTextField1ApellidoUsuario;
    public static javax.swing.JTextField jTextField1ContrasenaUsuario;
    public static javax.swing.JTextField jTextField1NombreUsuario1;
    // End of variables declaration//GEN-END:variables
}