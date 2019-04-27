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
public class PaqueteData {
      private Connection connection = null;
    public PaqueteData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch(SQLException ex) {
         System.out.println("Error al obtener la conexion" + ex.getMessage());   
        }
    }
 public void agregarPaquete(Paquete paquete){
        try {
            String sql = "INSERT INTO paquete (id_traslado, id_alojamiento) VALUES (?, ?)"; 
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, paquete.getTraslado().getId());
            statement.setInt(2, paquete.getAlojamiento().getId());
            
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
                    if (rs.next()) {
                        paquete.setId(rs.getInt(1));
                    } else {
                        System.out.println("no se pudo agregar paquete");
                    }
                    statement.close();
        } catch (SQLException ex) {
            System.out.println("error al agregar paquete" + ex.getMessage());
        }
        
    }
public void borrarPaquete(Paquete paquete) {
    try {
              String sql = "DELETE FROM paquete WHERE id = ?"; 
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, paquete.getId());
            statement.executeUpdate();
    } catch (Exception ex){
        System.out.println(ex.getMessage());
    }
    
}
public void actualizarPaquete(Paquete paquete, int idTraslado, int idAlojamiento){
   try {
    String sql = "UPDATE paquete SET id_traslado = ?, documento = ? WHERE id = ? "; 
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, idTraslado);
            statement.setInt(2, idAlojamiento);
            statement.setInt(3, paquete.getId());
            statement.executeUpdate();
            
           
   } catch(Exception ex) {
       System.out.println(ex.getMessage());
   }              
}
public List<Paquete> listadoPaquete() {
    
    List<Paquete> b = new ArrayList<Paquete>();
    try {
        String sql = "SELECT * FROM paquete"; 
         PreparedStatement statement = connection.prepareStatement(sql);
              ResultSet rs = statement.executeQuery(); 
               Paquete a;
         while(rs.next()) {
            Traslado t = new Traslado();
            Alojamiento s = new Alojamiento();
                a = new Paquete(t,s); 
                
                a.setId(rs.getInt("id"));
                a.setIdAlojamiento(rs.getInt("id_alojamiento"));
                a.setIdTraslado(rs.getInt("id_traslado"));
                b.add(a);
            }
         statement.close();
    } catch(Exception ex) {
        System.out.println(ex.getMessage());
        
    }
   return b;
} 
}
