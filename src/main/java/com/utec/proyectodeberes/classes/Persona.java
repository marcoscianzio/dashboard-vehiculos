package com.utec.proyectodeberes.classes;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class Persona {

    public int idPersona;
    public String nombre;
    public String apellido;
    public String dptoResidencia;
    private byte cantHijos;
    private LocalDate fechaNacimiento;
    public LinkedList<Vehiculo> vehiculos = new LinkedList<>();

    private static AtomicInteger idSecuencia = new AtomicInteger();

    public Persona(String nombre, String apellido, String dptoResidencia, byte cantHijos,
            LocalDate fechaNacimiento) {
        this.idPersona = idSecuencia.incrementAndGet();
        this.nombre = nombre;
        this.apellido = apellido;
        this.dptoResidencia = dptoResidencia;
        this.cantHijos = cantHijos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona() {
        this.idPersona = 0;
        this.nombre = "";
        this.apellido = "";
        this.dptoResidencia = "";
        this.cantHijos = 0;
        this.fechaNacimiento = LocalDate.now();
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDptoResidencia() {
        return dptoResidencia;
    }

    public void setDptoResidencia(String dptoResidencia) {
        this.dptoResidencia = dptoResidencia;
    }

    public byte getCantHijos() {
        return cantHijos;
    }

    public void setCantHijos(byte cantHijos) {
        this.cantHijos = cantHijos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public LinkedList<Vehiculo> getVehiculos() {
        return this.vehiculos;
    }
    
    public void setVehiculos(Vehiculo vehiculos) {
        this.vehiculos.add(vehiculos);
    }

    @Override
    public String toString() {
        String mensaje = "classes.Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", dptoResidencia="
                + dptoResidencia + ", cantHijos=" + cantHijos + ", fechaNacimiento=" + fechaNacimiento + "]";

        System.out.println(mensaje);

        return mensaje;
    }
}
