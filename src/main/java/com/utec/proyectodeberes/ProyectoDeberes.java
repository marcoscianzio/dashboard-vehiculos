package com.utec.proyectodeberes;

import com.formdev.flatlaf.FlatLightLaf;
import com.utec.proyectodeberes.ui.MainFrame;
import javax.swing.UIManager;

public class ProyectoDeberes {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            
            MainFrame mainframe = new MainFrame();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

    }
}
