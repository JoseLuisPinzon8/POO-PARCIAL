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
public class CasaSoftware {
    private ArrayList<Contrato> contratos;

    public CasaSoftware(ArrayList<Contrato> contratos) {
        this.contratos = new ArrayList<>();
    }
    
    public void addContrato(Contrato contrato){
        
        this.contratos.add(contrato);
    }
    
    public double calcularSalarioTotal (){
        double salarioTotal = 0;
        for (Contrato contrato : contratos) {
            salarioTotal+= contrato.calcularsalario();
        }
        return salarioTotal;
    }
    
    public String mostrarInfo(){
        String info="";
        for (Contrato contrato : contratos) {
            info+= " " + contrato.mostrarInfo();
        }
        return info;
    }
}
