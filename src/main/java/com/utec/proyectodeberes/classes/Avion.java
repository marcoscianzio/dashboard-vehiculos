package com.utec.proyectodeberes.classes;

public class Avion extends Vehiculo {

    public double longitud;
    public int cantPasajeros;

    public Avion(double longitud, int cantPasajeros, String nombre, String color, Persona dueño) {
        super(nombre, color, dueño);
        this.longitud = longitud;
        this.cantPasajeros = cantPasajeros;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    @Override
    public String toString() {
        String mensaje = "classes.Avion [idVehiculo=" + idVehiculo + ", nombre=" + nombre + ", color=" + color + ", longitud=" + longitud + ", cantPasajeros=" + cantPasajeros + ", dueño= Persona [idPersona=" + dueño.getIdPersona() + ", nombre=" + dueño.getNombre() + ", apellido=" + dueño.getApellido() + "]";

        return mensaje;
    }

}
