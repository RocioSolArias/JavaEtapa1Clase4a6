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
public class EjRepetitivosDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        /*
         Teniendo en cuenta que la clave es “eureka”, 
         escribir un programa que nos pida ingresar una clave. 
         Sólo se cuenta con 3 intentos para acertar, 
         si fallamos los 3 intentos se deberá mostrar un mensaje indicándonos 
         que hemos agotado esos 3 intentos.  
         Si acertamos la clave se deberá mostrar un mensaje que indique 
         que se ha ingresado al sistema correctamente.
         */
        
        Scanner scan = new Scanner(System.in);

        int codigo;
        int password;

        do {

            System.out.println("Ingrese su codigo");
            codigo = scan.nextInt();
            System.out.println("Ingrese su contraseña");
            password = scan.nextInt();

            if (codigo != 1024 || password != 4567) {
                System.out.println("Su código o contraseña no es correcta");
            }

        } while (codigo != 1024 || password != 4567);

        System.out.println("Codigo y contraseña correcta!!");

    }

}
    
