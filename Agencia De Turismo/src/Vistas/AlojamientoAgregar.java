/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import agencia.de.turismo.Alojamiento;
import agencia.de.turismo.AlojamientoData;
import agencia.de.turismo.Cliente;
import agencia.de.turismo.ClienteData;
import agencia.de.turismo.Conexion;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class AlojamientoAgregar extends javax.swing.JInternalFrame {
public int modo;
        public int id;
                public int capacidad;
                        public int costepornoche;
                                public boolean admitefumadores;
    public String direccion;
    /**
     * Creates new form AlojamientoAgregar
     */
    public AlojamientoAgregar() {
        initComponents();
    
    }
    
    public AlojamientoAgregar(int modo, int id, int capacidad, int costepornoche, boolean admitefumadores, String direccion) {
this.modo = modo;
        this.capacidad = capacidad;
        this.id = id;
                this.costepornoche = costepornoche;
                        this.admitefumadores = admitefumadores;
                        this.direccion = direccion;
                        
       
                        String convertirString;
                        
                        if(admitefumadores = true) { convertirString = "Si";
}
                        else { convertirString = "No";
                        
                        }
                        
                        tb_admitefumadores.setText(convertirString);

               tb_capacidad.setText(Integer.toString(capacidad));
                  tb_costo.setText(Integer.toString(costepornoche));
                  tb_direccion.setText(direccion);
    
    
}
    public AlojamientoAgregar(int id, int capacidad, int costepornoche, boolean admitefumadores, String direccion) {

        this.capacidad = capacidad;
        this.id = id;
                this.costepornoche = costepornoche;
                        this.admitefumadores = admitefumadores;
                        this.direccion = direccion;
                        
       
                        String convertirString;
                        
                        if(admitefumadores = true) { convertirString = "Si";
}
                        else { convertirString = "No";
                        
                        }
                        
                        tb_admitefumadores.setText(convertirString);

               tb_capacidad.setText(Integer.toString(capacidad));
                  tb_costo.setText(Integer.toString(costepornoche));
                  tb_direccion.setText(direccion);
    
    
}

private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        if(modo == 1) {         
            Alojamiento a = new Alojamiento();
            Conexion conexion = null;
        try {
            conexion = new Conexion("jdbc:mysql://localhost/agenciadeturismo", "root", "");
           
         
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClientesAgregar.class.getName()).log(Level.SEVERE, null, ex);
          
        }
            AlojamientoData ad = new AlojamientoData(conexion);         
            a.setCapacidad(Integer.parseInt(tb_capacidad.getText()));
            a.setDireccion(tb_direccion.getText());
            a.setCostoPorNoche(Integer.parseInt(tb_costo.getText()));
            a.setAdmiteFumadores(tb_admitefumadores.getText() == "Si");
            ad.agregarAlojamiento(a); 
            this.dispose();
        } 
       
        if(modo == 2) {
            Conexion conexion = null;
            Alojamiento a = new Alojamiento();
        try {
            conexion = new Conexion("jdbc:mysql://localhost/agenciadeturismo", "root", "");
           
         
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClientesAgregar.class.getName()).log(Level.SEVERE, null, ex);
          
        }
            AlojamientoData ad = new AlojamientoData(conexion);
            a.setId(id);
            capacidad = Integer.parseInt(tb_capacidad.getText());
            costepornoche =Integer.parseInt(tb_costo.getText());
            direccion = tb_direccion.getText();
            admitefumadores = tb_admitefumadores.getText() == "Si";
            ad.actualizarAlojamiento(a,  direccion,capacidad, costepornoche, admitefumadores);
            this.dispose();
        }
    }                                          



    AlojamientoAgregar(int id, String direccion, String capacidad, String coste_por_noche, String admitefumadores) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tb_capacidad = new javax.swing.JTextField();
        tb_costo = new javax.swing.JTextField();
        tb_admitefumadores = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tb_direccion = new javax.swing.JTextField();

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Capacidad:");

        jLabel2.setText("Costo:");

        jLabel3.setText("AdmiteFumadores:");

        tb_capacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_capacidadActionPerformed(evt);
            }
        });

        jButton1.setText("Agregar");

        jButton2.setText("Cancelar");

        jLabel5.setText("Direccion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tb_admitefumadores, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                    .addComponent(tb_costo)
                                    .addComponent(tb_capacidad)
                                    .addComponent(tb_direccion))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tb_capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tb_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tb_admitefumadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tb_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(jLabel4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void tb_capacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_capacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_capacidadActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField tb_admitefumadores;
    private javax.swing.JTextField tb_capacidad;
    private javax.swing.JTextField tb_costo;
    private javax.swing.JTextField tb_direccion;
    // End of variables declaration//GEN-END:variables
}