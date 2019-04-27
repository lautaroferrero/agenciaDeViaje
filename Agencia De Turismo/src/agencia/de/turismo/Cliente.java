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
public class Cliente {
    private int id = -1;
    private String nombre;
    private String documento;
    private String celular;
    
public Cliente() {
    this.id = -1;
         }
    public Cliente(int id, String nombre, String documento, String celular) {
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
        this.celular = celular;
    }
      public Cliente(String nombre, String documento, String celular) {
        this.id = -1;
        this.nombre = nombre;
        this.documento = documento;
        this.celular = celular;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    
}

