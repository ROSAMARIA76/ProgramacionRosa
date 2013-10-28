package ejercicios;

import java.util.Scanner;

/* Crear un programa que pida u peso en kilogramos y realice
 * la conversión a onzas, sabiendo que 1 kilogramo (kg) = 35.2739619 Onzas (oz)
 */

public class Ejercicio4 {

	public static void main(String[] args) {
									 
	    Scanner teclado = new Scanner(System.in);//Creamos objeto del teclado para introducción de datos.
		
	    
	    float peso = 0.0f; //la "f" que e puesto despues de poner .0 es para decirle que es un float, sino asumirá que es un double
        final float onzas_por_kilo = 35.2739619f;
        float onzas;
        
              
        System.out.println("Introduce tu peso en kilogramos: ");
        
        peso = teclado.nextFloat();
        onzas = (peso * onzas_por_kilo);
        
        System.out.println("\n Tu peso en Onzas es: " + onzas + " onzas.");
        
        teclado.close(); //libera el recurso
	    
	   
	}
	
	}




	