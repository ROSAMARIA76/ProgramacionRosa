package octubre;

public class Martes29 {

	public static void main(String[] args) {
		//Operadores booleanos.Operan sobre expresiones lógicas. 
		
		boolean resultado = ((2*3) ==6); //El igual es asignar
		
		//System.out.println(resultado);//Imprimir el resultado
		
		if(resultado == true){ //if =Si
			System.out.println("Son iguales"); 
			
		}else{ //sino
			System.out.println("No son iguales"); 
					
		}

		//Operadores específicos de valores lógicos
		//No (!) es un operador monario.
		//Y (&&) es un operador binario. Cuando las dos son verdaderas el resultado es 
		//true en cualquier otro caso es false.
		
		if(3>2 && 2<4){
			System.out.println("Cierto");
			
		}else{ //sino
			
			System.out.println("Falso");
					}
		//O (||) es un operador binario. Cuando las dos son falsas el resultado es falso. 
		//En cualquier otro caso el resultado es cierto.
		
		if(3<2 || 2>4){
			System.out.println("Cierto");
		}else{
			System.out.println("Falso");
			
		}
		
		//Dados dos numeros enteros escribir el mayor.
		//Declaramos las variables
		int a = 0;
		int b = 0;

		//Asignamos los valores. Random genera un numero entre cero y pico
		System.out.println(Math.random());
		 a = (int)(Math.random()*10+1);
		 b = (int)(Math.random()*10+1);
		 
		 //Ver cual es el mayor
		 if(a > b){
			 System.out.println("El mayor es: " + a);
		 }else if (b>a){
			 System.out.println("El mayor es: " + b);
		 }else{
			 System.out.println("Son iguales: " + a);
		 }
			 
			 System.out.println(a + " " + b);
			 
	}
	
}
			 
	
		
		
		
		
