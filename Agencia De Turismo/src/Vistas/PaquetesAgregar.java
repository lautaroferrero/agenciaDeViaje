/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import agencia.de.turismo.Alojamiento;
import agencia.de.turismo.AlojamientoData;
import agencia.de.turismo.Conexion;
import agencia.de.turismo.Paquete;
import agencia.de.turismo.PaqueteData;
import agencia.de.turismo.Traslado;
import agencia.de.turismo.TrasladoData;
import java.util.List;

/**
 *
 * @author Familia
 */
public class PaquetesAgregar extends javax.swing.JInternalFrame {
public int id;
     public int modo; 
    //1 agregar, 2 actualizar
    public PaquetesAgregar(int id, int modo) {
        initComponents();
        this.id = id;
        this.modo = modo;
        if(modo == 2) {
                btn_aceptar.setText("Actualizar");
            }
        try {
        
            Conexion con = new Conexion("jdbc:mysql://localhost/agenciadeturismo", "root", ""); 
              TrasladoData pd = new TrasladoData(con);
            List<Traslado> listaTraslado = pd.listadoTraslado(); 
            PaqueteData paquete = new PaqueteData(con);
            Paquete paqueteCompleto = null;
            if(modo == 2) {
                paqueteCompleto = paquete.consultarPaquete(id);
            }
            for (int i = 0; i < listaTraslado.size(); i++) { 
                //cmb_traslado.addItem(listaTraslado.get(i).getTipoDeTransporte() + " " + listaTraslado.get(i).getPatente() + " " + listaTraslado.get(i).getCantidadMaximaDePasajeros());
                cmb_traslado.addItem(listaTraslado.get(i));
                if(modo == 2 && listaTraslado.get(i).getId() == paqueteCompleto.getTraslado().getId()) {
                    cmb_traslado.setSelectedItem(listaTraslado.get(i));
                }
            }
            AlojamientoData ad = new AlojamientoData(con);
            List<Alojamiento> listaAlojamiento = ad.listadoAlojamiento(); 
            
            for (int i = 0; i < listaAlojamiento.size(); i++) { 
                cmb_alojamiento.addItem(listaAlojamiento.get(i));
                if(modo == 2 && listaAlojamiento.get(i).getId() == paqueteCompleto.getAlojamiento().getId()) {
                    cmb_alojamiento.setSelectedItem(listaAlojamiento.get(i));
                }
            }
            
           
            
            }
         catch(Exception ex) {
           System.out.println(ex.getMessage());
        }
          
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        cmb_traslado = new javax.swing.JComboBox<>();
        cmb_alojamiento = new javax.swing.JComboBox<>();
        labelTraslado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_aceptar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        cmb_traslado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_trasladoActionPerformed(evt);
            }
        });

        labelTraslado.setText("Traslado");

        jLabel2.setText("Alojamiento");

        btn_aceptar.setText("Agregar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(labelTraslado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmb_alojamiento, 0, 222, Short.MAX_VALUE)
                    .addComponent(cmb_traslado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmb_alojamiento)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_traslado, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTraslado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
     if(modo == 1) {
        try {
        
            Conexion con = new Conexion("jdbc:mysql://localhost/agenciadeturismo", "root", ""); 
              PaqueteData pd = new PaqueteData(con);
              Paquete p = new Paquete();
              Traslado tra = (Traslado) cmb_traslado.getSelectedItem();
              Alojamiento alo = (Alojamiento) cmb_alojamiento.getSelectedItem();
              p.setAlojamiento(alo);
              p.setTraslado(tra);
              pd.agregarPaquete(p);
              this.dispose();
      } catch(Exception ex) { 
          System.out.println(ex.getMessage());
      }
//                Traslado tra = (Traslado) cmb_traslado.getSelectedItem();
//              labelTraslado.setText(String.valueOf(tra.getId()));
     }
     if(modo == 2) {
        try {
        
            Conexion con = new Conexion("jdbc:mysql://localhost/agenciadeturismo", "root", ""); 
              PaqueteData pd = new PaqueteData(con);
              Paquete p = new Paquete();
              Traslado tra = (Traslado) cmb_traslado.getSelectedItem();
              Alojamiento alo = (Alojamiento) cmb_alojamiento.getSelectedItem();
              p.setId(id);
              pd.actualizarPaquete(p, tra.getId(), alo.getId());
              this.dispose();
      } catch(Exception ex) { 
          System.out.println(ex.getMessage());
      }  
     }
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void cmb_trasladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_trasladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_trasladoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JComboBox<Alojamiento> cmb_alojamiento;
    private javax.swing.JComboBox<Traslado> cmb_traslado;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelTraslado;
    // End of variables declaration//GEN-END:variables
}
