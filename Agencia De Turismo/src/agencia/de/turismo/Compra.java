/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia.de.turismo;

/**
 *
 * @author Familia
 */
public class Compra {
     private int id = -1;
    private Cliente cliente;
    private Paquete paquete;
    private int cantidadDePasajeros;
    
        public Compra() {
            this.id = -1;
        }
       public Compra(int id, Cliente cliente, Paquete paquete, int cantidadDePasajeros) {
        this.id = id;
           this.cliente = cliente;
        this.paquete = paquete;
        this.cantidadDePasajeros = cantidadDePasajeros;
    }
    
    public Compra(Cliente cliente, Paquete paquete, int cantidadDePasajeros) {
        this.cliente = cliente;
        this.paquete = paquete;
        this.cantidadDePasajeros = cantidadDePasajeros;
    }
   
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public int getCantidadDePasajeros() {
        return cantidadDePasajeros;
    }

    public void setCantidadDePasajeros(int cantidadDePasajeros) {
        this.cantidadDePasajeros = cantidadDePasajeros;
    }
    public void setIdPaquete(int idPaquete) {
        paquete.setId(idPaquete);
    }
    public void setIdCliente(int idCliente) {
        cliente.setId(idCliente);
    }
}
