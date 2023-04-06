package medianotas;
import java.util.Scanner;

public class MediaNotas {
  
	//Variables
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

	public double calculaMedia() {
		media = (nota1 + nota2 + nota3) / 3;
		return media;
	}
	
	
    //class principal
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    double nota1, nota2, nota3, media;
    
    System.out.print("1° nota: ");
    nota1 = input.nextDouble();
    
    System.out.print("2° nota: ");
    nota2 = input.nextDouble();
    
    System.out.print("3° nota: ");
    nota3 = input.nextDouble();
    
    media = (nota1 + nota2 + nota3) /3;
    System.out.print("Media das notas é: " + media);
    
	}

}
