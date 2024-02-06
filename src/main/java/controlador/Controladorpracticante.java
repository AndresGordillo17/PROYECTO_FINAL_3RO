/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.Practicante;
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
     private Practicante practicante;
    Conexion conectar=new Conexion();
    Connection conectado=(Connection)conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public Controladorpracticante() {
    }

    public Practicante getPracticante() {
        return practicante;
    }

    public void setPracticante(Practicante practicante) {
        this.practicante = practicante;
    }

    
    

 
    public void crearPractcante(Practicante p){
        try {
            String SQL = "CALL CrearPracticante('" + p.getNOMBRE()+ "', '" +
        p.getAPELLIDO() + "', " + p.getEDAD()+ ", '" +p.getCEDULA()+ "', " +
        p.getDIRECCION()+ "', " + p.getTELEFONO()+ ")"; 
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

   public ArrayList<Object[]> datosPracticante() {
    ArrayList<Object[]> listaTotalP = new ArrayList<>();
    try {
        String SQL = "call ListarPracticantes()";
        try (PreparedStatement stmt = conectado.prepareCall(SQL);
             ResultSet res = stmt.executeQuery()) {
            int cont = 1;
            while (res.next()) {
                Object[] fila = new Object[7];
                for (int i = 1; i <= 6; i++) {
                    fila[i] = res.getObject(i);
                }
                fila[0] = cont;
                listaTotalP.add(fila);
                cont++;
            }
        }
        return listaTotalP;
    } catch (SQLException e) {
        System.out.println("BDD" + e);
        e.printStackTrace();
    }
    return null;
}

public  ArrayList<Object[]>buscarPracticante(int cedula){
        ArrayList<Object[]> listaTotalRegistros=new ArrayList<>();
        try {
            String sql = "call BuscarPracticante('" +cedula+ "');";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            ResultSet resultado=ejecutar.executeQuery();
            int cont=1;
            while(resultado.next()){
                Object[]fila=new Object[6];
                for (int i = 0; i < 6; i++) {
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
            
            String sql = "CALL ActualizarPracticante('" + p.getNOMBRE()+ "', '" +
        p.getAPELLIDO() + "', " + p.getEDAD()+ ", '" +p.getCEDULA()+ "', " +
        p.getDIRECCION()+ "', " + p.getTELEFONO()+ ")"; 
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            //executeUpdate cuando escribo la bdd
            //int res cuando escribo
            int res=ejecutar.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog
        (null, "Instructor actualizada con éxito");
                System.out.println("PERSONA CREADA CON ÉXITO");
                ejecutar.close();
            }else{
                JOptionPane.showMessageDialog
        (null, "Revisar los datos ingresados al momento de querer actualizar");
                System.out.println("REVISAR LA INFORMACIÓN INGRESADA");
            }
            } catch (SQLException e) {
                System.out.println("COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
    
    }
    
    public void eliminarPracticante(int cedula){
        try {
            
            String sql = "call EliminarPracticante('"+cedula+"');";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            //executeUpdate cuando escribo la bdd
            //int res cuando escribo
            int res=ejecutar.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog
        (null, "Instructor eliminada con éxito");
                System.out.println("PERSONA CREADA CON ÉXITO");
                ejecutar.close();
            }else{
                JOptionPane.showMessageDialog
        (null, "Revisar los datos ingresados al momento de querer eliminar");
                System.out.println("REVISAR LA INFORMACIÓN INGRESADA");
            }
            } catch (SQLException e) {
                System.out.println("COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
    
    }
}