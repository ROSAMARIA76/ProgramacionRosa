package ejercicios;

import java.util.Scanner;

 /* Calculen el perímetro y área de un rectángulo dada su base y su altura.
 * Calculen el perímetro y área de un círculo dado su radio. 
 * Calculen el volumen de una esfera dado su radio.
 * Calculen el área de un rectángulo (alineado con dos ejes x e y) dadas sus coordenadas x1,x2,y1,y2.
 * Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
 * 
 */

public class Ejercicio3_2 {
	//CALCULAR EL PERIMETRO Y AREA DE UN CIRCULO DADO SU RADIO.

	public static void main(String[] args) {
		
		int radio;//declaración de variable entera
		final double PI = Math.PI;//declaración y asignación de valor de constante PI
		double perímetro;
		double área;// declaración de variables reales.
		
		Scanner teclado = new Scanner(System.in); //declarar el scanner pero es necesario importarlo
				
			System.out.print("Introduzca el RADIO del circulo (numero entero positivo: "); //peticion de radio
						
			radio = teclado.nextInt(); //asignación de lectura de teclado a radio.
			teclado.close(); //cerramos introducción de datos por teclado
			
			perímetro = 2 * PI * radio; //asignamos resultado de la operación a perimetro
			área = PI * Math.pow(radio, 2); //asignamos resultado de la operación a area
			
			System.out.println( "------RESULTADOS------"); //imprime cabecera "Resultados"
			
			System.out.println("Perímetro: " + perímetro);//Imprime perimetro.
			System.out.println("Área : " + área);//Imprime area.
	
	
			}

}
