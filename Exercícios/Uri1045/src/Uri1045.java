import java.util.Scanner;

public class Uri1045 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		double A, B, C;
		int cont, cont2;
		double aux;

		System.out.println("Digite o valor de A");
		A = entrada.nextFloat();
		System.out.println("Digite o valor de B");
		B = entrada.nextFloat();
		System.out.println("Digite o valor de C");
		C = entrada.nextFloat();

		// Para não gerar o problema de vetor nulo, inserir os valores no vetor.
		double vetor[] = { A, B, C };

		// Aqui foi feito o bubble sort, ou ordenação por flutuação.
		for (cont = 0; cont < 3.0; cont++) {

			for (cont2 = 0; cont2 < 3.0; cont2++) {

				if (vetor[cont] < vetor[cont2]) {

					aux = vetor[cont];
					vetor[cont] = vetor[cont2];
					vetor[cont2] = aux;

				}
			}
		}
		System.out.println("A = " + vetor[2] + " B = " + vetor[1] + " C = " + vetor[0] + "  \n");

		if (vetor[2] >= (vetor[1] + vetor[0])) {
			System.out.print("NAO FORMA TRIANGULO");
		} else if ((vetor[2] * vetor[2]) == (vetor[1] * vetor[1]) + (vetor[0] * vetor[0])) {
			System.out.println("TRIANGULO RETANGULO");
		}
		if ((vetor[2] * vetor[2]) > (vetor[1] * vetor[1]) + (vetor[0] * vetor[0])) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		if ((vetor[2] * vetor[2]) < (vetor[1] * vetor[1]) + (vetor[0] * vetor[0])) {
			System.out.println("TRIANGULO ACUTANGULO");
		}
		if (vetor[2] == vetor[1] && vetor[1] == vetor[0]) {
			System.out.println("TRIANGULO EQUILATERO");
		}
		if (vetor[2] == vetor[1] && vetor[2] != vetor[0] || vetor[2] == vetor[0] && vetor[1] != vetor[2]) {
			System.out.println("TRIANGULO ISOSCELES");
		}

		entrada.close();
	}

}
