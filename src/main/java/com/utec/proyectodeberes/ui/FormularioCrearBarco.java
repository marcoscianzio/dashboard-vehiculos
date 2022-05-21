package com.utec.proyectodeberes.ui;

import java.awt.Dimension;

public class FormularioCrearBarco extends javax.swing.JPanel {

    public FormularioCrearBarco() {
        initComponents();

        getPreferredSize();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(382, 61);
    }
    
    public String getEslora() {
        return inputEslora.getText();
    }
    
    public String getManga() {
        return inputManga.getText();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputManga = new javax.swing.JTextField();
        inputEslora = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputManga.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        inputManga.setBorder(null);
        add(inputManga, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 150, 20));

        inputEslora.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        inputEslora.setBorder(null);
        add(inputEslora, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 30, 150, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FormularioCrearBarco.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField inputEslora;
    public static javax.swing.JTextField inputManga;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
