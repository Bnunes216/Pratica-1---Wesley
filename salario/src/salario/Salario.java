package salario;
import java.util.Scanner;
public class Salario {

	private int salario;
	private int quantidade;
		
	public double getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}




	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int salario, quantidade;
    
    System.out.print("Informe o salario: ");
    salario = input.nextInt();
    
    quantidade = salario / 1320;
    System.out.print("Você recebe: " + quantidade + " salarios minimos");
	}

}
