/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa.software;

/**
 *
 * @author Estudiante
 */
public class Programador extends Empleado{
    protected String lenguaje;

    public Programador(String lenguaje, int id, String nombre, double salario) {
        super(id, nombre, salario);
        this.lenguaje = lenguaje;
    }

    @Override
    public double calcularsalario() {
        double bono = 0;
        if(this.lenguaje.equals("java"))
            bono= this.salario*0.2;
        return this.salario + bono;
    }

    @Override
    public String mostrarInfo() {
        return "Programador: " + this.nombre + " " + this.nombre;
    }
    
    
    
}
