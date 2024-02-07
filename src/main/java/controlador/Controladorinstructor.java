/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Vista.Instructor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Controladorinstructor {
    private Instructor persona;
    Conexion conectar=new Conexion();
    Connection conectado=(Connection)conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public Controladorinstructor() {
    }

    public Instructor getPersona() {
        return persona;
    }

    public void setPersona(Instructor persona) {
        this.persona = persona;
    }
 
    public void crearInstructor(Modelo.Instructor p){
        try {
            String SQL = "CALL CrearInstructor('" + p.getNombre_ins() + "','" +
                    p.getApellido_ins()+"', '"+p.getCedula_ins()+"','"+p.getDireccion_ins()+"','"+
                    p.getTelefono_ins()+"','"+p.getGrado_ins()+")";
            
        } catch (Exception e) {
        }
    }
    
    
}
