package ejerciciosinicial;

import java.util.Scanner;

public class Menor {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		//Pdir de los numeros
		
		int numero1, numero2, numero3;
		
		System.out.print("Dame tres números: ");
		 numero1 = teclado.nextInt();
		 numero2 = teclado.nextInt();
		 numero3 = teclado.nextInt();
		 
		 
		 if(numero1 <numero2 && numero1 <numero3){
		 System.out.println("Número menor: " + numero1);
		 } else if (numero2<numero3){
		 System.out.println("Número menor: " + numero2);
		 }else
		 System.out.println("Número menor: " + numero3);
		 
		 
		 
		 /* if(numero1 <= numero2)
			   if(numero1 <= numero3)
			   System.out.println("Número menor: " + numero1);
			   else
			    System.out.println("Número menor: " + numero3);
			    }else
			    {
			    if(numero2 <= numero3)
			     System.out.println("Número menor: " + numero3);
			 
			 */
	}

}
