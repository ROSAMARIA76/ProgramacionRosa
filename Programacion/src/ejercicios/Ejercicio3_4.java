package ejercicios;

import java.util.Scanner;

/** Calculen el per�metro y �rea de un rect�ngulo dada su base y su altura.
 * Calculen el per�metro y �rea de un c�rculo dado su radio. 
 * Calculen el volumen de una esfera dado su radio.
 * Calculen el �rea de un rect�ngulo (alineado con dos ejes x e y) dadas sus coordenadas x1,x2,y1,y2.
 * Dados los catetos de un tri�ngulo rect�ngulo, calcular su hipotenusa.
  */

public class Ejercicio3_4 {
//CALCULAR EL AREA DE UN RECTANGULO (ALINEADO CON DOS EJES).
	
	public static void main(String[] args) {
		
		int x1, x2, y1, y2,
		�rea;  //declaraci�n de variables enteras
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca la abscisa X1: ");//petici�n de x1
		x1= teclado.nextInt();//asignaci�n de lectura de teclado a x1petici�n de x1
		
		System.out.print("Introduzca la abscisa X2 (mayor que X1): ");//petici�n de x2
		x2= teclado.nextInt();//asignaci�n de lectura de teclado a x2
		
		System.out.print("Introduzca la ordenada Y1: ");//petici�n de y1
		y1= teclado.nextInt();//asignaci�n de lectura de teclado a y1
		
		System.out.print( "Introduzca la ordenada Y2 (mayor que Y1): "); //petici�n de y2
		y2 = teclado.nextInt(); //asignaci�n de lectura de teclado a y2
 
		teclado.close(); //cerramos entradas por teclado.
 
		�rea = ( x2 - x1 ) * ( y2 - y1 ); //asignamos el resultado de la operaci�n a area
 
		System.out.println( "------RESULTADOS------"); //impresi�n de cabecera "Resultados"
 
		System.out.println( "�rea: " + �rea ); //imprime area
}
				

	}

