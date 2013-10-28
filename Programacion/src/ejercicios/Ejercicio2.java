package ejercicios;

import java.util.Scanner; 

/*Ejercicio2.
 * Escribir un programa que pregunte al usuario dos números
 * y luego muestre la suma, el producto y la media de los 
 * dos números.  
 */
public class Ejercicio2 {
	
			public static void main(String[] args) {
			double numero1, numero2;
			
			Scanner teclado = new Scanner(System.in);
			
			System.out.println ("Dame dos números y calculare con ellos: ");			
			numero1 = teclado.nextDouble();
			numero2 = teclado.nextDouble();
												
			System.out.println ("Numero1 " + numero1);
			System.out.println ("Numero2 " + numero2);
			System.out.println ("La suma es " + (numero1+numero2));
			System.out.println ("El producto es " + (numero1 * numero2));
			System.out.println ("La media es " + (numero1+numero2)/2);
						
			teclado.close (); 
	}	
}
