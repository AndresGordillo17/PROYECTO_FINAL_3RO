/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class Instructor {
     private String Nombre_ins,apellido_ins,direccion_ins,grado_ins;
    private int id_Instructor,cedula_ins,telefono_ins;

    public Instructor() {
    }

    public Instructor(String Nombre_ins, String apellido_ins, String direccion_ins, String grado_ins, int id_Instructor, int cedula_ins, int telefono_ins) {
        this.Nombre_ins = Nombre_ins;
        this.apellido_ins = apellido_ins;
        this.direccion_ins = direccion_ins;
        this.grado_ins = grado_ins;
        this.id_Instructor = id_Instructor;
        this.cedula_ins = cedula_ins;
        this.telefono_ins = telefono_ins;
    }

    public String getNombre_ins() {
        return Nombre_ins;
    }

    public void setNombre_ins(String Nombre_ins) {
        this.Nombre_ins = Nombre_ins;
    }

    public String getApellido_ins() {
        return apellido_ins;
    }

    public void setApellido_ins(String apellido_ins) {
        this.apellido_ins = apellido_ins;
    }

    public String getDireccion_ins() {
        return direccion_ins;
    }

    public void setDireccion_ins(String direccion_ins) {
        this.direccion_ins = direccion_ins;
    }

    public String getGrado_ins() {
        return grado_ins;
    }

    public void setGrado_ins(String grado_ins) {
        this.grado_ins = grado_ins;
    }

    public int getId_Instructor() {
        return id_Instructor;
    }

    public void setId_Instructor(int id_Instructor) {
        this.id_Instructor = id_Instructor;
    }

    public int getCedula_ins() {
        return cedula_ins;
    }

    public void setCedula_ins(int cedula_ins) {
        this.cedula_ins = cedula_ins;
    }

    public int getTelefono_ins() {
        return telefono_ins;
    }

    public void setTelefono_ins(int telefono_ins) {
        this.telefono_ins = telefono_ins;
    }
@Override
    public String toString() {
        return "DATOS DE PERSONA";}

    public boolean instructorRegistrado(String nombreInstructor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
