package ejercicios;

import java.util.Scanner;

/* Calculen el perímetro y área de un rectángulo dada su base y su altura.
 * Calculen el perímetro y área de un círculo dado su radio. 
 * Calculen el volumen de una esfera dado su radio.
 * Calculen el área de un rectángulo (alineado con dos ejes x e y) dadas sus coordenadas x1,x2,y1,y2.
 * Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
  */

public class Ejercicio3_5 {
	  //DADOS LOS CATETOS DE UN TRIANGULO RECTANGULO, CALCULAR SU HIPOTENUSA.

	public static void main(String[] args) {
		
		
		 int cateto1,
         cateto2; //declaración de variables enteras
		 double hipotenusa; //declaración de variable real
		 
		 Scanner teclado = new Scanner(System.in);
		                  
		 System.out.print( "Introduzca el primer CATETO (número entero positivo): "); //petición de cateto1
 
		 cateto1 = teclado.nextInt(); //asignación de lectura de teclado a cateto1
 
		 System.out.print( "Introduzca el segundo CATETO (número entero positivo): "); //petición de cateto2
 
		 cateto2 = teclado.nextInt(); //asignación de lectura de teclado a cateto2
 
		 teclado.close(); //cerramos introducción de datos por teclado
 
		 hipotenusa = Math.sqrt( cateto1 * cateto1 + cateto2 * cateto2); //asignamos resultado de la operación a hipotenusa
         
		 System.out.println( "------RESULTADOS------"); //imprime cabecera "Resultados"
 
		 System.out.println( "Hipotenusa: " + hipotenusa ); //imprime hipotenusa


	}

}
