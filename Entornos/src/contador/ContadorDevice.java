package contador;

import java.io.*;

public class ContadorDevice{
	
	//Atributos 
	private int valorActual; 
	private int valorInicial;
	
	//Constructores
	public ContadorDevice(){
		this.valorActual=0;
		this.valorInicial=0;
	}
	public ContadorDevice(int valorActual){
		this.valorActual=valorActual;
		this.valorInicial=0;
	}
	
	public ContadorDevice(int valorActual, int valorInicial){
		this.valorActual=valorActual;
		this.valorInicial=valorInicial;
	}
	
	//Accesadores
	public int getValorActual() {
		return valorActual;
	}
	public void setValorActual(int valorActual) {
		this.valorActual = valorActual;
	}
	public int getValorInicial() {
		return valorInicial;
	}
	public void setValorInicial(int valorInicial) {
		this.valorInicial = valorInicial;
	}
	
	//Servicios
	public String toString(){
		String mensaje = "";
		mensaje += this.valorActual;
		return mensaje;
	}
	
	public void incrementar(){
		this.valorActual = this.valorActual + 1;
	}
	public void decrementar(){
		this.valorActual = this.valorActual - 1;
	}
	public void resetear (){
		this.valorActual = this.valorInicial;
	}
	
	public static void main(String[] args) {
		//Instanciar el objeto de la clase.
		ContadorDevice contador = new ContadorDevice(5,2);
		contador.setValorActual(5);
		contador.incrementar();
		contador.incrementar();
		System.out.println(contador.getValorActual());
		contador.decrementar();
		System.out.println(contador.toString());
		contador.resetear();
		System.out.println(contador.toString());
		
			}
	

	}

