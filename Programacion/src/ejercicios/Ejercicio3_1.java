package ejercicios;

import java.util.Scanner;

/* Calculen el per�metro y �rea de un rect�ngulo dada su base y su altura.
 * Calculen el per�metro y �rea de un c�rculo dado su radio. 
 * Calculen el volumen de una esfera dado su radio.
 * Calculen el �rea de un rect�ngulo (alineado con dos ejes x e y) dadas sus coordenadas x1,x2,y1,y2.
 * Dados los catetos de un tri�ngulo rect�ngulo, calcular su hipotenusa.
 * 
 */

public class Ejercicio3_1 {
	//CALCULAR EL PERIMETRO Y AREA DE UN RECTANGULO DADA SU BASE Y ALTURA.
	
public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);//Creamos objeto del teclado para introducci�n de datos.
		
		double base,
			   altura,
			   per�metro,
			   �rea;//Declaraci�n de variables enteras.
		
		System.out.print("--C�lculo del per�metro y �rea (en cm)--");		
		System.out.print("Introduzca la BASE del rect�ngulo (n�mero positivo)");//petici�n de base.
		
		base = teclado.nextDouble();//asignaci�n de lectura de teclado a base.
				
		System.out.print("Introduzca la ALTURA del rect�ngulo (n�mero positivo: ");//petici�n de altura.
		altura = teclado.nextDouble();//asignaci�n de lectura de teclado a altura.
		
		teclado.close();//cerramos entradas por teclado.
		
		per�metro= 2 *base + 2* altura;//asignaci�n del resultado de la operaci�n a per�metro.
		�rea= base * altura; //asignaci�n del resultado de la operaci�n de �rea.
		
		
		System.out.println ("-----------RESULTADOS-----------");
		
		System.out.println ("Per�metro:" + per�metro + " cm");//imprime per�metro.
		System.out.println ("�rea:" + �rea + " cm2");//imprime �rea.
				   
	
	}

}


