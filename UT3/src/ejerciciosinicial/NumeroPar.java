package ejerciciosinicial;

import java.util.Scanner;

public class NumeroPar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame un número: ");
		 int numero = teclado.nextInt();
		 
		 if(numero %2 == 0){
			System.out.printf("El número %d es par", numero);
			//Es lo mismo que poner System.out.print("El número: " + número + "es par");
			//La expresion printf quiere decir que el número es entero.
			
		 }
						
			else{
			System.out.printf("El número %d es impar",  numero);
			
			}
			
			
			}
				
	
		
	
		

	}


