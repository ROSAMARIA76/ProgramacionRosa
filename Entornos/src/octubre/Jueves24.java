package octubre;

public class Jueves24 {

	public static void main(String[] args) {
				//Operadores
				//Operadores aritmeticos: Realizan operaciones con variables o valores de tipo numerico. 
				//El resultado es un valor de tipo numerico.
				//Siempre del tipo mñas alto en la escala: int, long y double.
				//Los operadores son: binarios(+,-,*,/,%) y los monarios(-,++ (incrementa en 1),
				//-- (decrementa en 1), += (incrementa una variable en el valor que le ponemos a la derecha)
				//-= (decrementa una variable en el valor que le ponemos a la derecha),*= a *=2, a=a*2, 
				//   /=, %=a %=2. La potencia, raiz etc son metodos de una clase de utilidades.
			
				//Declaracion de variables.
				int a = 0;
				int b = 0;
				int c = 0;
				double d = 0.0;
				
				//Asignación de valores.
				a= 3;
				b= (2*5) + (3/2);
				c= b/a;
				c=(int) Math.sqrt(a); 
				//Raiz cuadrada.
				//int se llama cast de tipos o fuerza la conversión de un tipo en otro, 
				//a que sea un entero el el resultado de la raiz.
				d= a % b;
				
				System.out.println("a: "+ a + " b: "+ b +" b/ a = " +  c +" d =" + d);
				
				//La clase Math contiene metodos aritmeticos para uso general.
				long l = 0; //Son numeros enteros mas largos.
				short s = 0; //Son enteros pequeños, llega aproximadamente hasta 10.000.
				
				//Precedencias de los operadores: 1º *, 2º /, 3º % y luego +, -
				c=  (2+5) * 3; // 2 5 + 3* = 7 3* Esta operación la realiza el compilador =  (2 +5) *3
				
				//Operadores lógicos: producen un resultado booleano o lógico. (true, false)
				//sirven para hacer comparaciones.
				//Operadores: >, >=, <, <=, ==, !=(distinto), se utilizan con valores numericos, de 
				//tipo logico...
				//Las cadenas no se comparan con estos operadores.
				
				String mensaje = "Hola, Mundo";
				mensaje.compareTo("Hola, Mundo");
				int n = mensaje.compareTo("hola, Mundo");
				//Si son iguales tiene que aparecer cero
											
				System.out.println(n); 
				
									
				//Para saber si son  iguales se utiliza boolean
						
				String mensaje1 = "H";
				boolean m = mensaje1.equals("Hola Mundo");//esta funcion devuelve false o true
				
				boolean p = c ==a; //devuelve false o true dependiendo si c es igual a a o no
				System.out.println(n);
				m= c == a;
				System.out.println("c es igual a a" + n);
							
				int z = 0;
				
	}
	
}
				
			
			
	
				
				
			      
				
				
				
				
				
				
				
				
			
				
				