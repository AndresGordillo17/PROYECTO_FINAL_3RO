/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.Cinturones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Controladorcinturones {
     private Cinturones cinturon;
    Conexion conectar=new Conexion();
    Connection conectado=(Connection)conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public Controladorcinturones() {
    }

    public Cinturones getCinturon() {
        return cinturon;
    }

    public void setCinturon(Cinturones cinturon) {
        this.cinturon = cinturon;
    }
    
    public ArrayList<Object[]> datosCinturones() {
        ArrayList<Object[]> catalogo = new ArrayList<>();
        try {
            String SQL = "call ListarCinturones()";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            //excuteQuery cuando consulto la bdd
            //Recibo un result set cuando consulto
            ResultSet res = ejecutar.executeQuery();
            int cont = 1;
            while (res.next()) {
                Object[] fila = new Object[3];
                for (int i = 0; i < 3; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                fila[0] = cont;
                catalogo.add(fila);
                cont++;
            }
            ejecutar.close();

            return catalogo;
        } catch (SQLException e) {
            System.out.println("BDD" + e);
        }
        return null;
    }
    public  ArrayList<Object[]>buscarcinturon(String color){
        ArrayList<Object[]> catalogo=new ArrayList<>();
        try {
            String sql = "call BuscarCinturon('" +color+ "');";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            ResultSet resultado=ejecutar.executeQuery();
            int cont=1;
            while(resultado.next()){
                Object[]fila=new Object[3];
                for (int i = 0; i < 3; i++) {
                    fila[i]=resultado.getObject(i+1);
               }
                fila[0]=cont;
                catalogo.add(fila);
                cont++;
            }
            ejecutar.close();
            return catalogo;         
            
                 
            } catch (SQLException e) {
                System.out.println("COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
            return null;
    }
    
}
