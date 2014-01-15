package fi.softala.jee.demo.d12;

public class Rengas implements Jalka {
	
	int numero;	
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String toString() {
		return "R"+numero;
	}
}
