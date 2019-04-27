/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia.de.turismo;
/*try {
       Conexion conexion = new Conexion("jdbc:mysql://localhost/agencia de turismo", "root", "");
          CompraData cd = new CompraData (conexion);
          ClienteData ced = new ClienteData(conexion);
          PaqueteData pd = new PaqueteData(conexion);
          TrasladoData td = new TrasladoData(conexion);
          AlojamientoData ad = new AlojamientoData(conexion);
          Cliente b = new Cliente(40,"aa", "1233", "266464");
          Traslado c = new Traslado(50,"autito",8,20);
          Alojamiento d = new Alojamiento(69,"casita",12,13,true);
          Paquete a = new Paquete(2,c,d);
          td.agregarTraslado(c);
          ad.agregarAlojamiento(d);
          pd.agregarPaquete(a);
          ced.agregarCliente(b);
       Compra e = new Compra(b, a, 1);
    cd.agregarCompra(e);
     
    
       
        } catch (Exception ex) {
         System.out.println(ex.getMessage());
        }*/
import Vistas.VentanaPrincipal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Familia
 */
public class AgenciaDeTurismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

  try {
       Conexion conexion = new Conexion("jdbc:mysql://localhost/agencia de turismo", "root", "");
          CompraData cd = new CompraData (conexion);
          ClienteData ced = new ClienteData(conexion);
          PaqueteData pd = new PaqueteData(conexion);
          TrasladoData td = new TrasladoData(conexion);
          AlojamientoData ad = new AlojamientoData(conexion);
          Cliente b = new Cliente(40,"aa", "1233", "266464");
          Traslado c = new Traslado(50,"autito",8,20);
          Alojamiento d = new Alojamiento(69,"casita",12,13,true);
          Paquete a = new Paquete(2,c,d);
       Compra e = new Compra(b, a, 1);
    System.out.println(pd.listadoPaquete().isEmpty());
     
    
       
        } catch (Exception ex) {
         System.out.println(ex.getMessage());
        }

     
    }
    
}
