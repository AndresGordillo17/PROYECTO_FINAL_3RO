/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.*;
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
public class Controladorpracticante {
     
    private Practicante persona;
    CONEXIONBDD parametros = new CONEXIONBDD();
    Connection conectar = (Connection)parametros.conectar();
    PreparedStatement ejecutar;
    ResultSet res;

    public Practicante getPersona() {
        return persona;
    }

    public void setPersona(Practicante persona) {
        this.persona = persona;
    }

public void crearPracticante(Practicante p) {
        try {
            String sql = "call crearPracticante('" + p.getNOMBRE() + "','" + p.getAPELLIDO() + "','" + p.getCEDULA() + "','" + p.getDIRECCION() + "','" + p.getEDAD() + "');";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            var resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Persona Creada con Éxito");
                System.out.println("PERSONA CREADA CON ÉXITO");
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revise los Datos ingresados");
                System.out.println("REVISE LOS DATOS INGRESADOS");
            }
        } catch (SQLException e) {
            System.out.println("ERROR SQL");
        }
    } 

public ArrayList<Object[]> datosPracticante() {
    ArrayList<Object[]> listaTotalP = new ArrayList<>();
    try {
        String SQL = "call ListarPracticantes()";
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
                listaTotalP.add(fila);
                cont++;
            }
            ejecutar.close();

            return listaTotalP;
        } catch (SQLException e) {
            System.out.println("BDD" + e);
        }
        return null;
    }
 
public  ArrayList<Object[]>buscarPracticante(int cedula){
        ArrayList<Object[]> listaTotalRegistros=new ArrayList<>();
        try {
            String sql = "call BuscarPracticante('" +cedula+ "');";
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
public void actualizarPracticante(Practicante p){
        try {
            
            String sql = "CALL ActualizarPracticante('" + p.getNOMBRE()+ "','" +
        p.getAPELLIDO() + "'," + p.getEDAD()+ "," +p.getCEDULA()+ ",'" +
        p.getDIRECCION()+ "'," + p.getTELEFONO()+")"; 
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
public void eliminarPracticante(int cedula){
        try {
            
            String sql = "call EliminarPracticante('"+cedula+"');";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            //executeUpdate cuando escribo la bdd
            //int res cuando escribo
            int res=ejecutar.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null, "Practicante eliminado con éxito");
            }else{
                JOptionPane.showMessageDialog(null,"REVISAR LA INFORMACIÓN INGRESADA");
            }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
    
    }
}


