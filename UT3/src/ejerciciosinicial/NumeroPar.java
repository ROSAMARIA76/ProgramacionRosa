package ejerciciosinicial;

import java.util.Scanner;

public class NumeroPar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame un n�mero: ");
		 int numero = teclado.nextInt();
		 
		 if(numero %2 == 0){
			System.out.printf("El n�mero %d es par", numero);
			//Es lo mismo que poner System.out.print("El n�mero: " + n�mero + "es par");
			//La expresion printf quiere decir que el n�mero es entero.
			
		 }
						
			else{
			System.out.printf("El n�mero %d es impar",  numero);
			
			}
			
			
			}
				
	
		
	
		

	}


