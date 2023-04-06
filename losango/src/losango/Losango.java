package losango;
import java.util.Scanner;
public class Losango {

	double diagm;
	double diaM;
	double arealos;
	
	
	public double getDiagm() {
		return diagm;
	}

	public void setDiagm(double diagm) {
		this.diagm = diagm;
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



	
    //main
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    double diam, diaM, arealos;
    
    System.out.print("Diametro Maior: ");
    diaM = input.nextDouble();
    
    System.out.print("Diamentro menor: ");
    diam = input.nextDouble();
    
    arealos = (diaM * diam) /2;
    System.out.print("A area do losango é: " + arealos);

	}

}
