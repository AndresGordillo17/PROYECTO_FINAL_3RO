/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class Ficha {
    private String Practicante,instructor,cinturon, resultado, observaciones;
    private int tecnica,conomimiento,puntuacion,cedula;

    public Ficha() {
    }

    public Ficha(String Practicante, String instructor, String cinturon, String resultado, String observaciones, int tecnica, int conomimiento, int puntuacion, int cedula) {
        this.Practicante = Practicante;
        this.instructor = instructor;
        this.cinturon = cinturon;
        this.resultado = resultado;
        this.observaciones = observaciones;
        this.tecnica = tecnica;
        this.conomimiento = conomimiento;
        this.puntuacion = puntuacion;
        this.cedula = cedula;
    }

    

    public String getPracticante() {
        return Practicante;
    }

    public void setPracticante(String Practicante) {
        this.Practicante = Practicante;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getCinturon() {
        return cinturon;
    }

    public void setCinturon(String cinturon) {
        this.cinturon = cinturon;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getTecnica() {
        return tecnica;
    }

    public void setTecnica(int tecnica) {
        this.tecnica = tecnica;
    }

    public int getConomimiento() {
        return conomimiento;
    }

    public void setConomimiento(int conomimiento) {
        this.conomimiento = conomimiento;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
     
    @Override
public String toString() {
    return "Ficha{" + 
           "Practicante='" + Practicante + '\'' + 
           ", instructor='" + instructor + '\'' + 
           ", cinturon='" + cinturon + '\'' + 
           ", resultado='" + resultado + '\'' + 
           ", observaciones='" + observaciones + '\'' + 
           ", tecnica=" + tecnica + 
           ", conomimiento=" + conomimiento + 
           ", puntuacion=" + puntuacion + 
           '}';
}

}
