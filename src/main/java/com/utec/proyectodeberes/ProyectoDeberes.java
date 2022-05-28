package com.utec.proyectodeberes;

import com.formdev.flatlaf.FlatLightLaf;
import com.utec.proyectodeberes.classes.Avion;
import com.utec.proyectodeberes.classes.Barco;
import com.utec.proyectodeberes.classes.Persona;
import com.utec.proyectodeberes.classes.Vehiculo;
import com.utec.proyectodeberes.ui.MainFrame;
import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import javax.swing.UIManager;

public class ProyectoDeberes {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());

            MainFrame mainframe = new MainFrame();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.err.println("Failed to initialize LaF");
        }

        Persona persona1 = new Persona("Marcos", "Cianzio", "Soriano", (byte) 0, LocalDate.of(2003, Month.FEBRUARY, 9));
        Persona persona2 = new Persona("Lionel", "Messi", "Colonia", (byte) 3, LocalDate.of(1990, Month.AUGUST, 20));
        Persona persona3 = new Persona("Jorge", "Suarez", "Montevideo", (byte) 1, LocalDate.of(1960, Month.JANUARY, 10));

        Vehiculo vehiculo1 = new Vehiculo("Ferrari", "Rojo", persona1);

        Barco barco1 = new Barco(53.0, 20.2, "Yate", "Verde", persona1);
        persona1.setVehiculos(barco1);

        Avion avion1 = new Avion(1200.3, 110, "Boeing 747", "Blanco", persona2);
        persona2.setVehiculos(avion1);

        LinkedList<Vehiculo> listaVehiculos = new LinkedList<Vehiculo>();

        listaVehiculos.add(vehiculo1);
        listaVehiculos.add(barco1);
        listaVehiculos.add(avion1);

        for (Vehiculo v : listaVehiculos) {
            System.out.println(v.toString());
        }

        System.out.println("-- Orden inverso");

        for (int i = listaVehiculos.size(); i > 0; i--) {
            Vehiculo v = listaVehiculos.get(i - 1);
            System.out.println(v.toString());
        }

        MainFrame.setPersonas(persona1);
        MainFrame.setPersonas(persona2);
        MainFrame.setPersonas(persona3);

        vehiculo1.setDueño(persona1);
        persona1.setVehiculos(vehiculo1);
        MainFrame.setVehiculos(vehiculo1);

        MainFrame.setVehiculos(barco1);
        MainFrame.setVehiculos(avion1);
    }
}
