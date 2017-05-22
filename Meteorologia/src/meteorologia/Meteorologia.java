/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meteorologia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Meteorologia {

    
    public static void main(String[] args) {
        Ciudad bogota = new Ciudad();
        temp(Archivo("datos.txt"));
        rayo(Archivo("datos.txt"));
        agua(Archivo("datos.txt"));
        EstacionMeteoro estacion1 = null;
        estacion1.setNombre((nombreEstac(Archivo("datos.txt"))));
        bogota.addEstacion(estacion1);
        bogota.toString();
    }
    
    public static Sensor temp(String infotoken){
        String datos[] = infotoken.split(",");
        String ciudad = datos[0];
            if("Bogota".equals(ciudad)){
                return new Temperatura(Integer.parseInt(datos[5]),"kjha","112","06/11/2013"); 
            }
           return null;
        }
    
    public static Sensor rayo(String infotoken){
        String datos[] = infotoken.split(",");
        String ciudad = datos[0];
            if("Bogota".equals(ciudad)){
                return new NivelCarga(Integer.parseInt(datos[7]),"sdsdf","145","06/11/2013"); 
            }
           return null;
        }
    
    public static Sensor agua(String infotoken){
        String datos[] = infotoken.split(",");
        String ciudad = datos[0];
            if("Bogota".equals(ciudad)){
                return new AguaLLuvia(Integer.parseInt(datos[6]),"erter","457","06/11/2013"); 
            }
           return null;
        } 
    
    public static String nombreEstac(String infotoken){
        String datos[] = infotoken.split(",");
        String ciudad = datos[0];
            if("Bogota".equals(ciudad)){
                return datos[0]; 
            }
           return null;
        }
        
    
    
    public static String Archivo(String archivo){
        String token = null;
        try{
            File f = new File (archivo);
            Scanner entrada = new Scanner (f);
            while(entrada.hasNextLine()){
                token=entrada.nextLine();
                System.out.println(token);
                }
        }catch(FileNotFoundException e){
            System.out.println("No se encontro el archivo");
        }
        return token;
        }

    
}
