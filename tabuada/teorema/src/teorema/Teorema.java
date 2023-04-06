package teorema;
import java.util.Scanner;
public class Teorema {

	private int a;
	private int b;
	private int c;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	
	
	
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	   
	    int a,b,c,pitagoras; 
	
	System.out.print("Digite o 1° cateto: ");
	a = input.nextInt();
	
	System.out.print("Digite o 2° cateto: ");
	b = input.nextInt();
	
	System.out.print("Digite a hipotenusa: ");
	c = input.nextInt();
	
	pitagoras = c = (a * a) + (b * b);
	System.out.print("Seu teorema é: " + pitagoras);
	
	
	}
}
