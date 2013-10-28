package ejercicios;

import java.util.Scanner;

/** Calculen el perímetro y área de un rectángulo dada su base y su altura.
 * Calculen el perímetro y área de un círculo dado su radio. 
 * Calculen el volumen de una esfera dado su radio.
 * Calculen el área de un rectángulo (alineado con dos ejes x e y) dadas sus coordenadas x1,x2,y1,y2.
 * Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
  */

public class Ejercicio3_3 {
	//CALCULAR EL VOLUMEN DE UNA ESFERA DADO SU RADIO.	

	public static void main(String[] args) {
		
		int radio;
		double volumen;
		//final double PI = Math.PI
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print ("Introduzca el RADIO de la esfera en (cm): ");
				
		radio = teclado.nextInt(); //asignacion de lectura de teclado a radio.		
		
		teclado.close(); //cerramos introducción de datos.
		
		volumen = (4 * Math.PI * Math.pow(radio,3)) / 3 ; // volumen de la circunferencia
		
		System.out.println("--------RESULTADOS-------");//imprime cabecera "Resultados"
				      
	    System.out.println( "Volumen: " + Math.round(volumen*100)/100.0);
	     
		}

	}

	
