import java.util.Scanner;

public class Uri1044 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		int numero1, numero2;

		System.out.println("Digite o primeiro n�mero:");
		numero1 = entrada.nextInt();
		System.out.println("Digite o segundo numero");
		numero2 = entrada.nextInt();

		if (numero2 % numero1 == 0) {
			System.out.println("S�o Multiplos");
		} else {
			System.out.println("N�o s�o Multiplos");
		}
		entrada.close();

	}

}
