/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.Ficha;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class ControladorFicha {

    private Ficha ficha;
    Conexion conectar = new Conexion();
    Connection conectado = (Connection) conectar.conectar();
    PreparedStatement iniciar;
    ResultSet respuesta;
    int res;//para escribir

    public ControladorFicha() {
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

   public void crearFicha(Ficha f) {
    try {
        // Obtener una conexión preparada para la llamada del procedimiento almacenado
        CallableStatement cs = conectado.prepareCall("{CALL InsertarEvaluacion(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
        
        // Obtener IDs de practicante, instructor y cinturón a partir de los nombres
        int idPracticante = obtenerIdPracticantePorNombre(f.getPracticante());
        int idInstructor = obtenerIdInstructorPorNombre(f.getInstructor());
        int idCinturon = obtenerIdCinturonPorNombre(f.getCinturon());

        // Establecer los valores de los parámetros del procedimiento almacenado
        cs.setInt(1, idPracticante);
        cs.setInt(2, idInstructor);
        cs.setInt(3, idCinturon);
        cs.setInt(4, f.getCedula());
        cs.setString(5, f.getFecha());
        cs.setInt(6, f.getTecnica());
        cs.setInt(7, f.getConocimiento());
        cs.setInt(8, f.getPuntuacion());
        cs.setString(9, f.getResultado());
        cs.setString(10, f.getObservaciones());

        // Ejecutar el procedimiento almacenado
        int res = cs.executeUpdate();

        if (res > 0) {
            JOptionPane.showMessageDialog(null, "FICHA CREADA CON ÉXITO!!!!");
        } else {
            JOptionPane.showMessageDialog(null, "REVISE LA INFORMACIÓN!!!!");
        }

        // Cerrar la conexión
        cs.close();
    } catch (Exception e) {
        // Imprimir el mensaje de error en la consola
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "CONTACTESE CON EL ADMINISTRADOR !!");
    }
}


    private int obtenerIdPracticantePorNombre(String practicante) {
        int idPracticante = 0;
        try {
            String SQL = "SELECT ID_PRACTICANTE FROM PRACTICANTE WHERE NOMBRE = ?";
            iniciar = conectado.prepareStatement(SQL);
            iniciar.setString(1, practicante);
            respuesta = iniciar.executeQuery();
            if (respuesta.next()) {
                idPracticante = respuesta.getInt(1);
            }
            iniciar.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener el ID del practicante: " + ex.getMessage());
        }
        return idPracticante;
    }

    private int obtenerIdInstructorPorNombre(String instructor) {
        int idInstructor = 0;
        try {
            String SQL = "SELECT ID_INSTRUCTOR FROM INSTRUCTORES WHERE NOMBRE_INS = ?";
            iniciar = conectado.prepareStatement(SQL);
            iniciar.setString(1, instructor);
            respuesta = iniciar.executeQuery();
            if (respuesta.next()) {
                idInstructor = respuesta.getInt(1);
            }
            iniciar.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener el ID del instructor: " + ex.getMessage());
        }
        return idInstructor;
    }

    private int obtenerIdCinturonPorNombre(String cinturon) {
        int idCinturon = 0;
        try {
            String SQL = "SELECT ID_CINTURON FROM CINTURON WHERE COLOR = ?";
            iniciar = conectado.prepareStatement(SQL);
            iniciar.setString(1, cinturon);
            respuesta = iniciar.executeQuery();
            if (respuesta.next()) {
                idCinturon = respuesta.getInt(1);
            }
            iniciar.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener el ID del cinturón: " + ex.getMessage());
        }
        return idCinturon;
    }

    public ArrayList<Object[]> datosFicha() {
    ArrayList<Object[]> listaFicha = new ArrayList<>();
    try {
        String sql = "CALL ListarFichas()"; 
        CallableStatement cs = conectado.prepareCall(sql); 
        ResultSet res = cs.executeQuery(); 

        int cont = 1;
        while (res.next()) {
            ArrayList<Object> fila = new ArrayList<>();
            fila.add(cont);
            for (int i = 1; i <= 10; i++) {
                fila.add(res.getObject(i));
            }
            listaFicha.add(fila.toArray());
            cont++;
        }
        cs.close();
        return listaFicha;
    } catch (SQLException e) {
        System.out.println("Error al obtener datos de la base de datos: " + e.getMessage());
    }
    return null;
}


    public void eliminarFicha(int CEDULA) {
        try {

            String sql = "call EliminarFicha('" + CEDULA + "');";
            iniciar = (PreparedStatement) conectado.prepareCall(sql);
            //executeUpdate cuando escribo la bdd
            //int res cuando escribo
            int res = iniciar.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Ficha eliminada con éxito");
                iniciar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revisar los datos ingresados al momento de querer eliminar");
                System.out.println("REVISAR LA INFORMACIÓN INGRESADA");
            }
        } catch (SQLException e) {
            System.out.println("COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }

    }


public void actualizarFicha(Ficha f){
        try {
        // Obtener una conexión preparada para la llamada del procedimiento almacenado
        CallableStatement cs = conectado.prepareCall("{CALL ActualizarEvaluacion(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
        
        // Obtener IDs de practicante, instructor y cinturón a partir de los nombres
        int idPracticante = obtenerIdPracticantePorNombre(f.getPracticante());
        int idInstructor = obtenerIdInstructorPorNombre(f.getInstructor());
        int idCinturon = obtenerIdCinturonPorNombre(f.getCinturon());

        // Establecer los valores de los parámetros del procedimiento almacenado
        cs.setInt(1, idPracticante);
        cs.setInt(2, idInstructor);
        cs.setInt(3, idCinturon);
        cs.setInt(4, f.getCedula());
        cs.setString(5, f.getFecha());
        cs.setInt(6, f.getTecnica());
        cs.setInt(7, f.getConocimiento());
        cs.setInt(8, f.getPuntuacion());
        cs.setString(9, f.getResultado());
        cs.setString(10, f.getObservaciones());

        // Ejecutar el procedimiento almacenado
        int res = cs.executeUpdate();

        if (res > 0) {
            JOptionPane.showMessageDialog(null, "FICHA CREADA CON ÉXITO!!!!");
        } else {
            JOptionPane.showMessageDialog(null, "REVISE LA INFORMACIÓN!!!!");
        }

        // Cerrar la conexión
        cs.close();
    } catch (Exception e) {
        // Imprimir el mensaje de error en la consola
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "CONTACTESE CON EL ADMINISTRADOR !!");
    }
}
}
