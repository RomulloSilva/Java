package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringParaNumero {
	
	public static void main(String[] args) {
		
		//JOptionPane aparece um "pop up" para o o usu�rio digitar.
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro N�mero");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo N�mero");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double soma= numero1 + numero2;
		System.out.println("A Soma �: "+ soma);
		System.out.println("M�dia �: "+ soma/2);
	}

}
