package ejemplos.graficos;

import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;

public class SemaforoCalculos {

	public static void main(String[] args) {
		Rectangle caja,palo;
		Ellipse verde,ambar,rojo;
		int ancho, alto, centro_x, centro_y, diametro_disco;
		
		//Inicializamos los valores de dibujo del semaforo
		ancho= 100;
		alto= 300;
		centro_x=300;
		centro_y=300;
		diametro_disco= ancho/2;
						
		caja = new Rectangle(centro_x-ancho/2, centro_y-alto/2, ancho,alto);
		caja.draw();
		caja.fill();
		
		palo = new Rectangle(centro_x-ancho/10, centro_y+alto/2, ancho/5, alto*2);
		palo.draw();
		
		palo.fill();
		
		rojo= new Ellipse(centro_x- diametro_disco/2, centro_y-90, diametro_disco, diametro_disco);
		ambar= new Ellipse(centro_x- diametro_disco/2, centro_y-50, diametro_disco, diametro_disco);
		verde= new Ellipse(centro_x- diametro_disco/2, centro_y+50, diametro_disco, diametro_disco);
		
		rojo.setColor(Color.RED);
		ambar.setColor(Color.ORANGE);
		verde.setColor(Color.GREEN);	
		
		verde.fill();
		ambar.fill();
		rojo.fill();
	}

}
