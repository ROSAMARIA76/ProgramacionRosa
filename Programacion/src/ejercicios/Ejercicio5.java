package ejercicios;

import java.util.Scanner;

/* Crea un programa que pida el tama�o de un archivo (Mbytes) y la velocidad de una 
 * l�nea de datos (Mbps), y muestre el tiempo que tardar� en transmitirlo usando dicha 
 * l�nea. 
 */

public class Ejercicio5 {

	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);//Creamos objeto del teclado para introducci�n de datos.
			
		 	double tama�o, velocidad;	
			
			
			System.out.print("Escribe el tama�o del archivo en Mbytes: ");
			tama�o = teclado.nextDouble(); //nextDouble por la variable
			
			System.out.print("Escribe la velocidad de la linea de datos del ordenador en Mbps: ");
			velocidad = teclado.nextDouble(); // nextDouble por la variable
			
			tama�o = tama�o * 1024 * 1024 * 8 ; // = tama�o * Math.pow(2,20) * 8
			velocidad = velocidad * 1000000;
					
			System.out.print("Datos: "+ tama�o + " bits");
			System.out.print("\nVelocidad: "+ velocidad + " bps");// \n para poner un intro
			System.out.print("\nTiempo para transmitir: "+ tama�o/velocidad + " segundos"); //\ para introducir un intro
			teclado.close();		
		}
	
	}

