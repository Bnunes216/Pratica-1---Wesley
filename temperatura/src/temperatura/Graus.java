package temperatura;
import javax.swing.JOptionPane;
public class Graus {

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
	  String entrada;
	    
	    double graus, fahrenheit;
	    
	    entrada = JOptionPane.showInputDialog("Informe a temperatura em Graus: ");
	    graus = Integer.parseInt(entrada);
	    
	    fahrenheit = (graus * 1.8) + 32;
	    JOptionPane.showMessageDialog(null, "A temperatura em fahrenheit: " + fahrenheit); 
	  }
	}
