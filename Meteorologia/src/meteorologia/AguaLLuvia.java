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
public class AguaLLuvia extends Sensor{
    
    private int aguaMinuto;

    public AguaLLuvia(int aguaMinuto, String marca, String referencia, String fechaInstala) {
        super(marca, referencia, fechaInstala);
        this.aguaMinuto = aguaMinuto;
    }


    public int getAguaMinuto() {
        return aguaMinuto;
    } 

    @Override
    public String toString() {
        return "AguaLLuvia{" + "aguaMinuto=" + aguaMinuto + '}';
    }
    
}
