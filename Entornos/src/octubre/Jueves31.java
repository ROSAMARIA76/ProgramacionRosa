package octubre;

import java.util.Scanner;

public class Jueves31 {

	// Dados tres números enteros escribir el mayor y el menor de ellos.
	//Algoritmo
	//Obtener los tres numeros: a, b, y c. Diferentes.
	//si a es mayor o igual que b y c entonces
	//escribir el mayor es a
	//sino si b es mayor o igual que c entonces 
	//escribir el mayor es b 
	//sino 
	//escribir el mayor es c
	//a = 10; b = 4; c = 1
	
	//Metodo para generar numeros aleatorios.
	public static int random(int base, int rango){
		int sol = 0;
		sol = (int)(Math.random()* rango + base);
		return sol;
								
	}

	public static void main(String[] args) {
		
		//Declaración de las variables u objetos que aparecen en el programa.
		
		int a = 0;
		int b = 0;
		int c = 0;
		//final int BASE = 0; //Variable que tiene un valor y no va a cambiar,  va a ser constante, genera numeros enteros.
		//final int RANGO =2;//Variable que tiene un valor y no va a cambiar,  va a ser constante, genera numeros enteros.
			
		//Genero los números.
		/*double d  = Math.random();
		int n1 = (int)(d * RANGO);
		int n2 = n1 + BASE;
		System.out.println(d + " " + n1 + " " + n2);*/
		
		//a = (int)(Math.random() * RANGO + BASE);
		//b = (int)(Math.random() * RANGO + BASE);
		//c = (int)(Math.random() * RANGO + BASE);
		
		a = Jueves31.random(1, 3);
		b = Jueves31.random(1, 3);
		c = Jueves31.random(1, 3);
		
		//Mostrar los valores que ha generado
		System.out.println(" a: " + a + " b: " + b + " c: "+ c);
		
		//Buscar el numero mayor 
		//Si a es mayor que ....y .....
		if(a >=b && a >= c){
		
		//Escribimos
		System.out.println("El mayor es: " + a);
		//sino
		}else if(b >=c){;
		System.out.println("El mayor es: " + b);
		}else{
		System.out.println("El mayor es: " + c);
		
		}
		
		
		}
		
	}
				
		
		//Contador, repite lo que hay dentro de las llaves, en este caso 10 veces
			/*for(int i = 0; i < 10; ++i){
			System.out.println(Jueves31.random(1,10));
			
			}*/
			
			
		
		
		
		
		
		
		

	


