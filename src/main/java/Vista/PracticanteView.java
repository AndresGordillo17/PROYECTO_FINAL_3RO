package Vista;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */


import Modelo.Practicante;
import controlador.Controladorinstructor;
import controlador.Controladorpracticante;
import controlador.Menu;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class PracticanteView extends javax.swing.JInternalFrame {

    /**
     * Creates new form Practicantem
     */
    public PracticanteView() {
        initComponents();
        setModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNOMBRE = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTELEFONO = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        txtAPELLIDO = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDIRECCION = new javax.swing.JTextField();
        txtEDAD = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnagregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBPracti = new javax.swing.JTable();
        btneliminar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        txtNOMBRE.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("APELLIDO :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setText("NOMBRE :");

        txtTELEFONO.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setText("EDAD :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel7.setText("TELEFONO :");

        txtcedula.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        txtAPELLIDO.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtAPELLIDO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAPELLIDOActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setText("CEDULA :");

        txtDIRECCION.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtDIRECCION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDIRECCIONActionPerformed(evt);
            }
        });

        txtEDAD.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setText("DIRECCION :");

        btnagregar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnagregar.setText("GUARDAR");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("DATOS PRACTIANTE");

        TBPracti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TBPracti);

        btneliminar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnbuscar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnbuscar.setText("BUSCAR");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btnactualizar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnactualizar.setText("ACTUALIZAR");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAPELLIDO, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(112, 112, 112)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btneliminar)
                                    .addComponent(btnagregar))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnbuscar)
                                    .addComponent(btnactualizar))
                                .addGap(139, 235, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDIRECCION, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtAPELLIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnbuscar)
                            .addComponent(btnagregar))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btneliminar)
                            .addComponent(btnactualizar))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDIRECCION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 ArrayList<Practicante> listaPracticante = new ArrayList<>();
    DefaultTableModel modeloP = new DefaultTableModel();

    public void setModel() {
        String[] cabecera = {"Nro.","ID_Instructor", "Nombres",
            "Apellidos",
            "Edad",
            "Cédula",
            "dirección",
            "telefono"};
        modeloP.setColumnIdentifiers(cabecera);
        TBPracti.setModel(modeloP);

    }

    public void setDatos() {
        Object[] datosPracticante = new Object[modeloP.getColumnCount()];
        int nro = 1;
        for (Practicante datosP : listaPracticante) {
            datosPracticante[0] = nro;
            datosPracticante[1] = datosP.getID_INSTRUCTOR();
            datosPracticante[2] = datosP.getNOMBRE();
            datosPracticante[3] = datosP.getAPELLIDO();
            datosPracticante[4] = datosP.getEDAD();
            datosPracticante[5] = datosP.getCEDULA();
            datosPracticante[6] = datosP.getDIRECCION();
            datosPracticante[7] = datosP.getTELEFONO();
            nro++;
            modeloP.addRow(datosPracticante);
        }

    }
    private void txtAPELLIDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAPELLIDOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAPELLIDOActionPerformed

    private void txtDIRECCIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDIRECCIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDIRECCIONActionPerformed

    private boolean validarTexto(String texto) {
    return texto.matches("[a-zA-Z]+");
}
    private boolean validarDireccion(String direccion) {
    return direccion.matches("[a-zA-Z0-9]+");
}
    private boolean validarEdad(String edadStr) {
    try {
        int edad = Integer.parseInt(edadStr);
        return edad >= 4 && edad <= 18;
    } catch (NumberFormatException e) {
        return false;
    }
}
    private boolean validarLongitud(String texto, int longitud) {
    return texto.length() == longitud;
}
    private boolean validarNumero(String numero) {
    return numero.matches("\\d+");
}
    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
