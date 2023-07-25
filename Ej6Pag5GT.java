/*
 Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.
 */
package clase4.pkg5.pkg6.guia3;

import java.util.Scanner;

/**
 *
 * @author Rocio
 */
public class Ej6Pag5GT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.println("Ingrese un número: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro número: ");
        num2 = leer.nextInt();
        System.out.println("El primer número ingresado es: "+ num1);
        System.out.println("El segundo número ingresado es: "+ num2);
        
         if (num1 > 25) { 
    System.out.println("El primer número que ingresaste es mayor a 25"); 
    }else { 
    System.out.println("El primer número que ingresaste es menor a 25");
    }
         
         if (num2 > 25) { 
    System.out.println("El segundo número que ingresaste es mayor a 25"); 
    }else { 
    System.out.println("El segundo número que ingresaste es menor a 25");
    }
    }
    
}
