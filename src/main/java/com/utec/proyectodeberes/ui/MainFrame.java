package com.utec.proyectodeberes.ui;

import com.utec.proyectodeberes.classes.Persona;
import com.utec.proyectodeberes.classes.Vehiculo;
import com.utec.proyectodeberes.exceptions.CampoVacioException;
import java.awt.Component;
import java.util.LinkedList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class MainFrame extends javax.swing.JFrame {

    private static DefaultTableModel defaultTableModel;
    private static LinkedList<Persona> personas = new LinkedList<Persona>();
    private static LinkedList<Vehiculo> vehiculos = new LinkedList<Vehiculo>();

    public MainFrame() {
        initComponents();

        setTitle("Inicio - Fannog");
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public static void setPersonas(Persona persona) {
        personas.add(persona);
    }

    public static LinkedList<Persona> getPersonas() {
        return personas;
    }

    public static void setVehiculos(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public static LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public static void agregarFilaTabla(Object[] data, JTable tabla) {
        defaultTableModel = (DefaultTableModel) tabla.getModel();

        defaultTableModel.addRow(data);
    }

    public static void limpiarCampos(JPanel panel) {
        Component[] todosLosComponentes = panel.getComponents();

        for (Component componenteActual : todosLosComponentes) {
            if (componenteActual instanceof JTextField jTextField) {
                jTextField.setText("");
            }
        }
    }

    public static String validarCampoVacio(String valorDelCampo) throws CampoVacioException {
        if (valorDelCampo.trim().isEmpty()) {
            throw new CampoVacioException();
        }

        return valorDelCampo;
    }

    private void filtrarTabla(String input, JTable tabla) {
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(defaultTableModel);
        tabla.setRowSorter(trs);

        trs.setRowFilter(RowFilter.regexFilter("(?i)" + input));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        bg = new javax.swing.JPanel();
        tablaScrollPane = new javax.swing.JScrollPane();
        tablaPersonas = new javax.swing.JTable();
        inputFiltro = new javax.swing.JTextField();
        btnCrearPersona = new javax.swing.JLabel();
        bgImage = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVehiculos = new javax.swing.JTable();
        filtroVehiculos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaBarcos = new javax.swing.JTable();
        filtroBarcos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        filtroAviones = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaAviones = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(800, 657));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setOpaque(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaPersonas.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        tablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "DptoResidencia", "CantHijos", "Fecha Nacimiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Byte.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaPersonas.setRowHeight(25);
        tablaPersonas.setRowSelectionAllowed(false);
        tablaPersonas.getTableHeader().setReorderingAllowed(false);
        tablaScrollPane.setViewportView(tablaPersonas);

        bg.add(tablaScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 580, 210));

        inputFiltro.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        inputFiltro.setBorder(null);
        inputFiltro.setOpaque(true);
        inputFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputFiltroKeyReleased(evt);
            }
        });
        bg.add(inputFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 530, 20));

        btnCrearPersona.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearPersonaMouseClicked(evt);
            }
        });
        bg.add(btnCrearPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 580, 40));

        bgImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\marco\\Downloads\\MainFrameBG.png")); // NOI18N
        bgImage.setToolTipText("");
        bg.add(bgImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Personas", bg);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Color", "ID dueño"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaVehiculos);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 580, 200));

        filtroVehiculos.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        filtroVehiculos.setBorder(null);
        filtroVehiculos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtroVehiculosKeyReleased(evt);
            }
        });
        jPanel2.add(filtroVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 530, -1));

        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 580, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\marco\\Downloads\\MainFrameBG (2).png")); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, -1));

        jTabbedPane2.addTab("Todos", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaBarcos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Color", "Eslora", "Manga", "ID dueño"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaBarcos);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 580, 200));

        filtroBarcos.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        filtroBarcos.setBorder(null);
        filtroBarcos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtroBarcosKeyReleased(evt);
            }
        });
        jPanel3.add(filtroBarcos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 530, -1));

        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 580, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\marco\\Downloads\\MainFrameBG (4).png")); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane2.addTab("Barcos", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        filtroAviones.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        filtroAviones.setBorder(null);
        filtroAviones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroAvionesActionPerformed(evt);
            }
        });
        filtroAviones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtroAvionesKeyReleased(evt);
            }
        });
        jPanel4.add(filtroAviones, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 530, -1));

        tablaAviones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Color", "Longitud", "Cant. Pasajeros", "ID dueño"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaAviones);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 580, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\marco\\Downloads\\MainFrameBG (5).png")); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane2.addTab("Aviones", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane1.addTab("Vehiculos", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputFiltroKeyReleased
        String filtro = inputFiltro.getText().trim().toLowerCase();

        filtrarTabla(filtro, tablaPersonas);
    }//GEN-LAST:event_inputFiltroKeyReleased

    private void btnCrearPersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearPersonaMouseClicked
        FormularioCrearPersona formCrearPersona = new FormularioCrearPersona(this, false);
    }//GEN-LAST:event_btnCrearPersonaMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        FormularioCrearVehiculo formCrearVehiculo = new FormularioCrearVehiculo(this, false, "Vehiculo");
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        FormularioCrearVehiculo formCrearVehiculo = new FormularioCrearVehiculo(this, false, "Barco");
    }//GEN-LAST:event_jLabel5MouseClicked

    private void filtroVehiculosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroVehiculosKeyReleased
        String filtro = filtroVehiculos.getText().trim().toLowerCase();

        filtrarTabla(filtro, tablaVehiculos);
    }//GEN-LAST:event_filtroVehiculosKeyReleased

    private void filtroBarcosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroBarcosKeyReleased
        String filtro = filtroBarcos.getText().trim().toLowerCase();

        filtrarTabla(filtro, tablaBarcos);
    }//GEN-LAST:event_filtroBarcosKeyReleased

    private void filtroAvionesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroAvionesKeyReleased
        String filtro = filtroAviones.getText().trim().toLowerCase();

        filtrarTabla(filtro, tablaAviones);
    }//GEN-LAST:event_filtroAvionesKeyReleased

    private void filtroAvionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroAvionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filtroAvionesActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bgImage;
    private javax.swing.JLabel btnCrearPersona;
    private javax.swing.JTextField filtroAviones;
    private javax.swing.JTextField filtroBarcos;
    private javax.swing.JTextField filtroVehiculos;
    private javax.swing.JTextField inputFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    public static javax.swing.JTable tablaAviones;
    public static javax.swing.JTable tablaBarcos;
    public static javax.swing.JTable tablaPersonas;
    private javax.swing.JScrollPane tablaScrollPane;
    public static javax.swing.JTable tablaVehiculos;
    // End of variables declaration//GEN-END:variables
}
