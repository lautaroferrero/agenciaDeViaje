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
    String sql = "UPDATE paquete SET id_traslado = ?, id_alojamiento = ? WHERE id = ? "; 
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, idTraslado);
            statement.setInt(2, idAlojamiento);
            statement.setInt(3, paquete.getId());
            statement.executeUpdate();
            
           
   } catch(Exception ex) {
       System.out.println(ex.getMessage());
   }              
}

    public Paquete consultarPaquete(int idPaquete) {
        Paquete b = new Paquete();
        Alojamiento a = new Alojamiento();
        Traslado t = new Traslado();
           try {
               String sql = "SELECT id_alojamiento, id_traslado FROM paquete WHERE id = ? " ; 
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1, idPaquete);
                     ResultSet rs = statement.executeQuery();
                    
                while(rs.next()) {
                   b.setId(idPaquete);
                   a.setId(rs.getInt(1));
                   b.setAlojamiento(a);
                   t.setId(rs.getInt(2));
                   b.setTraslado(t);
                }
                statement.close();
           } catch(Exception ex) {
               System.out.println(ex.getMessage());

           }
          return b;
    }
    

public List<Paquete> listadoPaquete() {
    
    List<Paquete> b = new ArrayList<Paquete>();
    try {
        String sql = "SELECT p.id, p.id_alojamiento, p.id_traslado, t.patente, t.tipo_de_transporte, a.direccion FROM paquete p, traslado t, alojamiento a WHERE p.id_traslado = t.id AND p.id_alojamiento = a.id"; 
         PreparedStatement statement = connection.prepareStatement(sql);
              ResultSet rs = statement.executeQuery(); 
               Paquete a;
         while(rs.next()) {
            Traslado t = new Traslado();
           
            Alojamiento s = new Alojamiento();
                a = new Paquete(t,s); 
                
                a.setId(rs.getInt("id"));
                Alojamiento alojamiento = new Alojamiento(rs.getInt("id_alojamiento"));
                alojamiento.setDireccion(rs.getString("direccion"));
                a.setAlojamiento(alojamiento);
                
                Traslado traslado = new Traslado(rs.getInt("id_traslado"));
                traslado.setPatente(rs.getString("patente"));
                traslado.setTipoDeTransporte(rs.getString("tipo_de_transporte"));
                a.setTraslado(traslado);
                
                a.setAlojamiento(alojamiento);
                b.add(a);
            }
         statement.close();
    } catch(Exception ex) {
        System.out.println(ex.getMessage());
        
    }
   return b;
} 

public List<Traslado> listadoTrasladoPorAlojamiento(int idAlojamiento) {
    
    List<Traslado> b = new ArrayList<Traslado>();
    try {
        String sql = "SELECT p.id, p.id_traslado, t.patente, t.tipo_de_transporte, t.cantidad_maxima_de_pasajeros FROM paquete p, traslado t, alojamiento a WHERE p.id_traslado = t.id AND p.id_alojamiento = a.id AND p.id_alojamiento=?"; 
         PreparedStatement statement = connection.prepareStatement(sql);
         statement.setInt(1, idAlojamiento);
         ResultSet rs = statement.executeQuery(); 
         Traslado traslado;
         while(rs.next()) {
            traslado = new Traslado();
            traslado.setId(rs.getInt("id_traslado"));
            traslado.setPatente(rs.getString("patente"));
            traslado.setTipoDeTransporte(rs.getString("tipo_de_transporte"));
            traslado.setCantidadMaximaDePasajeros(rs.getInt("cantidad_maxima_de_pasajeros"));
            b.add(traslado);
        }
         statement.close();
    } catch(Exception ex) {
        System.out.println(ex.getMessage());
        
    }
   return b;
}
public Paquete paquetePorAlojamientoTraslado(int idAlojamiento, int idTraslado) {
        Paquete b = new Paquete();
           try {
               String sql = "SELECT id FROM paquete WHERE id_alojamiento = ? AND id_traslado = ?" ; 
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1, idAlojamiento);
                statement.setInt(2, idTraslado);
                
                ResultSet rs = statement.executeQuery();
                    
                while(rs.next()) {
                   b.setId(rs.getInt("id"));
                }
                statement.close();
                } catch(Exception ex) {
                    System.out.println(ex.getMessage());

                }
                return b;
    }
}

