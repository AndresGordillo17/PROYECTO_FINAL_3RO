/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.Practicante;
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
     private Practicante practicante;
    Conexion conectar=new Conexion();
    Connection conectado=(Connection)conectar.conectar();
    PreparedStatement iniciar;
    ResultSet ejecutar;
    
    public Practicante getPracticante() {
        return practicante;
    }

    public void setPracticante(Practicante practicante) {
        this.practicante = practicante;
    }

    
    public void crearPractcante(Practicante P){
        try {
            String SQL = "CALL CrearPracticante('" + P.getNOMBRE()+ "', '" +
        P.getAPELLIDO() + "', " + P.getEDAD()+ "," +P.getCEDULA()+ ",'" +
        P.getDIRECCION()+ "', " + P.getTELEFONO()+ ")"; 
            iniciar=(PreparedStatement)conectado.prepareCall(SQL);
            int res= iniciar.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null, "PERSONA CREADA CON EXITO!!!!");
            }else{
               JOptionPane.showMessageDialog(null,"REVISE LA INFO!!!!");
            }
            iniciar.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"CONTACTESE CON EL ADMINISTRADOR !!"+e);
        }
    
    }

   public ArrayList<Object[]> datosPracticante() {
    ArrayList<Object[]> listaTotalP = new ArrayList<>();
    try {
        String SQL = "call ListarPracticantes()";
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

public  ArrayList<Object[]>buscarPracticante(int cedula){
        ArrayList<Object[]> listaTotalRegistros=new ArrayList<>();
        try {
            String sql = "call BuscarPracticante('" +cedula+ "');";
            iniciar = (PreparedStatement) conectado.prepareCall(sql);
            ResultSet resultado=iniciar.executeQuery();
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
            iniciar.close();
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
            iniciar = (PreparedStatement) conectado.prepareCall(sql);
            //executeUpdate cuando escribo la bdd
            //int res cuando escribo
            int res=iniciar.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog
        (null, "Practicante actualizado con éxito");
                iniciar.close();
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
            iniciar = (PreparedStatement) conectado.prepareCall(sql);
            //executeUpdate cuando escribo la bdd
            //int res cuando escribo
            int res=iniciar.executeUpdate();
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

   