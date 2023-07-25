/*
 Realizar un programa que lea 4 números 
(comprendidos entre 1 y 20) e 
imprima el número ingresado seguido de tantos asteriscos como indique su valor. 
Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package clase4.pkg5.pkg6.guia3;

import java.util.Scanner;

/**
 *
 * @author Rocio
 */
public class Ej10Pag17GT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int numeros;
        
       
        //int[] numeros = new int[4];
        /*for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese el número " + (i+1) + " entre 1 y 20: ");
            numeros[i] = sc.nextInt();
            while (numeros[i] < 1 || numeros[i] > 20) {
                System.out.print("El número ingresado está fuera del rango. Ingrese un número entre 1 y 20: ");
                numeros[i] = sc.nextInt();
        }
        }
        
        for (int i = 0; i < 4; i++) {
            System.out.print(numeros[i] + " ");
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*");
            }
            System.out.println();*/
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese un número entero: ");
            numeros = leer.nextInt();
            if (numeros < 0 || numeros > 20) {
                System.out.println("El número ingresado está fuera del rango. Ingrese un número entre 1 y 20: ");
                continue;
            }

        for (int j = 0; j < numeros;j++) {
                System.out.print("*");
            }
            System.out.println();
    }
    }
    }