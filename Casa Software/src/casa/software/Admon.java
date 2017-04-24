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
public class Admon extends Empleado {

    public Admon(int id, String nombre, double salario) {
        super(id, nombre, salario);
    }

    @Override
    public double calcularsalario() {
        return 200;
    }

    @Override
    public String mostrarInfo() {
        return "Admon: " + this.nombre + " " + this.id;
    }
    
}
