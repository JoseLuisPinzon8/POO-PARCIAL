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
public class Temperatura extends Sensor{
    
    private int grados;

    public Temperatura(int grados, String marca, String referencia, String fechaInstala) {
        super(marca, referencia, fechaInstala);
        this.grados = grados;
    }

    public int getGrados() {
        return grados;
    }

    @Override
    public String toString() {
        return "Temperatura{" + "grados=" + grados + '}';
    }
    
    
}
