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
import javax.swing.JDesktopPane;

/**
 *
 * @author usuario
 */
public class AlojamientoAgregar extends javax.swing.JInternalFrame {
public int modo;
        public int id;
                public int capacidad;
                        public int costepornoche;
                                public int admitefumadores;
                                public String tipo;
    public String direccion;
         public JDesktopPane escritorio;
    /**
     * Creates new form AlojamientoAgregar
     * "Si".equals(tb_admitefumadores.getText())
     */
         
    public AlojamientoAgregar() {
        initComponents();
    
    }
    
    public AlojamientoAgregar(int modo, int id, int capacidad, int costepornoche, int admitefumadores, String direccion) {
this.modo = modo;
        this.capacidad = capacidad;
        this.id = id;
                this.costepornoche = costepornoche;
                        this.admitefumadores = admitefumadores;
                        this.direccion = direccion;
                        
       
                        tb_admitefumadores.setText(Integer.toString(admitefumadores));

               tb_capacidad.setText(Integer.toString(capacidad));
                  tb_costo.setText(Integer.toString(costepornoche));
                  tb_direccion.setText(direccion);
    
    
}
    public AlojamientoAgregar(int id, int capacidad, int costepornoche, int admitefumadores, String direccion, String tipo) {

        this.capacidad = capacidad;
        this.id = id;
        this.tipo = tipo;
                this.costepornoche = costepornoche;
                        this.admitefumadores = admitefumadores;
                        this.direccion = direccion;
    
                 
               
                 
    
}

private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        if(modo == 1) {         
            Alojamiento a = new Alojamiento();
            Conexion conexion = null;
        try {
            conexion = new Conexion("jdbc:mysql://localhost/asdawawe", "root", "");
           
         
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClientesAgregar.class.getName()).log(Level.SEVERE, null, ex);
          
        }
            AlojamientoData ad = new AlojamientoData(conexion);         
            a.setCapacidad(Integer.parseInt(tb_capacidad.getText()));
            a.setDireccion(tb_direccion.getText());
            a.setCostoPorNoche(Integer.parseInt(tb_costo.getText()));
          
             int b = 0;
                     if((String.valueOf(tb_fumadores.getSelectedItem()) == "Si")) {
                    b = 1;
                    }
                    
                    else {
                    b = 0;
                    
                    }
                    
            
            a.setAdmiteFumadores(b);
          
            a.setTipoDeAlojamiento(String.valueOf(tb_tipo.getSelectedItem()));
            ad.agregarAlojamiento(a); 
            this.dispose();
        } 
       
        if(modo == 2) {
            Conexion conexion = null;
            Alojamiento a = new Alojamiento();
        try {
            conexion = new Conexion("jdbc:mysql://localhost/asdawawe", "root", "");
           
         
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClientesAgregar.class.getName()).log(Level.SEVERE, null, ex);
          
        }
            AlojamientoData ad = new AlojamientoData(conexion);
            a.setId(id);
            capacidad = Integer.parseInt(tb_capacidad.getText());
            costepornoche =Integer.parseInt(tb_costo.getText());
            direccion = tb_direccion.getText();
          int b;
                    if((String.valueOf(tb_fumadores.getSelectedItem()) == "Si")) {
                    b = 1;
                    }
                    
                    else {
                    b = 0;
                    
                    }
                    
            admitefumadores = b; 
            tipo = String.valueOf(tb_tipo.getSelectedItem());
            
             
            ad.actualizarAlojamiento(a,  direccion,capacidad, costepornoche, admitefumadores, tipo);
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
        jComboBox1 = new javax.swing.JComboBox<>();
        tb_admitefumadores = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jCheckBox1 = new javax.swing.JCheckBox();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tb_capacidad = new javax.swing.JTextField();
        tb_costo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tb_direccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tb_tipo = new javax.swing.JComboBox<>();
        tb_fumadores = new javax.swing.JComboBox<>();

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        tb_admitefumadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_admitefumadoresActionPerformed(evt);
            }
        });

        jToggleButton1.setText("si");

        jRadioButton1.setText("jRadioButton1");

        jToggleButton2.setText("jToggleButton2");

        jCheckBox1.setText("jCheckBox1");

        jRadioButton2.setText("Si");

        jRadioButton3.setText("jRadioButton3");

        jLabel1.setText("Capacidad:");

        jLabel2.setText("Costo:");

        jLabel3.setText("AdmiteFumadores:");

        tb_capacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_capacidadActionPerformed(evt);
            }
        });

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

        jLabel5.setText("Direccion:");

        jLabel6.setText("TipoDeAlojamiento:");

        tb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casa", "Hotel", "Departamento", "Complejo", "Duplex", "Cuarto", "Motel" }));

        tb_fumadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel4)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tb_costo)
                                    .addComponent(tb_capacidad)
                                    .addComponent(tb_direccion)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tb_fumadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 336, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tb_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tb_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tb_capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tb_fumadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
    
      if(modo == 1){
        Alojamiento a = new Alojamiento();
        
        Conexion conexion = null;
        try {
            conexion = new Conexion("jdbc:mysql://localhost/asdawawe", "root", "");
           
         
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClientesAgregar.class.getName()).log(Level.SEVERE, null, ex);
        }
        AlojamientoData ad = new AlojamientoData(conexion);
        int b;
        if((String.valueOf(tb_fumadores.getSelectedItem()) == "Si")) {
            b = 1;
        }
        else {
            b = 0;
        }
        a.setAdmiteFumadores(b);
        a.setCapacidad(Integer.parseInt(tb_capacidad.getText()));
        a.setCostoPorNoche(Integer.parseInt(tb_costo.getText()));
        a.setDireccion(tb_direccion.getText());
        a.setTipoDeAlojamiento(String.valueOf(tb_tipo.getSelectedItem()));
        ad.agregarAlojamiento(a);
        this.dispose();
        
        
      }
      if ( modo == 2) {
       Conexion conexion = null;
        try {
            conexion = new Conexion("jdbc:mysql://localhost/asdawawe", "root", "");
           
         
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClientesAgregar.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tb_admitefumadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_admitefumadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_admitefumadoresActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTextField tb_admitefumadores;
    private javax.swing.JTextField tb_capacidad;
    private javax.swing.JTextField tb_costo;
    private javax.swing.JTextField tb_direccion;
    private javax.swing.JComboBox<String> tb_fumadores;
    private javax.swing.JComboBox<String> tb_tipo;
    // End of variables declaration//GEN-END:variables
}
