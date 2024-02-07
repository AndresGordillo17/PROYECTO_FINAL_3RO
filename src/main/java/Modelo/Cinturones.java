/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class Cinturones {
    private String id_cinturon,Descripcion,color;

    public Cinturones() {
    }

    public Cinturones(String id_cinturon, String Descripcion, String color) {
        this.id_cinturon = id_cinturon;
        this.Descripcion = Descripcion;
        this.color = color;
    }

    public String getId_cinturon() {
        return id_cinturon;
    }

    public void setId_cinturon(String id_cinturon) {
        this.id_cinturon = id_cinturon;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

   
    
    @Override
    public String toString() {
        return "Cinturones{" +
                "id_cinturon='" + id_cinturon + '\'' +
                ", nombre='" + Descripcion + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
