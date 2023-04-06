package temperatura;
import java.util.Scanner;
public class Temperatura {

	private double graus;
	private double fahrenheit;
	
	
	public double getGraus() {
		return graus;
	}

	public void setGraus(double graus) {
		this.graus = graus;
	}

	public double getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}







	public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
    double graus, fahrenheit;
    
    System.out.print("Informe a temperatura em Graus: ");
    graus = input.nextDouble();
    
    fahrenheit = (graus * 1.8) + 32;
    System.out.print("A temperatura em fahrenheit: " + fahrenheit);
    
	}
}
