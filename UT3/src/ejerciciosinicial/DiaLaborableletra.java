package ejerciciosinicial;

import java.util.Scanner;


public class DiaLaborableletra {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Pedir el dia
		String dia;
		
			
		System.out.print("Dame el d�a de la semana (en n�mero): ");
		dia = teclado.nextLine();
		
				
		 switch (dia.toLowerCase()){//Lo pone en minusculas
		 case "lunes":
		 case "martes":
		 case "miercoles":
		 case "jueves":
		 case "viernes":
			 
			 System.out.println("D�a laborable");
			 break; //Para salir del bucle o de la secuencia
			 
		 case "sabado":
		 case "domingo":
			 
			 System.out.println("D�a festivo");
			 break;
			 			 
		 }
	}

}
