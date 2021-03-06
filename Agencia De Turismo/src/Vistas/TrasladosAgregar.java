/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import agencia.de.turismo.Conexion;
import agencia.de.turismo.Traslado;
import agencia.de.turismo.TrasladoData;
import java.util.logging.*;

public class TrasladosAgregar extends javax.swing.JInternalFrame{
    public int modo; 
    //1 agregar, 2 actualizar
    public int id;
    public String patente;
    public String tipo;
    public int capacidad;
    public int costo;
    /**
     * Creates new form FormularioCliente
     */
    
    public TrasladosAgregar() {
        initComponents();
        
    }
    
    public TrasladosAgregar(int id, int modo, String patente, String tipo, int capacidad, int costo) {
        initComponents();
        this.id = id;
        this.patente = patente;
        this.modo = modo;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.costo = costo;
                if(modo == 2) {
                jButton1.setText("Actualizar");
                }
                t_patente.setText(patente);
                cmb_tipo.setSelectedItem(tipo);
                t_capacidad.setValue(capacidad);
                t_costoXKm.setValue(costo);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        t_patente = new javax.swing.JTextField();
        t_capacidad = new javax.swing.JSpinner();
        t_costoXKm = new javax.swing.JSpinner();
        cmb_tipo = new javax.swing.JComboBox<>();

        jTextField1.setText("jTextField1");

        jTextField4.setText("jTextField4");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setText("jTextField5");

        jLabel1.setText("ID");

        jLabel2.setText("Patente");

        jLabel3.setText("Tipo de vehiculo");

        jLabel4.setText("Capacidad");

        jLabel5.setText("Costo por Km");

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        t_patente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_patenteActionPerformed(evt);
            }
        });

        cmb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Auto", "Camioneta", "Colectivo", "Auto de lujo", "Moto", "Limusina", "Jet", "Avion", "Helicoptero", "Avioneta" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_patente)
                            .addComponent(cmb_tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(t_capacidad, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(t_costoXKm, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(t_patente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t_capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(t_costoXKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void t_patenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_patenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_patenteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(modo == 1) {         
            Traslado c = new Traslado();
            Conexion conexion = null;
        try {
            conexion = new Conexion("jdbc:mysql://localhost/agenciadeturismo", "root", "");
           
         
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClientesAgregar.class.getName()).log(Level.SEVERE, null, ex);
          
        }
            TrasladoData cd = new TrasladoData(conexion);         
            c.setCantidadMaximaDePasajeros((int) t_capacidad.getValue());
            c.setPatente( t_patente.getText());
            c.setTipoDeTransporte((String) cmb_tipo.getSelectedItem());
            c.setCostoPorKilometro((int) t_costoXKm.getValue());
            cd.agregarTraslado(c); 
            this.dispose();
        } 
       
        if(modo == 2) {
            Conexion conexion = null;
            Traslado c = new Traslado();
        try {
            conexion = new Conexion("jdbc:mysql://localhost/agenciadeturismo", "root", "");
           
         
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TrasladosAgregar.class.getName()).log(Level.SEVERE, null, ex);
          
        }
            TrasladoData cd = new TrasladoData(conexion);
            c.setId(id);
            patente = t_patente.getText();
            tipo = (String) cmb_tipo.getSelectedItem();
            costo = (int) t_costoXKm.getValue();
            capacidad = (int) t_capacidad.getValue();
            cd.actualizarTraslado(c, patente, tipo, capacidad, costo);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_tipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JSpinner t_capacidad;
    private javax.swing.JSpinner t_costoXKm;
    private javax.swing.JTextField t_patente;
    // End of variables declaration//GEN-END:variables
}
