package salario;
import javax.swing.JOptionPane;
public class Salm {

	private int salario;
	private int quantidade;

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	
	
	
	public static void main(String[] args) {
    String entrada;
          
    int salario, quantidade;
    
        entrada = JOptionPane.showInputDialog("Informe o salario: ");
        salario = Integer.parseInt(entrada);
        
        quantidade = salario / 1320;
        JOptionPane.showMessageDialog(null, "Voce recebe: " + quantidade + " salarios minimos");
           
           
    
	}

}
