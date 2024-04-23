/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package es.medac.Interfaces;

import es.medac.ProyectoInterfaces.InformeEmpleado;
import javax.swing.JFrame;

/**
 *
 * @author carlo
 */
public class pantalla_informe_empleado extends javax.swing.JFrame {

    /**
     * Creates new form pantalla_informe_empleado
     */
    public pantalla_informe_empleado() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jNombre = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jApellidos = new javax.swing.JLabel();
        jtApellidos = new javax.swing.JTextField();
        jDNI = new javax.swing.JLabel();
        jtDNI = new javax.swing.JTextField();
        jDireccion = new javax.swing.JLabel();
        jtDireccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jEdad = new javax.swing.JLabel();
        jtEdad = new javax.swing.JTextField();
        jEstudios = new javax.swing.JLabel();
        jExperiencia = new javax.swing.JLabel();
        jtExperiencia = new javax.swing.JTextField();
        jtHRtrabajadas = new javax.swing.JTextField();
        jHRtrabajadas = new javax.swing.JLabel();
        jtPAGOHORA = new javax.swing.JTextField();
        jPAGOHORA = new javax.swing.JLabel();
        jNHijos = new javax.swing.JLabel();
        jtNHijos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButtonHacienda = new javax.swing.JRadioButton();
        jRadioButtonRetencion = new javax.swing.JRadioButton();
        btn_procesar = new javax.swing.JButton();
        jComboEstudios = new javax.swing.JComboBox<>();
        btn_limpiar = new javax.swing.JButton();
        btn_volvermenu = new javax.swing.JButton();
        fondo_informe_empleado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jNombre.setBackground(new java.awt.Color(230, 227, 213));
        jNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jNombre.setForeground(new java.awt.Color(230, 227, 213));
        jNombre.setText("NOMBRE:");
        getContentPane().add(jNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, 30));

        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 140, 40));

        jApellidos.setBackground(new java.awt.Color(230, 227, 213));
        jApellidos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jApellidos.setForeground(new java.awt.Color(230, 227, 213));
        jApellidos.setText("APELLIDOS:");
        getContentPane().add(jApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, 30));

        jtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtApellidosActionPerformed(evt);
            }
        });
        getContentPane().add(jtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 140, 40));

        jDNI.setBackground(new java.awt.Color(230, 227, 213));
        jDNI.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jDNI.setForeground(new java.awt.Color(230, 227, 213));
        jDNI.setText("DNI:");
        getContentPane().add(jDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, 30));

        jtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDNIActionPerformed(evt);
            }
        });
        getContentPane().add(jtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 140, 40));

        jDireccion.setBackground(new java.awt.Color(230, 227, 213));
        jDireccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jDireccion.setForeground(new java.awt.Color(230, 227, 213));
        jDireccion.setText("DIRECCION:");
        getContentPane().add(jDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 100, 30));

        jtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDireccionActionPerformed(evt);
            }
        });
        getContentPane().add(jtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 140, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(228, 224, 210));
        jLabel1.setText("INFORME EMPLEADO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jEdad.setBackground(new java.awt.Color(230, 227, 213));
        jEdad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jEdad.setForeground(new java.awt.Color(230, 227, 213));
        jEdad.setText("EDAD:");
        getContentPane().add(jEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 100, 30));

        jtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEdadActionPerformed(evt);
            }
        });
        getContentPane().add(jtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 140, 40));

        jEstudios.setBackground(new java.awt.Color(230, 227, 213));
        jEstudios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jEstudios.setForeground(new java.awt.Color(230, 227, 213));
        jEstudios.setText("ESTUDIOS:");
        getContentPane().add(jEstudios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 100, 30));

        jExperiencia.setBackground(new java.awt.Color(230, 227, 213));
        jExperiencia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jExperiencia.setForeground(new java.awt.Color(230, 227, 213));
        jExperiencia.setText("EXPERIENCIA:");
        getContentPane().add(jExperiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 100, 30));

        jtExperiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtExperienciaActionPerformed(evt);
            }
        });
        getContentPane().add(jtExperiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 140, 40));

        jtHRtrabajadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtHRtrabajadasActionPerformed(evt);
            }
        });
        getContentPane().add(jtHRtrabajadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 140, 40));

        jHRtrabajadas.setBackground(new java.awt.Color(230, 227, 213));
        jHRtrabajadas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jHRtrabajadas.setForeground(new java.awt.Color(230, 227, 213));
        jHRtrabajadas.setText("Hr TRABAJADAS:");
        getContentPane().add(jHRtrabajadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 130, 30));

        jtPAGOHORA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPAGOHORAActionPerformed(evt);
            }
        });
        getContentPane().add(jtPAGOHORA, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 140, 40));

        jPAGOHORA.setBackground(new java.awt.Color(230, 227, 213));
        jPAGOHORA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPAGOHORA.setForeground(new java.awt.Color(230, 227, 213));
        jPAGOHORA.setText("PAGO/HORA:");
        getContentPane().add(jPAGOHORA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 100, 30));

        jNHijos.setBackground(new java.awt.Color(230, 227, 213));
        jNHijos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jNHijos.setForeground(new java.awt.Color(230, 227, 213));
        jNHijos.setText("Nº HIJOS:");
        getContentPane().add(jNHijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 100, 30));

        jtNHijos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNHijosActionPerformed(evt);
            }
        });
        getContentPane().add(jtNHijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, 140, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 390, 510));

        buttonGroup1.add(jRadioButtonHacienda);
        jRadioButtonHacienda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButtonHacienda.setForeground(new java.awt.Color(230, 227, 213));
        jRadioButtonHacienda.setText("HACIENDA 1,5%");
        jRadioButtonHacienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHaciendaActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHacienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 140, 30));

        buttonGroup1.add(jRadioButtonRetencion);
        jRadioButtonRetencion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButtonRetencion.setForeground(new java.awt.Color(230, 227, 213));
        jRadioButtonRetencion.setText("RETENCION 2,5%");
        getContentPane().add(jRadioButtonRetencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        btn_procesar.setBackground(new java.awt.Color(228, 224, 210));
        btn_procesar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_procesar.setForeground(new java.awt.Color(31, 40, 55));
        btn_procesar.setText("PROCESAR");
        btn_procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_procesarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_procesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        jComboEstudios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Universitario", "Bachiller", "Grado superior", "ESO" }));
        getContentPane().add(jComboEstudios, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 140, 40));

        btn_limpiar.setBackground(new java.awt.Color(228, 224, 210));
        btn_limpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(31, 40, 55));
        btn_limpiar.setText("LIMPIAR");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 90, -1));

        btn_volvermenu.setBackground(new java.awt.Color(228, 224, 210));
        btn_volvermenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_volvermenu.setForeground(new java.awt.Color(31, 40, 55));
        btn_volvermenu.setText("VOLVER MENÚ");
        btn_volvermenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volvermenuActionPerformed(evt);
            }
        });
        getContentPane().add(btn_volvermenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 150, -1));

        fondo_informe_empleado.setBackground(new java.awt.Color(230, 227, 213));
        fondo_informe_empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imagen_fondo_empleadorecibo.jpg"))); // NOI18N
        getContentPane().add(fondo_informe_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 941, 612));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtApellidosActionPerformed

    private void jtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDNIActionPerformed

    private void jtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDireccionActionPerformed

    private void jtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEdadActionPerformed

    private void jtExperienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtExperienciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtExperienciaActionPerformed

    private void jtHRtrabajadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtHRtrabajadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtHRtrabajadasActionPerformed

    private void jtPAGOHORAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPAGOHORAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPAGOHORAActionPerformed

    private void jtNHijosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNHijosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNHijosActionPerformed

    private void jRadioButtonHaciendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHaciendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonHaciendaActionPerformed

    private void btn_procesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_procesarActionPerformed
        // TODO add your handling code here:
        try{
        InformeEmpleado emp_rec = new InformeEmpleado();
        emp_rec.setNombre(jtNombre.getText());
        emp_rec.setApellido(jtApellidos.getText());
        emp_rec.setDni(jtDNI.getText());
        emp_rec.setDireccion(jtDireccion.getText());
        emp_rec.setEdad(Integer.parseInt(jtEdad.getText()));
        emp_rec.setFormacionAcademica(jComboEstudios.getSelectedItem().toString());
        emp_rec.setAñosExperiencia(Integer.parseInt(jtExperiencia.getText()));
        emp_rec.setHoras_trabajadas(Integer.parseInt(jtHRtrabajadas.getText()));
        emp_rec.setPagoPorHora(Integer.parseInt(jtPAGOHORA.getText()));
        emp_rec.setCant_hijos(Integer.parseInt(jtNHijos.getText()));
        
        if(jRadioButtonRetencion.isSelected()){
            emp_rec.setRetencion("retencion 2,5%");
        }else{
            emp_rec.setRetencion("");
        }
        if(jRadioButtonHacienda.isSelected()){
            emp_rec.setHacienda("hacienda 1,5%");
        }else{
            emp_rec.setHacienda("");
        }
        
        jTextArea1.setText(emp_rec.imprimirReciboPago());
        
        }
        catch(Exception e){
            jTextArea1.setText("Se ha producido un error");
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btn_procesarActionPerformed

    private void btn_volvermenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volvermenuActionPerformed
        // TODO add your handling code here:
        JFrame pantalla_inicio = new pantalla_inicio();
        pantalla_inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_volvermenuActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // TODO add your handling code here:
        /*jtNombre.setText("");
        jtApellidos.setText("");
        jtDNI.setText("");
        jtDireccion.setText("");
        jtEdad.setText("");
        jComboEstudios.setSelectedIndex(0);
        jtExperiencia.setText("");
        jtHRtrabajadas.setText("");
        jtPAGOHORA.setText("");
        jtNHijos.setText("");
        jTextArea1.setText("");*/
        
        this.setVisible(false);
        pantalla_informe_empleado ie = new pantalla_informe_empleado();
        ie.setVisible(true);
    }//GEN-LAST:event_btn_limpiarActionPerformed

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
            java.util.logging.Logger.getLogger(pantalla_informe_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantalla_informe_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantalla_informe_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantalla_informe_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantalla_informe_empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_procesar;
    private javax.swing.JButton btn_volvermenu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel fondo_informe_empleado;
    private javax.swing.JLabel jApellidos;
    private javax.swing.JComboBox<String> jComboEstudios;
    private javax.swing.JLabel jDNI;
    private javax.swing.JLabel jDireccion;
    private javax.swing.JLabel jEdad;
    private javax.swing.JLabel jEstudios;
    private javax.swing.JLabel jExperiencia;
    private javax.swing.JLabel jHRtrabajadas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jNHijos;
    private javax.swing.JLabel jNombre;
    private javax.swing.JLabel jPAGOHORA;
    private javax.swing.JRadioButton jRadioButtonHacienda;
    private javax.swing.JRadioButton jRadioButtonRetencion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jtApellidos;
    private javax.swing.JTextField jtDNI;
    private javax.swing.JTextField jtDireccion;
    private javax.swing.JTextField jtEdad;
    private javax.swing.JTextField jtExperiencia;
    private javax.swing.JTextField jtHRtrabajadas;
    private javax.swing.JTextField jtNHijos;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPAGOHORA;
    // End of variables declaration//GEN-END:variables
}
