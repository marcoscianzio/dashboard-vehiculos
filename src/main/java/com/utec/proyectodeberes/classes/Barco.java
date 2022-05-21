package com.utec.proyectodeberes.classes;

public class Barco extends Vehiculo {

    public double eslora;
    public double manga;

    public Barco(double eslora, double manga, String nombre, String color, Persona dueño) {
        super(nombre, color, dueño);
        this.eslora = eslora;
        this.manga = manga;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public double getManga() {
        return manga;
    }

    public void setManga(double manga) {
        this.manga = manga;
    }

    @Override
    public String toString() {
        String mensaje = "classes.Barco [idVehiculo=" + idVehiculo + ", nombre=" + nombre + ", color=" + color + ", eslora=" + eslora + ", manga=" + manga + ", dueño= Persona [idPersona=" + dueño.getIdPersona() + ", nombre=" + dueño.getNombre() + ", apellido=" + dueño.getApellido() + "]";

        return mensaje;
    }

}
