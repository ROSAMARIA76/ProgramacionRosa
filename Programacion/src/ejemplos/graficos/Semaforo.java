package ejemplos.graficos;

import graphics.Color;
import graphics.Rectangle;
import graphics.Ellipse;

public class Semaforo {

	public static void main(String[] args) {
		
		Rectangle caja, palo;
		Ellipse verde, ambar, rojo;
		
		caja= new Rectangle(10,10,60,110);
		//el número sesenta se corresponde con la distancia que hay del borde al objeto.
		caja.draw(); //dibujar caja.
		
		palo= new Rectangle(30, 120, 5, 100);
		caja.fill();//Lo dibuja relleno
		
		palo.fill();
		
		verde= new Ellipse(35,80,20,20);
		Color color_verde= new Color(0,200,0);
		verde.setColor(color_verde);
		//verde.setColor(new Color.GREEN);
		ambar= new Ellipse(35,55,20,20);
		ambar.setColor (new Color(255,255,0));
		rojo= new Ellipse(45,40,20,20);
		rojo.setColor (new Color(255,255,0));
		
		
		verde.draw();
		verde.fill();
		ambar.draw();
		ambar.fill();
		rojo.draw();
		rojo.fill();
		
				
		

	}

}
