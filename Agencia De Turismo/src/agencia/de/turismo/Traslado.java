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
public class Traslado {
     private int id = -1;
    private String tipoDeTransporte;
    private int cantidadMaximaDePasajeros;
    private int costoPorKilometro;
    public Traslado() {
        this.id = -1;
    }
      public Traslado(int id) {
        this.id = id;
    }
    public Traslado(int id, String tipoDeTransporte, int cantidadMaximaDePasajeros, int costoPorKilometro) {
    this.id = id;
    this.tipoDeTransporte = tipoDeTransporte;
        this.cantidadMaximaDePasajeros = cantidadMaximaDePasajeros;
        this.costoPorKilometro = costoPorKilometro;
    }

    
    public Traslado(String tipoDeTransporte, int cantidadMaximaDePasajeros, int costoPorKilometro) {
        this.tipoDeTransporte = tipoDeTransporte;
        this.cantidadMaximaDePasajeros = cantidadMaximaDePasajeros;
        this.costoPorKilometro = costoPorKilometro;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoDeTransporte() {
        return tipoDeTransporte;
    }

    public void setTipoDeTransporte(String tipoDeTransporte) {
        this.tipoDeTransporte = tipoDeTransporte;
    }

    public int getCantidadMaximaDePasajeros() {
        return cantidadMaximaDePasajeros;
    }

    public void setCantidadMaximaDePasajeros(int cantidadMaximaDePasajeros) {
        this.cantidadMaximaDePasajeros = cantidadMaximaDePasajeros;
    }

    public int getCostoPorKilometro() {
        return costoPorKilometro;
    }

    public void setCostoPorKilometro(int costoPorKilometro) {
        this.costoPorKilometro = costoPorKilometro;
    }
    
}
