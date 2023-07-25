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
public class EjVideoEncuestaCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Clasifique la pelicula de 1 a 5 estrellas: ");
        opinion = leer.nextInt();
        
        if (opinion >= 1 && opinion <= 5) {
            switch (opinion) {
                case 1:

                    break;
                case 2:
                    System.out.println("Nos sentimos apenados que no hayas disfrutado la pelicula");
                    break;
                case 3:
                    System.out.println("Has calificado la pelicula como buena");
                    break;
                case 4:
                    System.out.println("Has calificado la pelicula como muy buena");
                    break;
                case 5:
                    System.out.println("Fantastico que haya disfrutado un excelente entretenimiento");
                    break;
                // El equivalente al caso del "De Otro Modo"
                // es default:
                // <sentencias3>
            }   
        } else if (opinion < 0) {
            System.out.println("¿Una opinion negativa? ¿Tan mala fue la pelicula? :(");
        } else if (opinion == 0) {
            System.out.println("El valor:" + opinion + " no es válido y no se tomara en cuenta :(");
        } else {
            System.out.println("Woo, se te fue la mano con la calificación ");
        }
        System.out.println("Hasta la próxima!");
    }

}
