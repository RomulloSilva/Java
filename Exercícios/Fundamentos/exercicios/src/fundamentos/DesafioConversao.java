package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite os sal�rios dos ultimos tr�s meses");
		String salario1 = entrada.next().replace(",", "."); // O replace � para resolver o conflito caso o usu�rio digite virgula.
		System.out.println("Segundo valor!");
		String salario2 = entrada.next().replace(",", ".");
		System.out.println("Terceiro valor!");
		String slario3 = entrada.next().replace(",", ".");
		
		//coverter
		double sala1 = Double.parseDouble(salario1);
		double sala2 = Double.parseDouble(salario2);
		double sala3 = Double.parseDouble(slario3);
		double media = (sala1 + sala2 +sala3) / (3);
		System.out.println("A m�dia do seu sal�rio �: "+ media);
		
		entrada.close();
	}

}
