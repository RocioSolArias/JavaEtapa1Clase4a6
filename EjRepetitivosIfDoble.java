/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4.pkg5.pkg6.guia3;

import java.util.Scanner;

/**
 *
 * @author Rocio
 */
public class EjRepetitivosIfDoble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 //Nos interesa que el usuario ingrese un numero y saber si es par o impar
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();
        
        if(numero % 2 == 0){
            
            System.out.println("Es par");
            
            
        }else{
            
            System.out.println("Es impar");
            
        }
        
        
        
    }

}
