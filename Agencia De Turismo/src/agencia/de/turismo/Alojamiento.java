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
public class Alojamiento {
     private int id = -1;
    private String direccion;
    private int capacidad;
    private int costoPorNoche;
     private boolean admiteFumadores;
     
        public Alojamiento(){
            this.id = -1;
        }
        public Alojamiento(int id){
            this.id = id;
        }
       public Alojamiento(int id, String direccion, int capacidad, int costoPorNoche, boolean admiteFumadores) {
        this.id = id;
        this.direccion = direccion;
        this.capacidad = capacidad;
        this.costoPorNoche = costoPorNoche;
        this.admiteFumadores = admiteFumadores;
    }
    public Alojamiento(String direccion, int capacidad, int costoPorNoche, boolean admiteFumadores) {
        this.direccion = direccion;
        this.capacidad = capacidad;
        this.costoPorNoche = costoPorNoche;
        this.admiteFumadores = admiteFumadores;
    }
     

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCostoPorNoche() {
        return costoPorNoche;
    }

    public void setCostoPorNoche(int costoPorNoche) {
        this.costoPorNoche = costoPorNoche;
    }

    public boolean isAdmiteFumadores() {
        return admiteFumadores;
    }

    public void setAdmiteFumadores(boolean admiteFumadores) {
        this.admiteFumadores = admiteFumadores;
    }
     
}