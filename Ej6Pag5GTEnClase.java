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
public class Ej6Pag5GTEnClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("coloque dos numeros enteros");
        int Nuno = leer.nextInt ();
        int Ndos = leer.nextInt ();
        if (Nuno < 25) {
            System.out.println ("el primer numero que ingresaste es menor a 25");
            if ( Ndos < 25){
                System.out.println("el segundo numero ingresado es menor a 25");
                }else {
                System.out.println("el segundo numero ingresado es mayor a 25 :c");
            }
        } else {
            System.out.println("el primer numero ingresado es mayor a 25");
        }

    }
    
}
