import java.util.Scanner;

public class Uri1164 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		int teste, num;

		System.out.println("TESTE");
		teste = entrada.nextInt();
		for (int i = 0; i < teste; i++) {//Faz a repeti��o que foi digitada.
			int B=0;
			System.out.println("N�mero");
			num = entrada.nextInt();
			for(int A = num; A > 0; A--) {// Faz a repeti��o at� que o valor chegue a zero.
				if(num % A == 0 && num != A) {//Verifica se os numeros s�o divisores e se n�o � o pr�pio valor.
					//System.out.println(A);
					B=B+A;//Faz a somatoria de todos os divisores
				}
				
			}if(B == num) {//Verifica se a somatoria dos divisores � igual ao valor digitado.
				System.out.println(num+" eh perfeito");
			}else {
				System.out.println(num+" nao eh perfeito");
			}
			
		}

		entrada.close();
	}

}
