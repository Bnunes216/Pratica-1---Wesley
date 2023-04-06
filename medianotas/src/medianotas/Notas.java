package medianotas;
import javax.swing.JOptionPane;
public class Notas {

	private double nota1;
	private double nota2;
	private double nota3;
	private double media;
	
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	
	
	
	
	public static void main(String[] args) {
	String entrada;
	    double nota1, nota2, nota3, media;
	    
	    entrada = JOptionPane.showInputDialog("1° nota: ");
	    nota1 = Integer.parseInt(entrada);
	    
	    entrada = JOptionPane.showInputDialog("2° nota: ");
	    nota2 = Integer.parseInt(entrada);
	   
	    entrada = JOptionPane.showInputDialog("3° nota: ");
	    nota3 = Integer.parseInt(entrada);
	    
	    media = (nota1 + nota2 + nota3)/3;
	    JOptionPane.showMessageDialog(null, "A sua média é de: " + media);
	    
	    System.exit(0);
		}
	
}
