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
public class Consultor implements Contrato{
    protected  int id;
    protected String labor;

    public Consultor(int id, String labor) {
        this.id = id;
        this.labor = labor;
    }

    @Override
    public double calcularsalario() {
        return 100;
    }

    @Override
    public String mostrarInfo() {
        return "El consultor tiene como id: " + this.id + " .Su labor es: " + this.labor;
    }
    
}
