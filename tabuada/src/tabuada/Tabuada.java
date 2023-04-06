package tabuada;
import java.util.Scanner;
public class Tabuada {

	private int numero;
	private int calculo;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCalculo() {
		return calculo;
	}
	public void setCalculo(int calculo) {
		this.calculo = calculo;
	}
	

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	   
	    int numero, tab0, tab1, tab2, tab3, tab4, tab5, tab6, tab7, tab8, tab9, tab10; 
	
	System.out.print("Digite o digito: ");
	numero = input.nextInt();
	
	tab0 = numero*0;
	tab1 = numero*1;
	tab2 = numero*2;
	tab3 = numero*3;
	tab4 = numero*4;
	tab5 = numero*5;
	tab6 = numero*6;
	tab7 = numero*7;
	tab8 = numero*8;
	tab9 = numero*9;
	tab10 = numero*10;
    System.out.println("O resultado é: " + "\n" + numero + " x 0 = " + tab0 + "\n" + numero + " x 1 = " + tab1 + "\n" + numero + " x 2 = " + tab2 + "\n" + numero + " x 3 = " + tab3 + "\n" + numero + " x 4 = " + tab4 + "\n" + numero + " x 5 = " + tab5 + "\n" + numero + " x 6 = " + tab6 + "\n" + numero + " x 7 = " + tab7 + "\n" + numero + " x 8 = " + tab8 + "\n" + numero + " x 9 = " + tab9 + "\n" + numero + " x 10 = " + tab10);

	}
	
}
