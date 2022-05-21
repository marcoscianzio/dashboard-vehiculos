package com.utec.proyectodeberes.ui;

import java.awt.Dimension;

public class FormularioCrearAvion extends javax.swing.JPanel {

    public FormularioCrearAvion() {
        initComponents();

        getPreferredSize();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(382, 61);
    }

    public String getLongitud() {
        return inputLongitud.getText();
    }

    public String getCantPasajeros() {
        return inputCantPasajeros.getText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputLongitud = new javax.swing.JTextField();
        inputCantPasajeros = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputLongitud.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        inputLongitud.setBorder(null);
        add(inputLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, 20));

        inputCantPasajeros.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        inputCantPasajeros.setBorder(null);
        add(inputCantPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 150, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FormularioCrearAvion.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextField inputCantPasajeros;
    private static javax.swing.JTextField inputLongitud;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
