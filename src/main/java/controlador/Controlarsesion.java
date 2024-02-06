/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.SesionModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author usuario
 */
public class Controlarsesion {
    private SesionModel sesion ;
    Conexion conectar=new Conexion();
    Connection conectado=(Connection)conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public Controlarsesion() {
    }

    public SesionModel getSesion() {
        return sesion;
    }

    public void setSesion(SesionModel sesion) {
        this.sesion = sesion;
    }
    
     public int verificarCredenciales(String usuario, String contraseña) {
    try {
        String consulta = "SELECT contraseña FROM login WHERE usuario = ?";
        ejecutar = conectado.prepareStatement(consulta);
        ejecutar.setString(1, usuario);
        resultado = ejecutar.executeQuery();
        
        if (resultado.next()) {
            String contraseñaDB = resultado.getString("contraseña");
            if (contraseña.equals(contraseñaDB)) {
                // La contraseña es correcta
                return 1;
            } else {
                // La contraseña es incorrecta
                return -1;
            }
        } else {
            // El usuario no existe
            return 0;
        }
    } catch (Exception e) {
        e.printStackTrace();
        return -2; // Error en la consulta
    }
}
}

