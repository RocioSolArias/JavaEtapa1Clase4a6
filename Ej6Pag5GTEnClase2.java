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
public class Ej6Pag5GTEnClase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = input.nextInt ();
        
        System.out.println("Ingrese el segundo número: ");
        int num2 = input.nextInt ();
        if (num1 >25 && num2 >25)
        System.out.println("Ambos números son mayores a 25");
        else if (num1 >25 || num2 >25)  
            System.out.println("Al menos uno de los números es menor a 25.");
        else
            System.out.println("Ninguno de los números es mayor a 25. ");
    }
    
}
