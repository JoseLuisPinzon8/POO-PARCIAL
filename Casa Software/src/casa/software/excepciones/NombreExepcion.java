/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa.software.excepciones;

/**
 *
 * @author Estudiante
 */
public class NombreExepcion extends Exception{
    public NombreExepcion(){
        super("El nombre debe tener mas de 10 caracteres");
    }
}
