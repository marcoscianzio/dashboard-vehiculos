package com.utec.proyectodeberes.ui;

import com.utec.proyectodeberes.classes.Persona;
import com.utec.proyectodeberes.exceptions.CampoVacioException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

public class FormularioCrearPersona extends javax.swing.JDialog {

    public FormularioCrearPersona(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        setTitle("Crear persona - Fannog");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    private void crearPersona(Persona persona) {
        MainFrame.agregarFilaTabla(new Object[]{persona.getIdPersona(), persona.getNombre(), persona.getApellido(), persona.getDptoResidencia(), persona.getCantHijos(), persona.getFechaNacimiento()}, MainFrame.tablaPersonas);

        MainFrame.setPersonas(persona);
    }

    private LocalDate parseStringInputALocalDate(String input) {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern("dd/MM/yyyy").toFormatter();
        LocalDate formattedDate = LocalDate.parse(input, formatter);

        return formattedDate;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        btnCrearPersona = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        inputApellido = new javax.swing.JTextField();
        inputCantHijos = new javax.swing.JTextField();
        comboDptoResidencia = new javax.swing.JComboBox<>();
        inputFecNacimiento = new javax.swing.JFormattedTextField();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrearPersona.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearPersonaMouseClicked(evt);
            }
        });
        mainPanel.add(btnCrearPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 380, 40));

        inputNombre.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        inputNombre.setBorder(null);
        mainPanel.add(inputNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 150, 20));

        inputApellido.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        inputApellido.setBorder(null);
        mainPanel.add(inputApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 160, 20));

        inputCantHijos.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        inputCantHijos.setBorder(null);
        mainPanel.add(inputCantHijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 160, 20));

        comboDptoResidencia.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        comboDptoResidencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Montevideo", "Artigas", "Canelones", "Cerro Largo", "Colonia", "Durazno", "Flores", "Florida", "Lavalleja", "Maldonado", "Paysandú", "Rivera", "Rocha", "Río Negro", "Salto", "San José", "Soriano", "Tacuarembó", "Treinta y Tres" }));
        comboDptoResidencia.setBorder(null);
        mainPanel.add(comboDptoResidencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 292, 360, 20));

        inputFecNacimiento.setBorder(null);
        inputFecNacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        inputFecNacimiento.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        inputFecNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFecNacimientoActionPerformed(evt);
            }
        });
        mainPanel.add(inputFecNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 150, 20));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FormularioCrearPersonaBG.png"))); // NOI18N
        mainPanel.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputFecNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFecNacimientoActionPerformed
    }//GEN-LAST:event_inputFecNacimientoActionPerformed

    private void btnCrearPersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearPersonaMouseClicked
        try {
            String nombre = MainFrame.validarCampoVacio(inputNombre.getText().trim());
            String apellido = MainFrame.validarCampoVacio(inputApellido.getText().trim());
            String dptoResidencia = comboDptoResidencia.getSelectedItem().toString();

            byte cantHijos = Byte.parseByte(MainFrame.validarCampoVacio(inputCantHijos.getText().trim()));

            LocalDate fechaNacimiento = parseStringInputALocalDate(inputFecNacimiento.getText());

            Persona persona = new Persona(nombre, apellido, dptoResidencia, cantHijos, fechaNacimiento, null);

            crearPersona(persona);

            MainFrame.limpiarCampos(mainPanel);

            JOptionPane.showMessageDialog(null, "Persona creada con éxito", "Éxito", JOptionPane.NO_OPTION);
        } catch (CampoVacioException e) {
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "Por favor, utiliza el formato dd/MM/yyyy. Por ejemplo, 03/03/2003", "Fecha de Nacimiento invalida", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "En la cantidad de hijos, por favor ingresa un número.", "Cantidad de hijos invalida", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCrearPersonaMouseClicked

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
            java.util.logging.Logger.getLogger(FormularioCrearPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioCrearPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioCrearPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioCrearPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormularioCrearPersona dialog = new FormularioCrearPersona(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btnCrearPersona;
    private javax.swing.JComboBox<String> comboDptoResidencia;
    private javax.swing.JTextField inputApellido;
    private javax.swing.JTextField inputCantHijos;
    private javax.swing.JFormattedTextField inputFecNacimiento;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
