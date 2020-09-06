import java.util.Scanner;

public class Uri1101 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		int M, N;
		System.out.println("Digite dois valores valor");
		M = entrada.nextInt();
		N = entrada.nextInt();

		if (M > 0 && N > 0) {
			if (M > N) {
				int cont = N, sum = 0;
				while (cont <= M) {
					System.out.print(cont + " ");//aqui serve para ele imprimir os valores de conte dentro do loop, por isso não pulei linha ln.
					sum += cont;
					cont++;
				}
				System.out.println("sum=" + sum);
			}
		}

		entrada.close();
	}
}
