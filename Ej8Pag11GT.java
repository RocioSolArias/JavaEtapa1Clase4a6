/*
Escriba un programa que valide si una nota está entre 0 y 10, 
sino está entre 0 y 10 la nota se pedirá de nuevo 
hasta que la nota sea correcta.

 */
package clase4.pkg5.pkg6.guia3;

import java.util.Scanner;

/**
 *
 * @author Rocio
 */
public class Ej8Pag11GT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
  	 
   	int nota;
        
        System.out.println("Ingrese una nota: ");
        nota = leer.nextInt();
        
        while ((nota < 0) || (nota > 10)) {
      	 
    	System.out.println("Ingrese la nota nuevamente: ");
    	nota = leer.nextInt();
   	}                     
        
        System.out.println("La nota ingresada esta dentro los parametros: "+ nota);
    } 
    }