String nombre = txtNOMBRE.getText();
    String apellido = txtAPELLIDO.getText();
    String direccion = txtDIRECCION.getText();
    String edadStr = txtEDAD.getText();
    String cedulaStr = txtcedula.getText();
    String telefonoStr = txtTELEFONO.getText();
    if (!validarTexto(nombre)) {
        JOptionPane.showMessageDialog(this, "El nombre solo puede contener letras.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!validarTexto(apellido)) {
        JOptionPane.showMessageDialog(this, "El apellido solo puede contener letras.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!validarDireccion(direccion)) {
        JOptionPane.showMessageDialog(this, "La dirección debe contener solo letras y números.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!validarEdad(edadStr)) {
        JOptionPane.showMessageDialog(this, "La edad debe ser un número entero entre 4 y 18.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!validarLongitud(cedulaStr, 10) || !validarNumero(cedulaStr)) {
        JOptionPane.showMessageDialog(this, "La cédula debe contener exactamente 10 dígitos numéricos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!validarLongitud(telefonoStr, 10) || !validarNumero(telefonoStr)) {
        JOptionPane.showMessageDialog(this, "El teléfono debe contener exactamente 10 dígitos numéricos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
        
       Practicante PRA = new Practicante(txtNOMBRE.getText(), txtAPELLIDO.getText(),
               txtDIRECCION.getText(), 0,
               0, Integer.parseInt(txtEDAD.getText()), Integer.parseInt(txtcedula.getText()),
               Integer.parseInt(txtTELEFONO.getText()));
       
        Controladorpracticante CP = new Controladorpracticante();
        CP.crearPracticante(PRA);
        listaPracticante.add(PRA);
        setDatos();
        TBPracti.setModel(modeloP);
       
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        int cedula=Integer.parseInt(txtcedula.getText());
        Controladorpracticante CP=new Controladorpracticante();
        CP.eliminarPracticante(cedula);
        limpiarTablaP();
        cargarTablaP();
        limpiarEntradas();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        int cedula=Integer.parseInt(txtcedula.getText());
        Controladorpracticante CP=new Controladorpracticante();
        ArrayList<Object[]> listas=CP.buscarPracticante(cedula);
        for(Object[] filas:listas){
            modeloP.addRow(filas);
        }
        CP.buscarPracticante(cedula);
        limpiarTablaP();
        cargarTablaP();
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
        Practicante PRA = new Practicante(txtNOMBRE.getText(), txtAPELLIDO.getText(),
               txtDIRECCION.getText(), 0,
               0, Integer.parseInt(txtEDAD.getText()), Integer.parseInt(txtcedula.getText()),
               Integer.parseInt(txtTELEFONO.getText()));
        Controladorpracticante CP=new Controladorpracticante();
        CP.actualizarPracticante(PRA);
        limpiarTablaP();
        cargarTablaP();

    }//GEN-LAST:event_btnactualizarActionPerformed
private void limpiarTablaP() {
        int a = modeloP.getRowCount() - 1;  //Índices van de 0 a n-1
        //System.out.println("Tabla "+a);   //Para mostrar por consola el resultado
        for (int i = a; i >= 0; i--) {

            //System.out.println("i "+i);    //Para mostrar por consola el resultado
            modeloP.removeRow(i);
        }
    }
    private void cargarTablaP(){
        Controladorpracticante pC = new Controladorpracticante();
        ArrayList<Object[]> lista = pC.datosPracticante();
        for (Object[] filas : lista) {
            modeloP.addRow(filas);
        }
      
        TBPracti.setModel(modeloP);
        
    }
    
    public void limpiarEntradas(){
         txtNOMBRE.setText("");
        txtAPELLIDO.setText("");
        txtcedula.setText("");
        txtDIRECCION.setText("");
        txtTELEFONO.setText("");
        txtEDAD.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBPracti;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAPELLIDO;
    private javax.swing.JTextField txtDIRECCION;
    private javax.swing.JTextField txtEDAD;
    private javax.swing.JTextField txtNOMBRE;
    private javax.swing.JTextField txtTELEFONO;
    private javax.swing.JTextField txtcedula;
    // End of variables declaration//GEN-END:variables
}
