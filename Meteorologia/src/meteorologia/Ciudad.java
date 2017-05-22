/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meteorologia;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Ciudad {
    private ArrayList<EstacionMeteoro> estacion;

    public Ciudad() {
        this.estacion = new ArrayList<>();
    }

    public ArrayList<EstacionMeteoro> getEstacion() {
        return estacion;
    }

    public void setEstacion(ArrayList<EstacionMeteoro> estacion) {
        this.estacion = estacion;
    }
    
    public void addEstacion (EstacionMeteoro e){
        estacion.add(e);
    }
    
    public String toString(){
        String info="";
        for (EstacionMeteoro estacionMeteoro : estacion) {
           // String info="";
            info+= " " + estacionMeteoro.toString();
        }
        return info;
        
}
}
