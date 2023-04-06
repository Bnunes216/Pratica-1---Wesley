package raio;
import java.util.Scanner;
public class Raio {

	private double raio;
	private double comprimento;
	private double area;
	private double volume;
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}

	
	
	
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	   
	    double raio, comprimento, area, volume; 
	
	System.out.print("Digite o raio: ");
	raio = input.nextDouble();
	
	comprimento = 2 * 3.14 * raio;
	System.out.println("O comprimento da circunferencia é de: " + comprimento);
	
	area = 3.14 * (raio * raio);
	System.out.println("A area do circulo é de: " + area);
	
	volume = 0.75 * 3.14 * (raio*raio*raio);
	System.out.println("O valor do volume é de: " + volume);
	
	}
	
}
