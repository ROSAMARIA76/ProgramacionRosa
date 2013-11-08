package noviembre;

import octubre.Jueves31;

public class Jueves7b {
	/*Generar tres numeros enteros entre 1 y 5 que sean distintos entre si.
	 * generar a
	 * repetir
	 * generar b
	 * hasta que b sea distinto de a
	 * repetir
	 * generar c
	 * hasta que c sea distinto de a y b
	 * 
	 */

	public static void main(String[] args) {
		// Declarar las variables
		int a = 0;
		int b = 0;
		int c = 0;
		final int base = 1; //Es una constante no se puede cambiar su valor.
		final int rango = 4;  //Es una constante no se puede cambiar su valor.
		
		//Implementar el código
 		a=Jueves31.random(base, rango);
 		
 		//Esto significa do while = hacer mietras que
  		do{
  			System.out.println(a +  " " +( b = Jueves31.random (base, rango)));
 			
 		}while(b == a);
 		
 		do{
 			c= Jueves31.random(base, rango);
 			System.out.println(a +  " " + b + " " + c);
 		}while(c == a || c == b);
 		
 		//Imprimir los números
 				
 		System.out.println(a +  " " + b + " " + c);
 		
	}
	


}


 		
 			
 	
		


