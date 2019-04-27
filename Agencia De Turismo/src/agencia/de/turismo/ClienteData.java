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
public class ClienteData {
    private Connection connection = null;
    public ClienteData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch(SQLException ex) {
         System.out.println("Error al obtener la conexion" + ex.getMessage());   
        }
    }
    public void agregarCliente(Cliente cliente){
        try {
            String sql = "INSERT INTO cliente (nombre, documento, celular) VALUES (?, ?, ?)"; 
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, cliente.getNombre());
            statement.setString(2, cliente.getDocumento());
            statement.setString(3, cliente.getCelular());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
                    if (rs.next()) {
                        cliente.setId(rs.getInt(1));
                    } else {
                        System.out.println("no se pudo agregar cliente");
                    }
                    statement.close();
        } catch (SQLException ex) {
            System.out.println("error al agregar cliente" + ex.getMessage());
        }
        
    }
public void borrarCliente(Cliente cliente) {
    try {
              String sql = "DELETE FROM cliente WHERE id = ?"; 
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, cliente.getId());
            statement.executeUpdate();
    } catch (Exception ex){
        System.out.println(ex.getMessage());
    }
    
} 
public Cliente conseguirCliente(String documento) {
  Cliente a = new Cliente(); 
    try {
        String sql = "SELECT id FROM cliente WHERE documento = ?"; 
        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, documento);
        ResultSet rs = statement.executeQuery();
        if(rs.next()) {
            a.setId(rs.getInt(1));
        }
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
        return a;
    }
    return a;
    
}
public void actualizarCliente(Cliente cliente, String nombre, String documento, String celular){
   try {
    String sql = "UPDATE cliente SET nombre = ?, documento = ?, celular = ? WHERE id = ? "; 
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, nombre);
            statement.setString(2, documento);
            statement.setString(3, celular);
            statement.setInt(4, cliente.getId());
            statement.executeUpdate();
            
           
   } catch(Exception ex) {
       System.out.println(ex.getMessage());
   }              
}
public List<Cliente> listadoClientes() {
    
    List<Cliente> b = new ArrayList<Cliente>();
    try {
        String sql = "SELECT * FROM cliente"; 
         PreparedStatement statement = connection.prepareStatement(sql);
              ResultSet rs = statement.executeQuery(); 
               Cliente a;
         while(rs.next()) {
                a = new Cliente(); 
                a.setId(rs.getInt("id"));
                a.setNombre(rs.getString("nombre"));
                a.setDocumento(rs.getString("documento"));
                a.setCelular(rs.getString("celular"));
                b.add(a);
            }
         statement.close();
    } catch(Exception ex) {
        System.out.println(ex.getMessage());
        
    }
   return b;
}   
}
