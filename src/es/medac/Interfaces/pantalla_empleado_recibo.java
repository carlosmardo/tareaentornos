/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package es.medac.Interfaces;

import es.medac.ProyectoInterfaces.Empleado_Recibo;
import javax.swing.JFrame;

/**
 *
 * @author carlo
 */
public class pantalla_empleado_recibo extends javax.swing.JFrame {

    /**
     * Creates new form pantalla_empleado_recibo
     */
    public pantalla_empleado_recibo() {
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

        titulo_empleado_recibo = new javax.swing.JLabel();
        btn_procesar = new javax.swing.JButton();
        jApellidos = new javax.swing.JTextField();
        jtApellidos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textarea_emp_rec = new javax.swing.JTextArea();
        jtDNI = new javax.swing.JLabel();
        jDNI = new javax.swing.JTextField();
        jtNombre = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jtDireccion = new javax.swing.JLabel();
        jDireccion = new javax.swing.JTextField();
        jtEdad = new javax.swing.JLabel();
        jEdad = new javax.swing.JTextField();
        jtEstudios = new javax.swing.JLabel();
        jtExperiencia = new javax.swing.JLabel();
        jExperiencia = new javax.swing.JTextField();
        jtHRTRABAJADAS = new javax.swing.JLabel();
        jHRTRABAJADAS = new javax.swing.JTextField();
        jtPAGOHORA = new javax.swing.JLabel();
        jPAGOHORA = new javax.swing.JTextField();
        jtRECIBO = new javax.swing.JLabel();
        jRECIBO = new javax.swing.JTextField();
        jComboEstudios = new javax.swing.JComboBox<>();
        btn_limpiar = new javax.swing.JButton();
        btn_volvermenu = new javax.swing.JButton();
        fondo_empleado_recibo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo_empleado_recibo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titulo_empleado_recibo.setForeground(new java.awt.Color(228, 224, 210));
        titulo_empleado_recibo.setText("EMPLEADO RECIBO");
        getContentPane().add(titulo_empleado_recibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 260, 90));

