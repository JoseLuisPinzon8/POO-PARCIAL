/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;
import java.io.*;
/**
 *
 * @author Estudiante
 */
public class Archivos {

    public static void main(String[] args) {
        File f = new File("hamlet.txt");
        System.out.println("exists returns " + f.exists());
        System.out.println("canRead returns " + f.canRead());
        System.out.println("lenght returns " + f.length());
        System.out.println("get absolte Path returns " + f.getAbsolutePath());
    }
    
}
