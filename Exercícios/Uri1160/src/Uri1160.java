import java.util.Scanner;

public class Uri1160 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		double teste;
		double PA, PB;
		double G1, G2;

		//System.out.println("TESTE");
		teste = entrada.nextDouble();
		for (int cont = 0; cont < teste; cont++) {
			//System.out.println("POPULAÇÃO A");
			PA = entrada.nextDouble();
			//System.out.println("POPULAÇÃO B");
			PB = entrada.nextDouble();
			//System.out.println("TAXA A");
			G1 = entrada.nextDouble();
			//System.out.println("TAXA B");
			G2 = entrada.nextDouble();

			int anos = 0;
			int g1 = 0, g2 = 0;

			while (PB >= PA) {
				g1 = (int) (PA * G1) / 100;
				g2 = (int) (PB * G2) / 100;

				PA = PA + g1;
				PB = PB + g2;
				anos++;
			}
			if (anos <= 100) {
				System.out.println(anos + "anos");
			} else {
				System.out.println("Mais de 1 seculo");
			}
		}

		entrada.close();
	}

}
