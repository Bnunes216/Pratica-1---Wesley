package losango;
import javax.swing.JOptionPane;
public class Losan {

	double diam;
	double diaM;
	double arealos;
	
	public double getDiagm() {
		return diam;
	}
	public void setDiagm(double diagm) {
		this.diam = diagm;
	}
	public double getDiaM() {
		return diaM;
	}
	public void setDiaM(double diaM) {
		this.diaM = diaM;
	}
	public double getArealos() {
		return arealos;
	}
	public void setArealos(double arealos) {
		this.arealos = arealos;
	}


	
	
	
	
	public static void main(String[] args) {
	String entrada;
	Double diaM, diam, arealos;
	
	entrada = JOptionPane.showInputDialog("Informe a Diagonal Maior: ");
	diaM = (double) Integer.parseInt(entrada);
	
	entrada = JOptionPane.showInputDialog("Informe a Diagonal Menor: ");
	diam = (double) Integer.parseInt(entrada);

	arealos = (diaM * diam)/2;
	JOptionPane.showMessageDialog(null, "A area do losango é de: " + arealos);
	
	}

}
