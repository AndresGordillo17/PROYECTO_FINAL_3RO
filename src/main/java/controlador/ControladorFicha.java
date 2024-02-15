/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.Ficha;
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
    Conexion conectar=new Conexion();
    Connection conectado=(Connection)conectar.conectar();
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
            // Obtener IDs de practicante, instructor y cinturón a partir de los nombres
            int idPracticante = obtenerIdPracticantePorNombre(f.getPracticante());
            int idInstructor = obtenerIdInstructorPorNombre(f.getInstructor());
            int idCinturon = obtenerIdCinturonPorNombre(f.getCinturon());

            // Insertar el registro en la tabla EVALUACION con los IDs obtenidos
            String SQL = "CALL CrearEvaluacion(?, ?, ?, ?, ?, ?, ?)";
            iniciar = conectado.prepareStatement(SQL);
            iniciar.setInt(1, idPracticante);
            iniciar.setInt(2, idInstructor);
            iniciar.setInt(3, idCinturon);
            iniciar.setString(4, f.getResultado());
            iniciar.setInt(5, f.getPuntuacion());
            iniciar.setString(6, f.getObservaciones());
            res = iniciar.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Ficha creada con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Error al crear la ficha");
            }

            iniciar.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
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
    ArrayList<Object[]> listaTotalP = new ArrayList<>();
    try {
        String SQL = "call ListarFichas()";
        iniciar = (PreparedStatement) conectado.prepareCall(SQL);
            //excuteQuery cuando consulto la bdd
            //Recibo un result set cuando consulto
            ResultSet res = iniciar.executeQuery();
            int cont = 1;
            while (res.next()) {
                Object[] fila = new Object[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                fila[0] = cont;
                listaTotalP.add(fila);
                cont++;
            }
            iniciar.close();

            return listaTotalP;
        } catch (SQLException e) {
            System.out.println("BDD" + e);
        }
        return null;
    }
}