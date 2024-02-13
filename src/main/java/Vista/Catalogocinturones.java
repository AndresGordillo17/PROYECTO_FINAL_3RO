/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Modelo.Cinturones;
import controlador.Controladorcinturones;
import controlador.Controladorinstructor;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class Catalogocinturones extends javax.swing.JInternalFrame {

    /**
     * Creates new form Catalogocinturones
     */
    public Catalogocinturones() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtcolor = new javax.swing.JTextField();
        txtbuscar = new javax.swing.JButton();
        txtactualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBcinturones = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("CATALOGO DE CINTURONES ");

        txtcolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcolorActionPerformed(evt);
            }
        });

        txtbuscar.setText("Buscar");
        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });

        txtactualizar.setText("actualizar");
        txtactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtactualizarActionPerformed(evt);
            }
        });

        TBcinturones.setBackground(new java.awt.Color(255, 204, 255));
        TBcinturones.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TBcinturones);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtactualizar))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(txtbuscar)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtcolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtactualizar)))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
ArrayList<Cinturones> listaCinturones = new ArrayList<>();
    DefaultTableModel MC = new DefaultTableModel();

    public void setModel() {
        String[] cabecera = {"Nro.",
            "Color","Descripción"};
        MC.setColumnIdentifiers(cabecera);
        TBcinturones.setModel(MC);

    }

    public void setDatos() {
        Object[] datosFila = new Object[MC.getColumnCount()];
        int nro = 1;
        for (Cinturones datos : listaCinturones) {
            datosFila[0] = nro;
            datosFila[1] = datos.getColor();
            datosFila[2] = datos.getDescripcion();

            
            MC.addRow(datosFila);
        }

    }
    private void txtactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtactualizarActionPerformed
        // TODO add your handling code here:
//        Cinturones Cinturon = new Cinturones(0, txt.getText(), title);
//        );
//        Controladorcinturones pC=new Controladorcinturones();
//        pC.actuali(Cinturon);
//        limpiarTabla();
        cargarTabla();
    }//GEN-LAST:event_txtactualizarActionPerformed

    private void txtcolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcolorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcolorActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
        
        Controladorcinturones pC=new Controladorcinturones();
        ArrayList<Object[]> listas=pC.buscarcinturon(txtcolor.getText());
        limpiarTabla();
        for(Object[] filas:listas){
            MC.addRow(filas);
        }
        TBcinturones.setModel(MC);
    }//GEN-LAST:event_txtbuscarActionPerformed
private void limpiarTabla() {
        int a = MC.getRowCount() - 1;  //Índices van de 0 a n-1
        //System.out.println("Tabla "+a);   //Para mostrar por consola el resultado
        for (int i = a; i >= 0; i--) {

            //System.out.println("i "+i);    //Para mostrar por consola el resultado
            MC.removeRow(i);
        }
    }
    private void cargarTabla(){
        Controladorcinturones pC = new Controladorcinturones();
        ArrayList<Object[]> lista = pC.datosCinturones();
        for (Object[] filas : lista) {
            MC.addRow(filas);
        }
      
        TBcinturones.setModel(MC);
        
    }
    
    public void limpiarEntradas(){
         txtcolor.setText("");
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBcinturones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton txtactualizar;
    private javax.swing.JButton txtbuscar;
    private javax.swing.JTextField txtcolor;
    // End of variables declaration//GEN-END:variables
}