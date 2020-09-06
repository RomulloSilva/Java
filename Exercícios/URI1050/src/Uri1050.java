
import java.util.Scanner;

public class Uri1050 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);

		int ddd = teclado.nextInt();
		switch (ddd) {

		case 61:
			System.out.print("Brasília");
			break;
		case 71:
			System.out.print("Salvador");
			break;
		case 11:
			System.out.print("São Paulo");
			break;
		case 21:
			System.out.print("Rio de Janeiro");
			break;
		case 32:
			System.out.print("Juiz de Fora");
			break;
		case 19:
			System.out.print("Campinas");
			break;
		case 27:
			System.out.print("Vitoria");
			break;
		case 31:
			System.out.print("Belo Horizonte");
			break;
		default:
			System.out.print("DDD nao cadastrado");
			break;
		}
		teclado.close();

	}

}
