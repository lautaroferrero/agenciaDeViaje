/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author Familia
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jComboBox1 = new javax.swing.JComboBox<>();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Cliente = new javax.swing.JMenu();
        lista_cliente = new javax.swing.JMenuItem();
        entrar_alojamiento = new javax.swing.JMenu();
        lista_alojamiento = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        Paquete = new javax.swing.JMenu();
        lista_paquete = new javax.swing.JMenuItem();
        compra = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenuItem1.setText("jMenuItem1");

        jMenu5.setText("jMenu5");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem9.setText("jMenuItem9");

        jMenuItem14.setText("jMenuItem14");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        escritorio.setBackground(new java.awt.Color(240, 240, 240));
        escritorio.setForeground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        Cliente.setText("Cliente");
        Cliente.setContentAreaFilled(false);
        Cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lista_cliente.setText("Listado y acciones");
        lista_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lista_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lista_clienteActionPerformed(evt);
            }
        });
        Cliente.add(lista_cliente);

        jMenuBar1.add(Cliente);

        entrar_alojamiento.setText("Alojamiento");
        entrar_alojamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lista_alojamiento.setText("Listado y acciones");
        lista_alojamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lista_alojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lista_alojamientoActionPerformed(evt);
            }
        });
        entrar_alojamiento.add(lista_alojamiento);

        jMenuBar1.add(entrar_alojamiento);

        jMenu1.setText("Traslado");

        jMenuItem3.setText("Listado y acciones");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        Paquete.setText("Paquete");
        Paquete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lista_paquete.setText("Listado y acciones");
        lista_paquete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lista_paquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lista_paqueteActionPerformed(evt);
            }
        });
        Paquete.add(lista_paquete);

        jMenuBar1.add(Paquete);

        compra.setText("Compra");
        compra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem20.setText("Listado y acciones");
        jMenuItem20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        compra.add(jMenuItem20);

        jMenuBar1.add(compra);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lista_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lista_clienteActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ListaClientes lc = new ListaClientes();
        lc.escritorio = escritorio;
        lc.setVisible(true);
         escritorio.add(lc).setSize(600, 400);
        escritorio.moveToFront(lc);
    }//GEN-LAST:event_lista_clienteActionPerformed

    private void lista_alojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lista_alojamientoActionPerformed
      escritorio.removeAll();
        escritorio.repaint();
        ListaAlojamiento2 lc = new ListaAlojamiento2();
        lc.escritorio = escritorio;
        lc.setVisible(true);
         escritorio.add(lc).setSize(600, 400);
        escritorio.moveToFront(lc);
    }//GEN-LAST:event_lista_alojamientoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ListaTraslados lc = new ListaTraslados();
        lc.escritorio = escritorio;
        lc.setVisible(true);
         escritorio.add(lc).setSize(850, 410);
        escritorio.moveToFront(lc);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void lista_paqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lista_paqueteActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ListaPaquete lc = new ListaPaquete();
        lc.escritorio = escritorio;
        lc.setVisible(true);
         escritorio.add(lc).setSize(800, 400);
        escritorio.moveToFront(lc);
    }//GEN-LAST:event_lista_paqueteActionPerformed

    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cliente;
    private javax.swing.JMenu Paquete;
    private javax.swing.JMenu compra;
    private javax.swing.JMenu entrar_alojamiento;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem lista_alojamiento;
    private javax.swing.JMenuItem lista_cliente;
    private javax.swing.JMenuItem lista_paquete;
    // End of variables declaration//GEN-END:variables
}
