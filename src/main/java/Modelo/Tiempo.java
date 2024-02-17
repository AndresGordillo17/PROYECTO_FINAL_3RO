/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author DELL
 */
public class Tiempo {
    Calendar fecha = new GregorianCalendar();
    
    String anio = Integer.toString(fecha.get(Calendar.YEAR));
    String mes = Integer.toString(fecha.get(Calendar.MONTH));
    String dia = Integer.toString(fecha.get(Calendar.DAY_OF_MONTH));
    
    String fechacomp = anio+"-"+mes+"-"+dia;
    
    String hora= Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
    String minuto= Integer.toString(fecha.get(Calendar.MINUTE));
    String segundo= Integer.toString(fecha.get(Calendar.SECOND));
    
    String horacomp = hora+":"+minuto+":"+segundo; 

    public Tiempo() {
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getFechacomp() {
        return fechacomp;
    }

    public void setFechacomp(String fechacomp) {
        this.fechacomp = fechacomp;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMinuto() {
        return minuto;
    }

    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }

    public String getSegundo() {
        return segundo;
    }

    public void setSegundo(String segundo) {
        this.segundo = segundo;
    }

    public String getHoracomp() {
        return horacomp;
    }

    public void setHoracomp(String horacomp) {
        this.horacomp = horacomp;
    }
    
    
    
}
