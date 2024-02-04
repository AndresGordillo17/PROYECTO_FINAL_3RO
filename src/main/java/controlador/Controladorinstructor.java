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
 
    public void crearInstructor(Instructor p){
        try {
            String SQL="call CrearInstructor('"+p.getNOM()+"',"
                    + "'"+p.getapellido_ins+"',"
                    + "'"+p.getcedula_ins()+"','"+p.getdireccion_ins()+"',"
                    + "'"+p.gettelefono_ins()+"'"+p.getgrado_ins())";
            ejecutar=(PreparedStatement)conectado.prepareCall(SQL);
            int res= ejecutar.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null, "PERSONA CREADA CON EXITO!!!!");
            }else{
               JOptionPane.showMessageDialog(null,"REVISE LA INFO!!!!");
            }
            ejecutar.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"CONTACTESE CON EL ADMINISTRADOR !!");
        }
    
    }
}
