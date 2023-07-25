/*
Escriba un programa que lea 20 números. 
Si el número leído es igual a cero se debe salir del bucle y
mostrar el mensaje "Se capturó el numero cero".  
El programa deberá calcular y mostrar el resultado de la suma de los números leídos,
pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.

 */
package clase4.pkg5.pkg6.guia3;

import java.util.Scanner;

/**
 *
 * @author Rocio
 */
public class Ej9Pag14GT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        int suma = 0;
       
        for (int i = 0; i < 20; i++) {

        do 
        { 
        System.out.println("Ingrese un número: ");
    	num = leer.nextInt();
        
        if (num > 0) { 

        suma = suma+num;
        } else {
        System.out.println("Ingresaste un numero negativo: ");
        break;}
            
        
        } while (num != 0);
        System.out.println("Se capturó el número cero");
        System.out.println("La suma de todos los números es:"+ suma);
        break;
        }
        }
        }

