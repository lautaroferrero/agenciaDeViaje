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
public class Paquete {
     private int id = -1;
    private Traslado traslado;
    private Alojamiento alojamiento;
    
    public Paquete() {
        this.id = -1;
    }
    public Paquete(int id) {
        this.id = id;
    }
    public Paquete(int id, Traslado traslado, Alojamiento alojamiento) {
        this.id = id;
        this.traslado = traslado;
        this.alojamiento = alojamiento;
    }

    public Paquete(Traslado traslado, Alojamiento idAlojamiento) {
        this.traslado = traslado;
        this.alojamiento = alojamiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Traslado getTraslado() {
        return traslado;
    }

    public void setTraslado(Traslado traslado) {
        this.traslado = traslado;
    }

    public Alojamiento getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(Alojamiento alojamiento) {
        this.alojamiento = alojamiento;
    }
    public void setIdAlojamiento(int id) {
        alojamiento.setId(id);
    }
      public void setIdTraslado(int id) {
        traslado.setId(id);
    }
}
