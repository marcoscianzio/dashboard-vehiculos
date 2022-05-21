package com.utec.proyectodeberes.exceptions;

import javax.swing.JOptionPane;

public class CampoVacioException extends Exception {

    public CampoVacioException() {
        JOptionPane.showMessageDialog(null, "No pueden haber campos vacíos", "Campos vacíos", JOptionPane.ERROR_MESSAGE);
    }

}
