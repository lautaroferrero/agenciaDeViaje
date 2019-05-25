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
        String sql = "SELECT co.id, co.id_cliente, co.id_paquete, co.cantidad_pasajeros, cl.nombre, cl.documento, p.id_alojamiento, p.id_traslado, a.tipo_de_alojamiento, a.direccion, t.tipo_de_transporte, t.patente FROM compra co, cliente cl, paquete p, alojamiento a, traslado t WHERE co.id_cliente = cl.id AND co.id_paquete = p.id AND p.id_alojamiento = a.id AND p.id_traslado = t.id"; 
         PreparedStatement statement = connection.prepareStatement(sql);
              ResultSet rs = statement.executeQuery(); 
               Compra a;
         while(rs.next()) {
                a = new Compra(); 
                a.setId(rs.getInt("id"));
                
                Cliente cliente = new Cliente(rs.getInt("id_cliente"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDocumento(rs.getString("documento"));
                a.setCliente(cliente);
                
                Paquete paquete = new Paquete(rs.getInt("id_paquete"));
                Alojamiento alojamiento = new Alojamiento(rs.getInt("id_alojamiento"));
                alojamiento.setTipoDeAlojamiento(rs.getString("tipo_de_alojamiento"));
                alojamiento.setDireccion(rs.getString("direccion"));
                paquete.setAlojamiento(alojamiento);
                Traslado traslado = new Traslado(rs.getInt("id_traslado"));
                traslado.setTipoDeTransporte(rs.getString("tipo_de_transporte"));
                traslado.setPatente(rs.getString("patente"));
                paquete.setTraslado(traslado);
                a.setPaquete(paquete);
                
                a.setCantidadDePasajeros(rs.getInt("cantidad_pasajeros"));
                
                b.add(a);
            }
         statement.close();
    } catch(Exception ex) {
        System.out.println(ex.getMessage());
        
    }
   return b;
}
public Compra consultarCompra(int id) {
    Compra a = null;
    try {
        String sql = "SELECT id, id_cliente, id_paquete, cantidad_pasajeros FROM compra WHERE id = ?"; 
         PreparedStatement statement = connection.prepareStatement(sql);
         statement.setInt(1, id);
              ResultSet rs = statement.executeQuery(); 
               
         while(rs.next()) {
                a = new Compra(); 
                a.setId(rs.getInt("id"));
                
                Cliente cliente = new Cliente(rs.getInt("id_cliente"));
                a.setCliente(cliente);
                
                Paquete paquete = new Paquete(rs.getInt("id_paquete"));
                a.setPaquete(paquete);
                
                a.setCantidadDePasajeros(rs.getInt("cantidad_pasajeros"));
                
            }
         statement.close();
    } catch(Exception ex) {
        System.out.println(ex.getMessage());
        
    }
   return a;
}
}

