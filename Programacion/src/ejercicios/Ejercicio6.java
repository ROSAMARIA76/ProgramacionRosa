package ejercicios;

import java.util.Scanner;

/*Indica cual es el resultado de las siguientes expresiones y más tarde
 * comprueba en Java los resultados. 
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		
		//((4-2)*(5+1)/2))>2-(4+3)
		System.out.println("uno: El resultado es: " + (((4-2)*(5+1)/2)>2-(4+3)));
		
		//(6+3)>8 && (6-1)2 < 8||23==8;
		System.out.println("dos: El resultado es: " + ((6+3)>(8&&((6-1)2))<(8||23==8));
		

	}
	
}

