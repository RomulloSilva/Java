package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringParaNumero {
	
	public static void main(String[] args) {
		
		//JOptionPane aparece um "pop up" para o o usuário digitar.
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro Número");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo Número");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double soma= numero1 + numero2;
		System.out.println("A Soma é: "+ soma);
		System.out.println("Média é: "+ soma/2);
	}

}
