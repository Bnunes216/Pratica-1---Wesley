package peso;
import java.util.Scanner;
public class Peso {

	private double quilo;	
	
	public double getQuilo() {
		return quilo;
	}
	public void setQuilo(double quilo) {
		this.quilo = quilo;
	}

    //Main
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   
    double peso, aumento1 ,aumento2; 
    
    System.out.print("Informe seu peso: ");
    peso = input.nextDouble();
    
    aumento1 = (peso * 0.15 + peso);
    System.out.println("Seu peso se engordar 15%: " + aumento1 + " kg");
	
    aumento2 = (peso * 0.20 + peso);
    System.out.println("Seu peso se engordar 2o%: " + aumento2 + " kg");
    
	}

}
