package aumento;
import javax.swing.JOptionPane;
public class Aum {

	private double salario;
	private double aumento;
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getAumento() {
		return aumento;
	}
	public void setAumento(double aumento) {
		this.aumento = aumento;
	}
	
	
	public static void main(String[] args) {
	String entrada;
	    double salario, aumento;
	    
	    entrada = JOptionPane.showInputDialog("Informe o seu salario: ");
	    salario = Integer.parseInt(entrada);

	    aumento = salario * 0.25 + salario;
	   JOptionPane.showMessageDialog(null, "Seu salario com aumento de 25% é de: " + aumento);
	
	
	}
}
