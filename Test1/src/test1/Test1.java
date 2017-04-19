/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author Estudiante
 */
public class Test1 {

    public Test1(){
        divideByZero();
    }
    
    double divideByZero(int denominador) throws CustomException{
        double result=0;
        if(denominador==0)
            throw new CustomException();
        try{
            result=25/denominador;
        }catch(ArithmeticException exception){
            System.out.println("Error aritmetico, es imposible dividir por cero");
            System.out.println(exception.getMessage());
            
        } 
        return result;
    }
    
    public static void main(String[] args) {
        Test1 test = new Test1();
        System.out.println(12.0/5.0);
        
    }
    
}
