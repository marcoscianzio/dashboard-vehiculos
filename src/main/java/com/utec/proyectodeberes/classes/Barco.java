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

}
