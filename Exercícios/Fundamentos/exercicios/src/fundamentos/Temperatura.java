package fundamentos;

public class Temperatura {
	public static void main(String[] args) {

		// Converter fahrenheit em Celsius

		final double AJUSTE = 32;
		final double FATOR = 5 / 9.0;

		double fahrenheit = 86;
		int celsius = (int) ((fahrenheit - AJUSTE) * FATOR);
		System.out.println("A temperatura " + fahrenheit + "°F é " + celsius + "°C");

		fahrenheit = 0;
		celsius = (int) ((fahrenheit - AJUSTE) * FATOR);
		System.out.println("A temperatura " + fahrenheit + "°F é " + celsius + "°C");

	}
}
