/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import agencia.de.turismo.Cliente;
import agencia.de.turismo.ClienteData;
import agencia.de.turismo.Conexion;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Familia
 */
public class ListaClientes extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo;
     public JDesktopPane escritorio;
    /**
     * Creates new form ListaClientes
     */
    public ListaClientes() {
        initComponents();
         
        try {
            Conexion con = new Conexion("jdbc:mysql://localhost/agenciadeturismo", "root", ""); 
            ClienteData cd = new ClienteData(con);
            List<Cliente> listaCliente = cd.listadoClientes();
             modelo = (DefaultTableModel) tb_cliente.getModel();
            tb_cliente.setDefaultRenderer(Object.class, new Render());

            
            modelo.setRowCount(0);
            Object[] fila = new Object[modelo.getColumnCount()];

            for (int i = 0; i < listaCliente.size(); i++) {
                fila[0] = listaCliente.get(i).getId();
                fila[1] = listaCliente.get(i).getNombre();
                fila[2] = listaCliente.get(i).getDocumento();
                fila[3] = listaCliente.get(i).getCelular();
                JButton btnBorrar = new JButton();
                btnBorrar.setText("Borrar");
                fila[4] = btnBorrar;
               
                JButton btnActualizar = new JButton();
                btnActualizar.setText("Actualizar");
                fila[5] = btnActualizar;
                
                modelo.addRow(fila);
            }
        } catch(Exception ex) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_cliente = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        tb_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Documento", "Celular", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_cliente.setName(""); // NOI18N
        tb_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_clienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_cliente);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_clienteMouseClicked
        int column = tb_cliente.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/tb_cliente.getRowHeight();
        
        if(column == 4) {
            AvisoBorrar avisoBorrar = new AvisoBorrar();
        escritorio.removeAll();
        escritorio.repaint();
        avisoBorrar.setVisible(true);
        
        avisoBorrar.id = (int)tb_cliente.getValueAt(row, 0);
       
        escritorio.add(avisoBorrar).setSize(400, 400);
        escritorio.moveToFront(avisoBorrar);
        
        }
        if(column == 5) {
        int id = (int)tb_cliente.getValueAt(row, 0);
        String nombre = (String)tb_cliente.getValueAt(row, 1);
        int documento = (int)tb_cliente.getValueAt(row, 2);
        int celular = (int)tb_cliente.getValueAt(row, 3);
        
        ClientesAgregar frmAgregar = new ClientesAgregar(id, nombre, documento, celular);
        escritorio.removeAll();
        escritorio.repaint();
        frmAgregar.setVisible(true);
        frmAgregar.modo = 2;
        frmAgregar.id = (int)tb_cliente.getValueAt(row, 0);
        frmAgregar.nombre = (String)tb_cliente.getValueAt(row, 1);
        frmAgregar.documento = (int)tb_cliente.getValueAt(row, 2);
        frmAgregar.celular = (int)tb_cliente.getValueAt(row, 3);
        escritorio.add(frmAgregar).setSize(400, 400);
        escritorio.moveToFront(frmAgregar);
        }
        
    }//GEN-LAST:event_tb_clienteMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ClientesAgregar frmAgregar = new ClientesAgregar();
        escritorio.removeAll();
        escritorio.repaint();
        frmAgregar.setVisible(true);
        frmAgregar.modo = 1;
        escritorio.add(frmAgregar).setSize(400, 400);
        escritorio.moveToFront(frmAgregar);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_cliente;
    // End of variables declaration//GEN-END:variables
}
