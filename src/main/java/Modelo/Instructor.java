/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class Instructor {
     private String NOMBRE_INS,APELLIDOS_INS,DIRECCION_INS,GRADO;
    private int ID_INSTRUCTOR,CEDULA_INS,TELEFONO_INS;

    public Instructor() {
    }

    public Instructor(String NOMBRE_INS, String APELLIDOS_INS, String DIRECCION_INS, String GRADO, int ID_INSTRUCTOR, int CEDULA_INS, int TELEFONO_INS) {
        this.NOMBRE_INS = NOMBRE_INS;
        this.APELLIDOS_INS = APELLIDOS_INS;
        this.DIRECCION_INS = DIRECCION_INS;
        this.GRADO = GRADO;
        this.ID_INSTRUCTOR = ID_INSTRUCTOR;
        this.CEDULA_INS = CEDULA_INS;
        this.TELEFONO_INS = TELEFONO_INS;
    }

   

    public String getNOMBRE_INS() {
        return NOMBRE_INS;
    }

    public void setNOMBRE_INS(String NOMBRE_INS) {
        this.NOMBRE_INS = NOMBRE_INS;
    }

    public String getAPELLIDOS_INS() {
        return APELLIDOS_INS;
    }

    public void setAPELLIDOS_INS(String APELLIDOS_INS) {
        this.APELLIDOS_INS = APELLIDOS_INS;
    }

    public String getDIRECCION_INS() {
        return DIRECCION_INS;
    }

    public void setDIRECCION_INS(String DIRECCION_INS) {
        this.DIRECCION_INS = DIRECCION_INS;
    }

    public String getGRADO() {
        return GRADO;
    }

    public void setGRADO(String GRADO) {
        this.GRADO = GRADO;
    }


    public int getCEDULA_INS() {
        return CEDULA_INS;
    }

    public void setCEDULA_INS(int CEDULA_INS) {
        this.CEDULA_INS = CEDULA_INS;
    }

    public int getTELEFONO_INS() {
        return TELEFONO_INS;
    }

    public void setTELEFONO_INS(int TELEFONO_INS) {
        this.TELEFONO_INS = TELEFONO_INS;
    }

    public int getID_INSTRUCTOR() {
        return ID_INSTRUCTOR;
    }

    public void setID_INSTRUCTOR(int ID_INSTRUCTOR) {
        this.ID_INSTRUCTOR = ID_INSTRUCTOR;
    }

    
@Override
    public String toString() {

        return "Instructor{" +
                "Nombre_ins='" + NOMBRE_INS + '\'' +
                ", apellido_ins='" + APELLIDOS_INS + '\'' +
                ", direccion_ins='" + DIRECCION_INS + '\'' +
                ", grado_ins='" + GRADO + '\'' +
                ", id_instructor=" + CEDULA_INS +
                ", cedula_ins=" + CEDULA_INS +
                ", telefono_ins=" + TELEFONO_INS +
                '}';

    
}
}
