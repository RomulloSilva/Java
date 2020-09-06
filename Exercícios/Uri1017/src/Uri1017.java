import java.util.Scanner;

public class Uri1017 {
	public static void main(String args[]) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		double tempo, velomedia;
		
		System.out.println("Quantas horas dureou a viagem?");
		tempo = teclado.nextDouble();
		System.out.println("Qual foi a velocidade média?");
		velomedia = teclado.nextDouble();
		
		double kmPercorrido = velomedia *tempo;
		double gasolina = kmPercorrido/12;
		
		System.out.printf("%.3f\n",gasolina);
		teclado.close();		
	}
	

}
