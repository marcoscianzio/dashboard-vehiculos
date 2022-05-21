package com.utec.proyectodeberes.ui;

import com.utec.proyectodeberes.classes.Avion;
import com.utec.proyectodeberes.classes.Barco;
import com.utec.proyectodeberes.classes.Persona;
import com.utec.proyectodeberes.classes.Vehiculo;
import com.utec.proyectodeberes.exceptions.CampoVacioException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class FormularioCrearVehiculo extends javax.swing.JDialog {

    private static LinkedList<Persona> personas = MainFrame.getPersonas();

    public FormularioCrearVehiculo(java.awt.Frame parent, boolean modal, String tipo) {
        super(parent, modal);
        initComponents();

        llenarCombobox();

        comboTipo.setSelectedItem(tipo);

        if (!"Vehiculo".equals(tipo)) {
            comboTipo.setEnabled(false);
        }

        setTitle("Crear vehiculo - Fannog");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public void crearVehiculo(Vehiculo vehiculo, int idDueño) {
        MainFrame.agregarFilaTabla(new Object[]{vehiculo.getIdVehiculo(), vehiculo.getNombre(), vehiculo.getColor(), idDueño}, MainFrame.tablaVehiculos);
    }

    public void crearBarco(Barco barco, int idDueño) {
        MainFrame.agregarFilaTabla(new Object[]{
            barco.getIdVehiculo(), barco.getNombre(), barco.getColor(), barco.getEslora(), barco.getManga(), idDueño
        },
                MainFrame.tablaBarcos
        );

        MainFrame.setVehiculos(barco);
    }

    public void crearAvion(Avion avion, int idDueño) {
        MainFrame.agregarFilaTabla(new Object[]{
            avion.getIdVehiculo(), avion.getNombre(), avion.getColor(), avion.getLongitud(), avion.getCantPasajeros(), idDueño
        },
                MainFrame.tablaAviones
        );

        MainFrame.setVehiculos(avion);
    }

    public static void llenarCombobox() {
        for (Persona p : personas) {
            int id = p.getIdPersona();
            String nombre = p.getNombre();
            String apellido = p.getApellido();

            FormularioCrearVehiculo.comboDueño.addItem("Persona #" + id + " - " + nombre + " " + apellido);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inputColor = new javax.swing.JTextField();
        inputNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboDueño = new javax.swing.JComboBox<>();
        comboTipo = new javax.swing.JComboBox<>();
        formularioCrearBarco2 = new com.utec.proyectodeberes.ui.FormularioCrearBarco();
        formularioCrearAvion1 = new com.utec.proyectodeberes.ui.FormularioCrearAvion();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputColor.setBorder(null);
        jPanel1.add(inputColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 150, 20));

        inputNombre.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        inputNombre.setBorder(null);
        jPanel1.add(inputNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 150, 20));

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 380, 40));

        comboDueño.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        comboDueño.setBorder(null);
        comboDueño.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboDueño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboDueñoMouseClicked(evt);
            }
        });
        comboDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDueñoActionPerformed(evt);
            }
        });
        jPanel1.add(comboDueño, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 360, 20));

        comboTipo.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vehiculo", "Barco", "Avion" }));
        comboTipo.setBorder(null);
        comboTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboTipoMouseClicked(evt);
            }
        });
        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });
        jPanel1.add(comboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 360, 20));
        jPanel1.add(formularioCrearBarco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));
        jPanel1.add(formularioCrearAvion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FormularioCrearVehiculo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 647));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboTipoMouseClicked

    }//GEN-LAST:event_comboTipoMouseClicked

    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
        String tipo = comboTipo.getSelectedItem().toString();

        if (tipo.equals("Barco")) {
            formularioCrearBarco2.setVisible(true);
        } else {
            formularioCrearBarco2.setVisible(false);
        }

        if (tipo.equals("Avion")) {
            formularioCrearAvion1.setVisible(true);
        } else {
            formularioCrearAvion1.setVisible(false);
        }
    }//GEN-LAST:event_comboTipoActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        try {
            String nombre = MainFrame.validarCampoVacio(inputNombre.getText().trim());
            String color = MainFrame.validarCampoVacio(inputColor.getText().trim());

            String tipo = comboTipo.getSelectedItem().toString();

            Persona dueño = personas.get(comboDueño.getSelectedIndex());

            Vehiculo vehiculo = new Vehiculo(nombre, color, dueño);

            crearVehiculo(vehiculo, dueño.getIdPersona());

            if (tipo.equals("Barco")) {
                double eslora = Double.parseDouble(MainFrame.validarCampoVacio(formularioCrearBarco2.getEslora()));

                double manga = Double.parseDouble(MainFrame.validarCampoVacio(formularioCrearBarco2.getManga()));

                Barco barco = new Barco(eslora, manga, nombre, color, null);

                dueño.setVehiculos(barco);

                crearBarco(barco, dueño.getIdPersona());

                MainFrame.limpiarCampos(formularioCrearBarco2);
            }

            if (tipo.equals("Avion")) {
                double longitud = Double.parseDouble(MainFrame.validarCampoVacio(formularioCrearAvion1.getLongitud()));

                int cantPasajeros = Integer.parseInt(MainFrame.validarCampoVacio(formularioCrearAvion1.getCantPasajeros()));

                Avion avion = new Avion(longitud, cantPasajeros, nombre, color, null);

                dueño.setVehiculos(avion);

                crearAvion(avion, dueño.getIdPersona());

                MainFrame.limpiarCampos(formularioCrearAvion1);
            } else {
                MainFrame.setVehiculos(vehiculo);
                dueño.setVehiculos(vehiculo);
            }

            MainFrame.limpiarCampos(jPanel1);

            JOptionPane.showMessageDialog(null, tipo + " creado con éxito", "Éxito", JOptionPane.NO_OPTION);
        } catch (CampoVacioException e) {

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Revisa los datos ingresados. Solo puedes ingresar numeros en algunos campos.", "Campos numericos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void comboDueñoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboDueñoMouseClicked
    }//GEN-LAST:event_comboDueñoMouseClicked

    private void comboDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDueñoActionPerformed
    }//GEN-LAST:event_comboDueñoActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioCrearVehiculo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioCrearVehiculo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioCrearVehiculo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioCrearVehiculo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormularioCrearVehiculo dialog = new FormularioCrearVehiculo(new javax.swing.JFrame(), true, "Vehiculo");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> comboDueño;
    private javax.swing.JComboBox<String> comboTipo;
    private com.utec.proyectodeberes.ui.FormularioCrearAvion formularioCrearAvion1;
    private com.utec.proyectodeberes.ui.FormularioCrearBarco formularioCrearBarco2;
    private javax.swing.JTextField inputColor;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
