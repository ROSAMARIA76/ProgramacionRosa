package ejercicios;

import java.util.Scanner;

 /* Calculen el per�metro y �rea de un rect�ngulo dada su base y su altura.
 * Calculen el per�metro y �rea de un c�rculo dado su radio. 
 * Calculen el volumen de una esfera dado su radio.
 * Calculen el �rea de un rect�ngulo (alineado con dos ejes x e y) dadas sus coordenadas x1,x2,y1,y2.
 * Dados los catetos de un tri�ngulo rect�ngulo, calcular su hipotenusa.
 * 
 */

public class Ejercicio3_2 {
	//CALCULAR EL PERIMETRO Y AREA DE UN CIRCULO DADO SU RADIO.

	public static void main(String[] args) {
		
		int radio;//declaraci�n de variable entera
		final double PI = Math.PI;//declaraci�n y asignaci�n de valor de constante PI
		double per�metro;
		double �rea;// declaraci�n de variables reales.
		
		Scanner teclado = new Scanner(System.in); //declarar el scanner pero es necesario importarlo
				
			System.out.print("Introduzca el RADIO del circulo (numero entero positivo: "); //peticion de radio
						
			radio = teclado.nextInt(); //asignaci�n de lectura de teclado a radio.
			teclado.close(); //cerramos introducci�n de datos por teclado
			
			per�metro = 2 * PI * radio; //asignamos resultado de la operaci�n a perimetro
			�rea = PI * Math.pow(radio, 2); //asignamos resultado de la operaci�n a area
			
			System.out.println( "------RESULTADOS------"); //imprime cabecera "Resultados"
			
			System.out.println("Per�metro: " + per�metro);//Imprime perimetro.
			System.out.println("�rea : " + �rea);//Imprime area.
	
	
			}

}
