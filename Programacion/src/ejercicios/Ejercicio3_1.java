package ejercicios;

import java.util.Scanner;

/* Calculen el perímetro y área de un rectángulo dada su base y su altura.
 * Calculen el perímetro y área de un círculo dado su radio. 
 * Calculen el volumen de una esfera dado su radio.
 * Calculen el área de un rectángulo (alineado con dos ejes x e y) dadas sus coordenadas x1,x2,y1,y2.
 * Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
 * 
 */

public class Ejercicio3_1 {
	//CALCULAR EL PERIMETRO Y AREA DE UN RECTANGULO DADA SU BASE Y ALTURA.
	
public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);//Creamos objeto del teclado para introducción de datos.
		
		double base,
			   altura,
			   perímetro,
			   área;//Declaración de variables enteras.
		
		System.out.print("--Cálculo del perímetro y área (en cm)--");		
		System.out.print("Introduzca la BASE del rectángulo (número positivo)");//petición de base.
		
		base = teclado.nextDouble();//asignación de lectura de teclado a base.
				
		System.out.print("Introduzca la ALTURA del rectángulo (número positivo: ");//petición de altura.
		altura = teclado.nextDouble();//asignación de lectura de teclado a altura.
		
		teclado.close();//cerramos entradas por teclado.
		
		perímetro= 2 *base + 2* altura;//asignación del resultado de la operación a perímetro.
		área= base * altura; //asignación del resultado de la operación de área.
		
		
		System.out.println ("-----------RESULTADOS-----------");
		
		System.out.println ("Perímetro:" + perímetro + " cm");//imprime perímetro.
		System.out.println ("Área:" + área + " cm2");//imprime área.
				   
	
	}

}


