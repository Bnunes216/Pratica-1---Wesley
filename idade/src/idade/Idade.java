package idade;
import java.util.Scanner;

//variables
public class Idade {

	private int anonasc;
	private int anoatual;
	private int ano2050;
	private int idade;
	
	public int getAnonasc() {
		return anonasc;
	}

	public void setAnonasc(int anonasc) {
		this.anonasc = anonasc;
	}
	public int getAnoatual() {
		return anoatual;
	}

	public void setAnoatual(int anoatual) {
		this.anoatual = anoatual;
	}

	public int getAno2050() {
		return ano2050;
	}

	public void setAno2050(int ano2050) {
		this.ano2050 = ano2050;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

    public int calculaidade() {
    	idade = ano2050 - anoatual;
    	return idade;
    }

    //main
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int anonasc, anoatual, ano2050, idade;
    
    System.out.print("Ano de nascimento: ");
    anonasc = input.nextInt();
    
    System.out.print("Ano atual: ");
    anoatual = input.nextInt();
    
    idade = anoatual - anonasc;
    System.out.println("Sua idade atual é: " + idade + " anos");
    
    ano2050 = 2050 - anonasc;
    System.out.println("Sua idade em 2050 sera: " + ano2050 + " anos");
    
    
	}

}
