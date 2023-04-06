package idade;
import javax.swing.JOptionPane;
public class Velho {

	private int anonasc;
	private int anoatual;
	private int ano2050;
	private int idade;
	
	public int getAnonasc() {
		return anonasc;
	}

	public void setAnonasc(int anonasc) {
		this.anonasc = anonasc;
	}
	public int getAnoatual() {
		return anoatual;
	}

	public void setAnoatual(int anoatual) {
		this.anoatual = anoatual;
	}

	public int getAno2050() {
		return ano2050;
	}

	public void setAno2050(int ano2050) {
		this.ano2050 = ano2050;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

    public int calculaidade() {
    	idade = ano2050 - anoatual;
    	return idade;
    }

	
	
	public static void main(String[] args) {
    String entrada;
    int anonasc, anoatual, ano2050, idade;
    
    entrada = JOptionPane.showInputDialog("Qual o ano do seu nascimento? ");
    anonasc = Integer.parseInt(entrada);
    
    entrada = JOptionPane.showInputDialog("Qual o ano atual? ");
    anoatual = Integer.parseInt(entrada);
    
    ano2050 = 2050 - anonasc; 
    idade = anoatual - anonasc;
    JOptionPane.showMessageDialog(null, "A sua idade atual é de: " + idade + " anos" + "\n" + "A sua idade em 2050 será de: " + ano2050 + " anos" );
    
    
	}

}
