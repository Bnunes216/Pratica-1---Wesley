package peso;
import javax.swing.JOptionPane;
public class Quilo {

	private double quilo;
	private double aumento1;
	private double aumento2;
	
	public double getQuilo() {
		return quilo;
	}

	public void setQuilo(double quilo) {
		this.quilo = quilo;
	}

	public double getAumento1() {
		return aumento1;
	}

	public void setAumento1(double aumento1) {
		this.aumento1 = aumento1;
	}

	public double getAumento2() {
		return aumento2;
	}

	public void setAumento2(double aumento2) {
		this.aumento2 = aumento2;
	}

	
	
	
	
	
	public static void main(String[] args) {
		
		String entrada;
		double quilo, aumento1, aumento2;
		
		entrada = JOptionPane.showInputDialog("Qual o seu peso? ");
		quilo = Integer.parseInt(entrada);
		
		aumento1 = quilo * 0.15 + quilo;
		aumento2 = quilo * 0.20 + quilo;
		JOptionPane.showMessageDialog(null, "Seu peso ao engordar 15% é de: " + aumento1 + " kg" + "\n" + "Seu peso ao engordar 20% é de: " + aumento2 + " kg");
		
		
	}

}
