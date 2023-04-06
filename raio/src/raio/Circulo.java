package raio;
import javax.swing.JOptionPane;
public class Circulo {

	private double raio;
	private double comprimento;
	private double area;
	private double volume;
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}
	
	
	
	
	

	public static void main(String[] args) {
    String entrada;
    Double raio, comprimento, area, volume;
    
    entrada = JOptionPane.showInputDialog("Forneça o raio: ");
    raio = (double) Integer.parseInt(entrada);
    
    comprimento = 2 * 3.14 * raio;
	area = 3.14 * (raio * raio);
	volume = 0.75 * 3.14 * (raio*raio*raio);
    
	JOptionPane.showMessageDialog(null, "Suas dimensões são: " + "\n" + "Comprimento da circunferencia: " + comprimento + "\n" + "Area da esfera: " + area + "\n" + "Volume da esferaa: " + area);
     
	}
}
