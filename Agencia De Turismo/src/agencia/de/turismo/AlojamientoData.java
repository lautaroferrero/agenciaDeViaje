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
public class AlojamientoData {
      private Connection connection = null;
    public AlojamientoData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch(SQLException ex) {
         System.out.println("Error al obtener la conexion" + ex.getMessage());   
        }
    }
 public void agregarAlojamiento(Alojamiento alojamiento){
        try {
            String sql = "INSERT INTO alojamiento (direccion, capacidad, costo_por_noche, admite_fumadores, tipo_de_alojamiento) VALUES (?, ?, ?, ?, ?)"; 
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, alojamiento.getDireccion());
            statement.setInt(2, alojamiento.getCapacidad());
            statement.setInt(3, alojamiento.getCostoPorNoche());
            statement.setBoolean(4, alojamiento.isAdmiteFumadores());
            statement.setString(5, alojamiento.getTipo_de_alojamiento());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
                    if (rs.next()) {
                        alojamiento.setId(rs.getInt(1));
                    } else {
                        System.out.println("no se pudo agregar alojamiento");
                    }
                    statement.close();
        } catch (SQLException ex) {
            System.out.println("error al agregar alojamiento" + ex.getMessage());
        }
        
    }
public void borrarAlojamiento(Alojamiento alojamiento) {
    try {
              String sql = "DELETE FROM alojamiento WHERE id = ?"; 
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, alojamiento.getId());
            statement.executeUpdate();
    } catch (Exception ex){
        System.out.println(ex.getMessage());
    }
    
}
public void actualizarAlojamiento(Alojamiento alojamiento, String direccion, int capacidad, int costoPorNoche, boolean admiteFumadores, String tipo_de_alojamiento){
   try {
    String sql = "UPDATE alojamiento SET direccion = ?, capacidad = ?, costo_por_noche = ?, admite_fumadores = ?,tipo_de_alojamiento = ? WHERE id = ? "; 
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, direccion);
            statement.setInt(2, capacidad);
            statement.setInt(3, costoPorNoche);
            statement.setInt(4, alojamiento.boolAInt(admiteFumadores));
            statement.setString(5, tipo_de_alojamiento);
            statement.setInt(6, alojamiento.getId());
            statement.executeUpdate();
            
           
   } catch(Exception ex) {
       System.out.println(ex.getMessage());
   }              
}
public List<Alojamiento> listadoAlojamiento() {
    
    List<Alojamiento> b = new ArrayList<Alojamiento>();
    try {
        String sql = "SELECT * FROM alojamiento"; 
         PreparedStatement statement = connection.prepareStatement(sql);
              ResultSet rs = statement.executeQuery(); 
               Alojamiento a;
         while(rs.next()) {
                a = new Alojamiento(); 
                a.setId(rs.getInt("id"));
                a.setTipo_de_alojamiento(rs.getString("tipo_de_alojamiento"));
                a.setDireccion(rs.getString("direccion"));
                a.setCapacidad(rs.getInt("capacidad"));
                a.setCostoPorNoche(rs.getInt("costo_por_noche"));
                a.setAdmiteFumadores(rs.getBoolean("admite_fumadores"));
                a.setTipo_de_alojamiento(rs.getString("tipo_de_alojamiento"));
                b.add(a);
            }
         statement.close();
    } catch(Exception ex) {
        System.out.println(ex.getMessage());
        
    }
   return b;
}
}
