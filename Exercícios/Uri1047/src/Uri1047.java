import java.util.Scanner;

public class Uri1047 {
	public static void main(String args[]) {
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		int horaInicial, minutoInicial, horaFinal, minutoFinal;
		
		System.out.println("Hora Inicial:");
		horaInicial = entrada.nextInt();
		System.out.println("Minuto inicial");
		minutoInicial = entrada.nextInt();
		System.out.println("Hora Final:");
		horaFinal = entrada.nextInt();
		System.out.println("Minuto Final:");
		minutoFinal = entrada.nextInt();
		
		int hI,mI;
		
		hI = horaFinal - horaInicial;
		mI = minutoFinal - minutoInicial;
		
		if(mI < 0) {
			 mI = 60 + (minutoFinal - minutoInicial);
			 hI--;
		}else if(hI <= 0) {
			hI = 24;
		}
		
		System.out.println("O JOGO DUROU "+hI+" HORA(S) E "+mI+" MINUTO(S)");
		
		entrada.close();
	}
	

}
