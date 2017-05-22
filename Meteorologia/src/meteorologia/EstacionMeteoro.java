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
public class EstacionMeteoro {
    private String nombre;
    private String ubicacion;
    private String fechaInstalacion;
    public Sensor sensor;

    public EstacionMeteoro(String nombre, String ubicacion, String fechaInstalacion, Sensor sensor) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.fechaInstalacion = fechaInstalacion;
        this.sensor = sensor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getFechaInstalacion() {
        return fechaInstalacion;
    }

    public void setFechaInstalacion(String fechaInstalacion) {
        this.fechaInstalacion = fechaInstalacion;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }


    
}
