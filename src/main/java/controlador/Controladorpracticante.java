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

//public ArrayList<Object[]> datosPracticante() {
//    ArrayList<Object[]> listaTotalP = new ArrayList<>();
//    try {
//        String SQL = "call ListarPracticantes()";
//        try (PreparedStatement stmt = 
//             ResultSet res = stmt.executeQuery()) {
//            int cont = 1;
//            while (res.next()) {
//                Object[] fila = new Object[7];
//                for (int i = 1; i <= 6; i++) {
//                    fila[i] = res.getObject(i);
//                }
//                fila[0] = cont;
//                listaTotalP.add(fila);
//                cont++;
//            }
//        }
//        return listaTotalP;
//    } catch (SQLException e) {
//        System.out.println("BDD" + e);
//        e.printStackTrace();
//    }
//    return null;
//}
//    
}
