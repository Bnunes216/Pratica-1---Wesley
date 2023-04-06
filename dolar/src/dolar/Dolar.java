package dolar;
import java.util.Scanner;

public class Dolar {

	private double valor;
	private double dolar;
	private double conversao;
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getDolar() {
		return dolar;
	}
	public void setDolar(double dolar) {
		this.dolar = dolar;
	}
	public double getConversao() {
		return conversao;
	}
	public void setConversao(double conversao) {
		this.conversao = conversao;
	}
	
	
	//main
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
    
     double valor, dolar, conversao;
     
    System.out.print("Valor em dolar: ");
    dolar = input.nextDouble();
    
    conversao = dolar * 5.06;
    System.out.print("Valor em reais: " + conversao);

}
}