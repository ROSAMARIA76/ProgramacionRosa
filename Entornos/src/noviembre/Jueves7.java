package noviembre;

public class Jueves7 {
	/*Las Iteraciones o Bucles (Repeticiones)
	 * Repetici�n de un fragmento de c�digo desde 0 hasta infinitas veces.
	 * Esta estructura est� condicionada por una expresi�n l�gica y esta expresi�n
	 * puede estar determinada o ser indeterminada.
	 * Escribir un mensaje de saludo un n�mero finito de veces (10).
	 * veces= 10
	 * mientras no haya terminado de escribir los mensajes ( veces sea mayor que 0) hacer 
	 * escribir mensaje de saludo  
	 * contar que ya he escrito un mensaje m�s (decremento en el valor de veces)
	 * finmientras
	 */

	public static void main(String[] args) {

		//declarar las variables
		//int veces = 10;
		
		//implimentaci�n
		/*while(veces-- > 0){
		//while = mientras
			
			//imprimir mensaje
			System.out.println("Hola Mundo");
			
			//Asignamos un valor, se puede hacer de las tres formas que indicamos:
			//veces  = veces -1;
			//veces--; //Hace la misma funci�n que lo anterior
			//--veces;//Hace la misma funci�n que lo anterior
			 			
						
		for(int i = 0 ; i < 10; ++i){//i = veces
			//for = para; ++veces = incrementa en uno
			System.out.println("Hola Mundo");
				
		int i = 0;
		i = 0;
		while (i < 10){
			System.out.println("Hola Mundo");
			++i;
			 }*/
		//No es ortodoxo pero funciona
		int i = 0;
		while (true){
			System.out.println("Hola Mundo");
			++i;
			if(i == 10){
				
				break;//Saca fuera del while
			}
			System.out.println("Seguimos, adelante");
		
		}
		}

}

	

