package ejerciciosinicial;

import java.util.Scanner;

public class NumeroMayor {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		//Pdir de los numeros
		
		int numero1, numero2;
		
		System.out.print("Dame dos n�meros: ");
		 numero1 = teclado.nextInt();
		 numero2 = teclado.nextInt();
		 
		 if(numero1 >= numero2){
		 System.out.print("El n�mero mayor es: " + numero1);
		 }
		 else{
		 System.out.print("El n�mero mayor es: " + numero2);
		 
		 /* OTRA FORMA DE HACERLO.
		  *  if (numero1 > numero2{
			  System.out.print("El n�mero mayor es: " + numero1);
		 }
		 else if (numero1 == numero2){
		 System.out.print("Los numeros son iguales");
		 	
		 }
			else
			{
			  System.out.print("El n�mero mayor es: " + numero2);
			  		 }
			  		 */
		 }
	}

	}
