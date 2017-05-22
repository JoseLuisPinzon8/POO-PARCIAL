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
public class NivelCarga extends Sensor{
    
    private int tipo;

    public NivelCarga(int tipo, String marca, String referencia, String fechaInstala) {
        super(marca, referencia, fechaInstala);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "NivelCarga{" + "tipo=" + tipo + '}';
    }
    


    public int getTipo() {
        return tipo;
    }
    
    
}
