package ejercicios;

import java.util.Scanner;

/* Calculen el per�metro y �rea de un rect�ngulo dada su base y su altura.
 * Calculen el per�metro y �rea de un c�rculo dado su radio. 
 * Calculen el volumen de una esfera dado su radio.
 * Calculen el �rea de un rect�ngulo (alineado con dos ejes x e y) dadas sus coordenadas x1,x2,y1,y2.
 * Dados los catetos de un tri�ngulo rect�ngulo, calcular su hipotenusa.
  */

public class Ejercicio3_5 {
	  //DADOS LOS CATETOS DE UN TRIANGULO RECTANGULO, CALCULAR SU HIPOTENUSA.

	public static void main(String[] args) {
		
		
		 int cateto1,
         cateto2; //declaraci�n de variables enteras
		 double hipotenusa; //declaraci�n de variable real
		 
		 Scanner teclado = new Scanner(System.in);
		                  
		 System.out.print( "Introduzca el primer CATETO (n�mero entero positivo): "); //petici�n de cateto1
 
		 cateto1 = teclado.nextInt(); //asignaci�n de lectura de teclado a cateto1
 
		 System.out.print( "Introduzca el segundo CATETO (n�mero entero positivo): "); //petici�n de cateto2
 
		 cateto2 = teclado.nextInt(); //asignaci�n de lectura de teclado a cateto2
 
		 teclado.close(); //cerramos introducci�n de datos por teclado
 
		 hipotenusa = Math.sqrt( cateto1 * cateto1 + cateto2 * cateto2); //asignamos resultado de la operaci�n a hipotenusa
         
		 System.out.println( "------RESULTADOS------"); //imprime cabecera "Resultados"
 
		 System.out.println( "Hipotenusa: " + hipotenusa ); //imprime hipotenusa


	}

}
