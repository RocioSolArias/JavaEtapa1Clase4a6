/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4.pkg5.pkg6.guia3;

/**
 *
 * @author Rocio
 */
public class EjRepetitivosFor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 // Realizar un programa que muestre la cantidad de números 
        // que son múltiplos de 2 o de 3 comprendidos entre 1 y 100. 
        
        int cont2 = 0;
        int cont3 = 0;

        for (int i = 0; i < 100; i++) {

            if (i % 2 == 0) {
                cont2 = cont2 + 1;
            }
            if (i % 3 == 0) {
                cont3 = cont3 + 1;
            }

        }

        System.out.println("La cantidad de multiplos de 2 : " + cont2);
        System.out.println("La cantidad de multiplos de 3 : " + cont3);

    }

}
