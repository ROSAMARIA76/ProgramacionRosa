package ejerciciosinicial;

import java.util.Scanner;

public class DiaLaborable {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		//Pedir el dia
		
		int numero_dia;
		String letra_dia=" ";
		
		System.out.print("Dame el d�a de la semana (en n�mero): ");
		
		 numero_dia = teclado.nextInt();
		 switch (numero_dia){
		 case 1:
		 case 2:
		 case 3:
		 case 4:
		 case 5:
			 
			 System.out.println("D�a laborable");
			 break; //Para salir del bucle o de la secuencia
			 
		 case 6:
		 case 7:
			 
			 System.out.println("D�a festivo");
			 
			 
		 
		 }

		
		
		
		
		

	}

}
