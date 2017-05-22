/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meteorologia;

/**
 *
 * @author Estudiante
 */
public abstract class Sensor {
    protected String marca;
    protected String referencia;
    protected String fechaInstala;

    public Sensor(String marca, String referencia, String fechaInstala) {
        this.marca = marca;
        this.referencia = referencia;
        this.fechaInstala = fechaInstala;
    }
    
    public abstract String toString();
  
}
