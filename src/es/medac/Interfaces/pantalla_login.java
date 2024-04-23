/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package es.medac.Interfaces;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class pantalla_login extends javax.swing.JFrame {

    /**
     * Creates new form pantalla_login
     */
    public pantalla_login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtUsername = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jtPassword = new javax.swing.JPasswordField();
        fondo_login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(jtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 200, 60));

        btn_login.setBackground(new java.awt.Color(232, 230, 216));
        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_login.setForeground(new java.awt.Color(33, 42, 58));
        btn_login.setText("LOGIN");
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_loginMouseExited(evt);
            }
        });
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 110, 30));

        btn_salir.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(33, 42, 58));
        btn_salir.setText("X");
        btn_salir.setContentAreaFilled(false);
        btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_salirMouseExited(evt);
            }
        });
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, -1, -1));
        getContentPane().add(jtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 200, 60));

        fondo_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login.jpg"))); // NOI18N
        getContentPane().add(fondo_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -3, 940, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtUsernameActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        JFrame pantalla_inicio = new pantalla_inicio();
        
        String username = jtUsername.getText();
        String password = jtPassword.getText();
        
        if(username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(null,"Algun campo esta incompleto");
        }
        else{
            if(username.equals("cmd0011") && password.equals("Medac_0011")){
                pantalla_inicio.setVisible(true);
                this.setVisible(false);
              
            }
            
            else if(username.equals("mim0003") && password.equals("Medac_0003")){
                pantalla_inicio.setVisible(true);
                this.setVisible(false);
                
            }
            
            else if(username.equals("acr0062") && password.equals("Medac_0062")){
                pantalla_inicio.setVisible(true);
                this.setVisible(false);
                
            }
            
            else{
                JOptionPane.showMessageDialog(null,"Algun campo es incorrecto");
            }
            
        }
        
        
        
        
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseEntered
        // TODO add your handling code here:
        btn_login.setBounds(455, 515, 120, 40);
    }//GEN-LAST:event_btn_loginMouseEntered

    private void btn_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseExited
        // TODO add your handling code here:
        btn_login.setBounds(460, 520, 110, 30);
    }//GEN-LAST:event_btn_loginMouseExited

    private void btn_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseEntered
        // TODO add your handling code here:
        btn_salir.setFont(new Font(btn_salir.getFont().getName(), Font.BOLD, btn_salir.getFont().getSize() + 5));
    }//GEN-LAST:event_btn_salirMouseEntered

    private void btn_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseExited
        // TODO add your handling code here:
        btn_salir.setFont(new Font(btn_salir.getFont().getName(), Font.BOLD, btn_salir.getFont().getSize() - 5));
    }//GEN-LAST:event_btn_salirMouseExited

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
            java.util.logging.Logger.getLogger(pantalla_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantalla_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantalla_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantalla_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantalla_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel fondo_login;
    private javax.swing.JPasswordField jtPassword;
    private javax.swing.JTextField jtUsername;
    // End of variables declaration//GEN-END:variables
}
