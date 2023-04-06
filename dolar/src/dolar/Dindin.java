package dolar;
import javax.swing.JOptionPane;
public class Dindin {

	private double dolar;
	private double valor;
	private double conversao;
	public double getDolar() {
		return dolar;
	}
	public void setDolar(double dolar) {
		this.dolar = dolar;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getConversao() {
		return conversao;
	}
	public void setConversao(double conversao) {
		this.conversao = conversao;
	}
	
	
	public static void main(String[] args) {
		String entrada;
		    double dolar, conversao;
		    
		    entrada = JOptionPane.showInputDialog("Informe o valor em dolar: ");
		    dolar = Integer.parseInt(entrada);
		    
		    conversao = dolar * 5.06;
		    JOptionPane.showMessageDialog(null,"Seu valor em reais é de: " + conversao);
	
		    
		    
		    
		    
	}
}
