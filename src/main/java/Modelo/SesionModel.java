/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class SesionModel {
    String Usuraio;
    String Contraseña;

    public SesionModel() {
    }

    public SesionModel(String Usuraio, String Contraseña) {
        this.Usuraio = Usuraio;
        this.Contraseña = Contraseña;
    }

    public String getUsuraio() {
        return Usuraio;
    }

    public void setUsuraio(String Usuraio) {
        this.Usuraio = Usuraio;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    
}
