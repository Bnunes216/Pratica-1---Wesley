package teorema;
import javax.swing.JOptionPane;
public class Pitagoras {

	  private int a;
	  private int b;
	  private int c;
	  public int getA() {
	    return a;
	  }
	  public void setA(int a) {
	    this.a = a;
	  }
	  public int getB() {
	    return b;
	  }
	  public void setB(int b) {
	    this.b = b;
	  }
	  public int getC() {
	    return c;
	  }
	  public void setC(int c) {
	    this.c = c;
	  }
	  
	  
	  
	  public static void main(String[] args) {
	      String entrada;
	     
	      int a,b,c,pitagoras; 
	  
	  entrada = JOptionPane.showInputDialog("Digite o 1° cateto: ");
	  a = Integer.parseInt(entrada);
	  
	  entrada = JOptionPane.showInputDialog("Digite o 2° cateto: ");
	  b = Integer.parseInt(entrada);
	  
	  entrada = JOptionPane.showInputDialog("Digite a hipotenusa: ");
	  c = Integer.parseInt(entrada);
	  
	  pitagoras = c = (a * a) + (b * b);
	  JOptionPane.showMessageDialog(null, "Seu teorema é: " + pitagoras);
	  
	  
	  }
	}
