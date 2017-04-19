
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class EscribirEnArchivo {
    public static void main(String[] args) throws FileNotFoundException {
        File perro = new File("hello.txt");
        PrintStream output = new PrintStream (perro);
        output.println("Hela mundo");
        output.println();
        output.println("Este programa genera 4");
        output.println("lineas ed codigo");
        System.out.println(perro.getAbsoluteFile());
        System.out.println(perro.exists());
        if(perro.delete()){
            System.out.println("kjk");
        }else{
            System.out.println("hjhj");
        }
        System.out.println(perro.exists());
    }
    }

