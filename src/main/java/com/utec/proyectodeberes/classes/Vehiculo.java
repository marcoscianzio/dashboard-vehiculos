package com.utec.proyectodeberes.classes;

import java.util.concurrent.atomic.AtomicInteger;

public class Vehiculo {

    public int idVehiculo;
    public String nombre;
    public String color;
    public Persona dueño;

    private static AtomicInteger idSecuencia = new AtomicInteger();

    public Vehiculo(String nombre, String color, Persona dueño) {
        this.idVehiculo = idSecuencia.incrementAndGet();
        this.nombre = nombre;
        this.color = color;
        this.dueño = dueño;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDueño(Persona dueño) {
        this.dueño = dueño;
    }

    public Persona getDueño() {
        return dueño;
    }

    @Override
    public String toString() {

        String mensaje = "classes.Vehiculo [idVehiculo=" + idVehiculo + ", nombre=" + nombre + ", color=" + color + ", dueño= Persona [idPersona=" + dueño.getIdPersona() + ", nombre=" + dueño.getNombre() + ", apellido=" + dueño.getApellido() + "]";

        return mensaje;
    }

}
