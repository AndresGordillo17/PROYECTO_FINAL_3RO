/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


import java.sql.Date;


/**
 *
 * @author usuario
 */
public class Ficha {

    private String Practicante, instructor, cinturon;
    private int tecnica, conocimiento, puntuacion,id_evaluacion,cedula;
    private String fecha, resultado, observaciones;



    public Ficha() {
    }


    public Ficha(String Practicante, String instructor, String cinturon, int id_evaluacion,int cedula, int tecnica, int conocimiento, int puntuacion, String resultado, String observaciones,String fecha) {
        this.Practicante = Practicante;
        this.instructor = instructor;
        this.cinturon = cinturon;
        this.id_evaluacion = id_evaluacion;
        this.cedula=cedula;
        this.tecnica = tecnica;
        this.conocimiento = conocimiento;
        this.puntuacion = puntuacion;
        this.fecha = fecha;
        this.resultado = resultado;
        this.observaciones = observaciones;

   
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
    public int getConocimiento() {
        return conocimiento;
    }

    public void setConocimiento(int conocimiento) {
        this.conocimiento = conocimiento;

    }
    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getId_evaluacion() {
        return id_evaluacion;
    }

    public void setId_evaluacion(int id_evaluacion) {
        this.id_evaluacion = id_evaluacion;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
   
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Ficha{" +
                "Idevaluacion =" + id_evaluacion + '\'' +
                "Practicante='" + Practicante + '\'' +
                ", cedula=" + cedula +
                ", instructor='" + instructor + '\'' +
                ", cinturon='" + cinturon + '\'' +
                ", resultado='" + resultado + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", tecnica=" + tecnica +
                ", conocimiento=" + conocimiento +
                ", puntuacion=" + puntuacion +
//                ", fechaEvaluacion=" + fecha+
                '}';
    }

}
