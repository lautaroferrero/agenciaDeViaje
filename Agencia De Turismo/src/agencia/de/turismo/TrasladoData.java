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
public class TrasladoData {
      private Connection connection = null;
    public TrasladoData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch(SQLException ex) {
         System.out.println("Error al obtener la conexion" + ex.getMessage());   
        }
    }
 public void agregarTraslado(Traslado traslado){
        try {
            String sql = "INSERT INTO traslado (tipo_de_transporte, cantidad_maxima_de_pasajeros, costo_por_kilometro) VALUES (?, ?, ?)"; 
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, traslado.getTipoDeTransporte());
            statement.setInt(2, traslado.getCantidadMaximaDePasajeros());
            statement.setInt(3, traslado.getCostoPorKilometro());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
                    if (rs.next()) {
                        traslado.setId(rs.getInt(1));
                    } else {
                        System.out.println("no se pudo agregar traslado");
                    }
                    statement.close();
        } catch (SQLException ex) {
            System.out.println("error al agregar traslado" + ex.getMessage());
        }
        
    }
public void borrarTraslado(Traslado traslado) {
    try {
              String sql = "DELETE FROM traslado WHERE id = ?"; 
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, traslado.getId());
            statement.executeUpdate();
    } catch (Exception ex){
        System.out.println(ex.getMessage());
    }
    

} 
public void actualizarTraslado(Traslado traslado, String tipoDeTransporte, int cantidadMaximaDePasajeros, int costoPorKilometro){
   try {
    String sql = "UPDATE traslado SET tipo_de_transporte = ?, cantidad_maxima_de_pasajeros = ?, costo_por_kilometro = ? WHERE id = ? "; 
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, tipoDeTransporte);
            statement.setInt(2, cantidadMaximaDePasajeros);
            statement.setInt(3, costoPorKilometro);
            statement.setInt(4, traslado.getId());
            statement.executeUpdate();
            
           
   } catch(Exception ex) {
       System.out.println(ex.getMessage());
   }              
}
public List<Traslado> listadoTraslado() {
    
    List<Traslado> b = new ArrayList<Traslado>();
    try {
        String sql = "SELECT * FROM traslado"; 
         PreparedStatement statement = connection.prepareStatement(sql);
              ResultSet rs = statement.executeQuery(); 
               Traslado a;
         while(rs.next()) {
                a = new Traslado(); 
                a.setId(rs.getInt("id"));
                a.setCantidadMaximaDePasajeros(rs.getInt("cantidad_maxima_de_pasajeros"));
                a.setTipoDeTransporte(rs.getString("tipo_de_transporte"));
                a.setCostoPorKilometro(rs.getInt("costo_por_kilometro"));
                b.add(a);
            }
         statement.close();
    } catch(Exception ex) {
        System.out.println(ex.getMessage());
        
    }
   return b;
}
}
