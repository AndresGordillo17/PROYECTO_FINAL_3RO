/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class Practicante {
     private String NOMBRE,APELLIDO,DIRECCION;
    private int ID_PRACTICANTE,ID_INSTRUCTOR,EDAD,CEDULA,TELEFONO;

    public Practicante() {
    }

    public Practicante(String NOMBRE, String APELLIDO, String DIRECCION, int ID_PRACTICANTE, int ID_INSTRUCTOR, int EDAD, int CEDULA, int TELEFONO) {
        this.NOMBRE = NOMBRE;
        this.APELLIDO = APELLIDO;
        this.DIRECCION = DIRECCION;
        this.ID_PRACTICANTE = ID_PRACTICANTE;
        this.ID_INSTRUCTOR = ID_INSTRUCTOR;
        this.EDAD = EDAD;
        this.CEDULA = CEDULA;
        this.TELEFONO = TELEFONO;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDO() {
        return APELLIDO;
    }

    public void setAPELLIDO(String APELLIDO) {
        this.APELLIDO = APELLIDO;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public int getID_PRACTICANTE() {
        return ID_PRACTICANTE;
    }

    public void setID_PRACTICANTE(int ID_PRACTICANTE) {
        this.ID_PRACTICANTE = ID_PRACTICANTE;
    }

    public int getID_INSTRUCTOR() {
        return ID_INSTRUCTOR;
    }

    public void setID_INSTRUCTOR(int ID_INSTRUCTOR) {
        this.ID_INSTRUCTOR = ID_INSTRUCTOR;
    }

    public int getEDAD() {
        return EDAD;
    }

    public void setEDAD(int EDAD) {
        this.EDAD = EDAD;
    }

    public int getCEDULA() {
        return CEDULA;
    }

    public void setCEDULA(int CEDULA) {
        this.CEDULA = CEDULA;
    }

    public int getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(int TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

   
    
@Override
    public String toString() {
        return "Practicante{" +
                "nombre='" + NOMBRE + '\'' +
                ", apellido='" + APELLIDO + '\'' +
                ", direccion='" + DIRECCION + '\'' +
                ", id_practicante=" + ID_PRACTICANTE +
                ", cedula=" + CEDULA +
                ", edad=" + EDAD +
                ", telefono=" + TELEFONO +
                '}';
    }
}