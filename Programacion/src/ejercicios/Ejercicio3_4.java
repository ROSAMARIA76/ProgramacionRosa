package ejercicios;

import java.util.Scanner;

/** Calculen el perímetro y área de un rectángulo dada su base y su altura.
 * Calculen el perímetro y área de un círculo dado su radio. 
 * Calculen el volumen de una esfera dado su radio.
 * Calculen el área de un rectángulo (alineado con dos ejes x e y) dadas sus coordenadas x1,x2,y1,y2.
 * Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
  */

public class Ejercicio3_4 {
//CALCULAR EL AREA DE UN RECTANGULO (ALINEADO CON DOS EJES).
	
	public static void main(String[] args) {
		
		int x1, x2, y1, y2,
		área;  //declaración de variables enteras
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca la abscisa X1: ");//petición de x1
		x1= teclado.nextInt();//asignación de lectura de teclado a x1petición de x1
		
		System.out.print("Introduzca la abscisa X2 (mayor que X1): ");//petición de x2
		x2= teclado.nextInt();//asignación de lectura de teclado a x2
		
		System.out.print("Introduzca la ordenada Y1: ");//petición de y1
		y1= teclado.nextInt();//asignación de lectura de teclado a y1
		
		System.out.print( "Introduzca la ordenada Y2 (mayor que Y1): "); //petición de y2
		y2 = teclado.nextInt(); //asignación de lectura de teclado a y2
 
		teclado.close(); //cerramos entradas por teclado.
 
		área = ( x2 - x1 ) * ( y2 - y1 ); //asignamos el resultado de la operación a area
 
		System.out.println( "------RESULTADOS------"); //impresión de cabecera "Resultados"
 
		System.out.println( "Área: " + área ); //imprime area
}
				

	}

