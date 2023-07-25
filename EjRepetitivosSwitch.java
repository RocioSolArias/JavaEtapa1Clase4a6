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
public class EjRepetitivosSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Nos interesa que el usuario ingrese un numero y muestre el
        // equivalente en numero romano
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();

        switch (numero) {
            case 1:
                System.out.println("En romano es I");
                break;
            case 2:
                System.out.println("En romano es II");
                break;
            case 3:
                System.out.println("En romano es III");
                break;
            case 4:
                System.out.println("En romano es IV");
                break;
            case 5:
                System.out.println("En romano es V");
                break;
            default:
                System.out.println("El numero ingresado no está todavia en nuestro programa");
        }

    }

}
