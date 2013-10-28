package ejercicios;

import java.util.Scanner;

/** Calculen el per�metro y �rea de un rect�ngulo dada su base y su altura.
 * Calculen el per�metro y �rea de un c�rculo dado su radio. 
 * Calculen el volumen de una esfera dado su radio.
 * Calculen el �rea de un rect�ngulo (alineado con dos ejes x e y) dadas sus coordenadas x1,x2,y1,y2.
 * Dados los catetos de un tri�ngulo rect�ngulo, calcular su hipotenusa.
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
		
		teclado.close(); //cerramos introducci�n de datos.
		
		volumen = (4 * Math.PI * Math.pow(radio,3)) / 3 ; // volumen de la circunferencia
		
		System.out.println("--------RESULTADOS-------");//imprime cabecera "Resultados"
				      
	    System.out.println( "Volumen: " + Math.round(volumen*100)/100.0);
	     
		}

	}

	