        btn_procesar.setBackground(new java.awt.Color(228, 224, 210));
        btn_procesar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_procesar.setForeground(new java.awt.Color(31, 40, 55));
        btn_procesar.setText("PROCESAR");
        btn_procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_procesarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_procesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, -1, -1));

        jApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jApellidosActionPerformed(evt);
            }
        });
        getContentPane().add(jApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 120, 30));

        jtApellidos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtApellidos.setForeground(new java.awt.Color(230, 227, 213));
        jtApellidos.setText("APELLIDO:");
        getContentPane().add(jtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, 20));

        textarea_emp_rec.setColumns(20);
        textarea_emp_rec.setRows(5);
        jScrollPane2.setViewportView(textarea_emp_rec);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 380, 490));

        jtDNI.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtDNI.setForeground(new java.awt.Color(230, 227, 213));
        jtDNI.setText("DNI:");
        getContentPane().add(jtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 80, 20));

        jDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDNIActionPerformed(evt);
            }
        });
        getContentPane().add(jDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 120, 30));

        jtNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtNombre.setForeground(new java.awt.Color(230, 227, 213));
        jtNombre.setText("NOMBRE:");
        getContentPane().add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 80, 20));

        jNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 120, 30));

        jtDireccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtDireccion.setForeground(new java.awt.Color(230, 227, 213));
        jtDireccion.setText("DIRECCION:");
        getContentPane().add(jtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 90, 20));

        jDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDireccionActionPerformed(evt);
            }
        });
        getContentPane().add(jDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 120, 30));

        jtEdad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtEdad.setForeground(new java.awt.Color(230, 227, 213));
        jtEdad.setText("EDAD:");
        getContentPane().add(jtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 80, 20));

        jEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEdadActionPerformed(evt);
            }
        });
        getContentPane().add(jEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 120, 30));

        jtEstudios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtEstudios.setForeground(new java.awt.Color(230, 227, 213));
        jtEstudios.setText("ESTUDIOS:");
        getContentPane().add(jtEstudios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 80, 20));

        jtExperiencia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtExperiencia.setForeground(new java.awt.Color(230, 227, 213));
        jtExperiencia.setText("EXPERIENCIA:");
        getContentPane().add(jtExperiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 100, 20));

        jExperiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExperienciaActionPerformed(evt);
            }
        });
        getContentPane().add(jExperiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 120, 30));

        jtHRTRABAJADAS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtHRTRABAJADAS.setForeground(new java.awt.Color(230, 227, 213));
        jtHRTRABAJADAS.setText("Hr TRABAJADAS:");
        getContentPane().add(jtHRTRABAJADAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 130, 20));

        jHRTRABAJADAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHRTRABAJADASActionPerformed(evt);
            }
        });
        getContentPane().add(jHRTRABAJADAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 120, 30));

        jtPAGOHORA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtPAGOHORA.setForeground(new java.awt.Color(230, 227, 213));
        jtPAGOHORA.setText("PAGO/HORA:");
        getContentPane().add(jtPAGOHORA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 110, 20));

        jPAGOHORA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPAGOHORAActionPerformed(evt);
            }
        });
        getContentPane().add(jPAGOHORA, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 120, 30));

        jtRECIBO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtRECIBO.setForeground(new java.awt.Color(230, 227, 213));
        jtRECIBO.setText("RECIBO:");
        getContentPane().add(jtRECIBO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 90, 20));

        jRECIBO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRECIBOActionPerformed(evt);
            }
        });
        getContentPane().add(jRECIBO, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 120, 30));

        jComboEstudios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Universitario", "Bachiller", "Grado superior", "ESO" }));
        jComboEstudios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboEstudiosActionPerformed(evt);
            }
        });
        getContentPane().add(jComboEstudios, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 120, 30));

        btn_limpiar.setBackground(new java.awt.Color(228, 224, 210));
        btn_limpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(31, 40, 55));
        btn_limpiar.setText("LIMPIAR");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 90, -1));

        btn_volvermenu.setBackground(new java.awt.Color(228, 224, 210));
        btn_volvermenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_volvermenu.setForeground(new java.awt.Color(31, 40, 55));
        btn_volvermenu.setText("VOLVER MENÚ");
        btn_volvermenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volvermenuActionPerformed(evt);
            }
        });
        getContentPane().add(btn_volvermenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, 150, -1));

        fondo_empleado_recibo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imagen_fondo_empleadorecibo.jpg"))); // NOI18N
        getContentPane().add(fondo_empleado_recibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 967, 634));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_procesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_procesarActionPerformed
        // TODO add your handling code here:
        try{
        Empleado_Recibo emp_rec= new Empleado_Recibo();
        emp_rec.setNombre(jNombre.getText());
        emp_rec.setApellido(jApellidos.getText());
        emp_rec.setDni(jDNI.getText());
        emp_rec.setDireccion(jDireccion.getText());
        emp_rec.setEdad(Integer.parseInt(jEdad.getText()));
        emp_rec.setFormacionAcademica(jComboEstudios.getSelectedItem().toString());
        emp_rec.setAñosExperiencia(Integer.parseInt(jExperiencia.getText()));
        emp_rec.setHoras_trabajadas(Integer.parseInt(jHRTRABAJADAS.getText()));
        emp_rec.setPagoPorHora(Integer.parseInt(jPAGOHORA.getText()));
        emp_rec.setRecibo(jRECIBO.getText());
        textarea_emp_rec.setText(emp_rec.imprimirReciboPago());
        }
        catch(Exception e){
            textarea_emp_rec.setText("Se ha producido un error");
        }
    }//GEN-LAST:event_btn_procesarActionPerformed

    private void jApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jApellidosActionPerformed

    private void jDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDNIActionPerformed

    private void jNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNombreActionPerformed

    private void jDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDireccionActionPerformed

    private void jEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEdadActionPerformed

    private void jExperienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExperienciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jExperienciaActionPerformed

    private void jHRTRABAJADASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHRTRABAJADASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jHRTRABAJADASActionPerformed

    private void jPAGOHORAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPAGOHORAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPAGOHORAActionPerformed

    private void jRECIBOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRECIBOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRECIBOActionPerformed

    private void jComboEstudiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboEstudiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboEstudiosActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // TODO add your handling code here:
        /*jNombre.setText("");
        jApellidos.setText("");
        jDNI.setText("");
        jDireccion.setText("");
        jEdad.setText("");
        jComboEstudios.setSelectedIndex(0);
        jExperiencia.setText("");
        jHRTRABAJADAS.setText("");
        jPAGOHORA.setText("");
        jRECIBO.setText("");
        textarea_emp_rec.setText("");*/
        
        this.setVisible(false);
        pantalla_empleado_recibo ei = new pantalla_empleado_recibo();
        ei.setVisible(true);
        
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_volvermenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volvermenuActionPerformed
        // TODO add your handling code here:
        JFrame pantalla_inicio = new pantalla_inicio();
        pantalla_inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_volvermenuActionPerformed

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
            java.util.logging.Logger.getLogger(pantalla_empleado_recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantalla_empleado_recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantalla_empleado_recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantalla_empleado_recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantalla_empleado_recibo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_procesar;
    private javax.swing.JButton btn_volvermenu;
    private javax.swing.JLabel fondo_empleado_recibo;
    private javax.swing.JTextField jApellidos;
    private javax.swing.JComboBox<String> jComboEstudios;
    private javax.swing.JTextField jDNI;
    private javax.swing.JTextField jDireccion;
    private javax.swing.JTextField jEdad;
    private javax.swing.JTextField jExperiencia;
    private javax.swing.JTextField jHRTRABAJADAS;
    private javax.swing.JTextField jNombre;
    private javax.swing.JTextField jPAGOHORA;
    private javax.swing.JTextField jRECIBO;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jtApellidos;
    private javax.swing.JLabel jtDNI;
    private javax.swing.JLabel jtDireccion;
    private javax.swing.JLabel jtEdad;
    private javax.swing.JLabel jtEstudios;
    private javax.swing.JLabel jtExperiencia;
    private javax.swing.JLabel jtHRTRABAJADAS;
    private javax.swing.JLabel jtNombre;
    private javax.swing.JLabel jtPAGOHORA;
    private javax.swing.JLabel jtRECIBO;
    private javax.swing.JTextArea textarea_emp_rec;
    private javax.swing.JLabel titulo_empleado_recibo;
    // End of variables declaration//GEN-END:variables
}
