/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.Instructor;
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
public class Controladorinstructor {
    private Instructor persona;
    CONEXIONBDD parametros=new CONEXIONBDD();
    Connection conectar=(Connection)parametros.conectar();
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
            ejecutar = (PreparedStatement) conectar.prepareCall(SQL);
            var resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Persona Creada con Éxito");
                System.out.println("PERSONA CREADA CON ÉXITO");
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revise los Datos ingresados");
                System.out.println("REVISE LOS DATOS INGRESADOS");
            }
        } catch (Exception e) {
            System.out.println("ERROR SQL");
        }
    }
    public ArrayList<Object[]> datosIntructores() {
        ArrayList<Object[]> listaTotalRegistros = new ArrayList<>();
        try {
            String SQL = "call ListarInstructores()";
            ejecutar = (PreparedStatement) conectar.prepareCall(SQL);
            //excuteQuery cuando consulto la bdd
            //Recibo un result set cuando consulto
            ResultSet res = ejecutar.executeQuery();
            int cont = 1;
            while (res.next()) {
                Object[] fila = new Object[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                fila[0] = cont;
                listaTotalRegistros.add(fila);
                cont++;
            }
            ejecutar.close();

            return listaTotalRegistros;
        } catch (SQLException e) {
            System.out.println("BDD" + e);
        }
        return null;
    }
    public void actualizarPracticante(Instructor p){
        try {
            String sql = "CALL ActualizarInstructor('"
                    + p.getNombre_ins()+ "','"+p.getId_Instructor()+"','" +
        p.getApellido_ins() + "'," + p.getCedula_ins()+ "," +p.getDireccion_ins()+ ",'" +
        p.getTelefono_ins()+ "'," + p.getGrado_ins()+")"; 
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            //executeUpdate cuando escribo la bdd
            //int res cuando escribo
            int res=ejecutar.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog
        (null, "Practicante actualizado con éxito");
                ejecutar.close();
            }else{
                JOptionPane.showMessageDialog(null,"REVISAR LA INFORMACIÓN INGRESADA");
            }
            } catch (SQLException e) {
               JOptionPane.showMessageDialog(null,"COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
    
    }
    public  ArrayList<Object[]>buscarInstructor(int cedula){
        ArrayList<Object[]> listaTotalRegistros=new ArrayList<>();
        try {
            String sql = "call BuscarIntructor('" +cedula+ "');";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            ResultSet resultado=ejecutar.executeQuery();
            int cont=1;
            while(resultado.next()){
                Object[]fila=new Object[7];
                for (int i = 0; i < 7; i++) {
                    fila[i]=resultado.getObject(i+1);
               }
                fila[0]=cont;
                listaTotalRegistros.add(fila);
                cont++;
            }
            ejecutar.close();
            return listaTotalRegistros;         
            
                 
            } catch (SQLException e) {
                System.out.println("COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
            return null;
    }
    public void eliminarInstructor(int cedula){
        try {
            
            String sql = "call EliminarInstructor('"+cedula+"');";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            //executeUpdate cuando escribo la bdd
            //int res cuando escribo
            int res=ejecutar.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null, "Instructor eliminado con éxito");
            }else{
                JOptionPane.showMessageDialog(null,"REVISAR LA INFORMACIÓN INGRESADA");
            }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
    
    }
    public boolean instructorRegistrado(String nombreInstructor) {
        // Implementa aquí la lógica para verificar si el instructor está registrado en la base de datos
        // Puedes usar consultas a la base de datos u otros métodos de acceso a los datos
        
        // Por ejemplo:
        // Supongamos que tienes una clase de acceso a la base de datos llamada InstructorDAO
        Instructor instructorDAO = new Instructor();
        return instructorDAO.instructorRegistrado(nombreInstructor);
    }
}

