/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.*;

/**
 *
 * @author usuario
 */
public class Controladorpracticante {
     
    private String Nombre,apellido,direccion;
    private int edad,telefono,cedula;

    public Controladorpracticante() {
    }

    public Controladorpracticante(String Nombre, String apellido, String direccion, int edad, int telefono, int cedula) {
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
        this.telefono = telefono;
        this.cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

   
    @Override
    public String toString() {
        return "Controladorpracticante{" +
                "Nombre='" + Nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", direccion='" + direccion + '\'' +
                ", edad=" + edad +
                ", telefono=" + telefono +
                '}';
    }
}
