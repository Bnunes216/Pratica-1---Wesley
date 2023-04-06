package aumento;
import java.util.Scanner;

public class Aumento {

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
		Scanner input = new Scanner(System.in);
		    
		     double aumento, salario;
		     
		    System.out.print("Forneça o salário: ");
		    salario = input.nextDouble();
		    
		    aumento = salario * 0.25 + salario;
		    System.out.print("Valor pos aumento: " + aumento);
	}
}
