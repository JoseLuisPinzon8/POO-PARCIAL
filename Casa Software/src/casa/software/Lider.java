/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa.software;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Lider extends Programador{
    private ArrayList<Programador> equipo;

    public Lider(ArrayList<Programador> equipo, String lenguaje, int id, String nombre, double salario) {
        super(lenguaje, id, nombre, salario);
        this.equipo = new ArrayList<>(); //Se  cambia a new ArrayList<>() para romper la relacion de agregacion
    }

    @Override
    public double calcularsalario() {
        double salarioTotal = this.calcularsalario();
        salarioTotal+=(salarioTotal*(this.equipo.size()*0.1));
        return salarioTotal;
    }

    @Override
    public String mostrarInfo() {
        String info = this.mostrarInfo();
        info += "---Equipo---\n";
        for (Programador programador : equipo) {
            info+= " " + programador.mostrarInfo();
        }
        return info;
    }
    
    public void AddProgramador(Programador programador){
        this.equipo.add(programador);
    }
    
}
