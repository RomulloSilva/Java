import java.util.Scanner;

public class Uri1143 {
	public static void main(String args[]) {
		Scanner digitado = new Scanner(System.in);

		int N;

		N = digitado.nextInt();

		int cont = 1;
		while (cont <= N) {
			int N1 = cont;
			System.out.println(N1 + " " + (N1 * N1) + " " + (N1 * N1 * N1));
			cont++;
		}

		digitado.close();
	}

}
