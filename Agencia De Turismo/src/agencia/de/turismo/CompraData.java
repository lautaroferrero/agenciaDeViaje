/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia.de.turismo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Familia
 */
public class CompraData {
      private Connection connection = null;
    public CompraData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch(SQLException ex) {
         System.out.println("Error al obtener la conexion" + ex.getMessage());   
        }
    }
 public void agregarCompra(Compra compra){
        try {
            String sql = "INSERT INTO compra (id_cliente, id_paquete, cantidad_pasajeros) VALUES (?, ?, ?)"; 
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, compra.getCliente().getId());
            statement.setInt(2, compra.getPaquete().getId());
            statement.setInt(3, compra.getCantidadDePasajeros());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
                    if (rs.next()) {
                        compra.setId(rs.getInt(1));
                    } else {
                        System.out.println("no se pudo agregar compra");
                    }
                    statement.close();
        } catch (SQLException ex) {
            System.out.println("error al agregar compra" + ex.getMessage());
        }
        
    }
public void borrarCompra(Compra compra) {
    try {
              String sql = "DELETE FROM compra WHERE id = ?"; 
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, compra.getId());
            statement.executeUpdate();
    } catch (Exception ex){
        System.out.println(ex.getMessage());
    }
    
}
public void actualizarCompra(Compra compra, Cliente cliente, Paquete paquete, int cantidadPasajeros){
   try {
    String sql = "UPDATE compra SET id_cliente = ?, id_paquete = ?, cantidad_pasajeros = ? WHERE id = ? "; 
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, cliente.getId());
            statement.setInt(2, paquete.getId());
            statement.setInt(3, cantidadPasajeros);
            statement.setInt(4, compra.getId());
            statement.executeUpdate();
            
           
   } catch(Exception ex) {
       System.out.println(ex.getMessage());
   }              
}
public List<Compra> listadoCompra() {
    
    List<Compra> b = new ArrayList<Compra>();
    try {
        String sql = "SELECT * FROM compra"; 
         PreparedStatement statement = connection.prepareStatement(sql);
              ResultSet rs = statement.executeQuery(); 
               Compra a;
         while(rs.next()) {
                a = new Compra(); 
                a.setId(rs.getInt("id"));
                a.setIdCliente(rs.getInt("id_cliente"));
                a.setIdPaquete(rs.getInt("id_paquete"));
                a.setCantidadDePasajeros(rs.getInt("cantidad_pasajeros"));
                b.add(a);
            }
         statement.close();
    } catch(Exception ex) {
        System.out.println(ex.getMessage());
        
    }
   return b;
}
}

