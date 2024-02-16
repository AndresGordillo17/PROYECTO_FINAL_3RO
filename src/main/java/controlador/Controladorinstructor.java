/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import controlador.Menu;

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
int res;//para escribir
    public Controladorinstructor() {
    }

    public void setPersona(Instructor persona) {
        this.persona = persona;
    }

    public Instructor getPersona() {
        return persona;
    }

    

 
    public void crearInstructor(Modelo.Instructor p){
        try {
            String SQL = "CALL CrearInstructor('" + p.getNOMBRE_INS() + "', '" +
        p.getAPELLIDOS_INS() + "', " + p.getCEDULA_INS() + ", '" +
        p.getDIRECCION_INS() + "', " + p.getTELEFONO_INS() + ", '" +
        p.getGRADO() + "')";
            ejecutar=(PreparedStatement)conectar.prepareCall(SQL);
            int res= ejecutar.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null, "INSTRUCTOR CREADO CON EXITO!!!!");
            }else{
               JOptionPane.showMessageDialog(null,"REVISE LA INFO!!!!");
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
 

   public ArrayList<Object[]> datosPersonas() {
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

public  ArrayList<Object[]>buscarInstructor(int CEDULA_INS){
        ArrayList<Object[]> listaTotalRegistros=new ArrayList<>();
        try {
            String sql = "call BuscarInstructor('" +CEDULA_INS+ "');";
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
    
    public void actualizarInstructor(Instructor p){
        try {
            
            String sql = "CALL ActualizarInstructor('" + p.getNOMBRE_INS() + "', '" +
        p.getAPELLIDOS_INS() + "', " + p.getCEDULA_INS() + ", '" +
        p.getDIRECCION_INS() + "', " + p.getTELEFONO_INS() + ", '" +
        p.getGRADO() + "')";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);

            if(res>0){
                JOptionPane.showMessageDialog(null, "Instructor actualizado con éxito");
                ejecutar.close();
            }else{
                JOptionPane.showMessageDialog(null, "Revisar los datos ingresados al momento de querer actualizar");
                JOptionPane.showMessageDialog(null, "REVISAR LA INFORMACIÓN INGRESADA");
            }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
    
    }
    
    public void eliminarInstructor(int CEDULA_INS){
        try {
            
            String sql = "call EliminarInstructor('"+CEDULA_INS+"');";
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
}


