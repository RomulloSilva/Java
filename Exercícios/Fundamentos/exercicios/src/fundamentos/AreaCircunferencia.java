package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {

		// Definindo variáveis
		double raio = 3.4;
		// Coloco como constante a váriável, não podendo ser alterada, mais tarde no
		// código.
		final double PI = 3.14159;

		double area = PI * raio * raio;

		System.out.println(area);

		raio = 10;
		area = PI * raio * raio;
		System.out.println("Area = " + area + "m²");

	}

}
