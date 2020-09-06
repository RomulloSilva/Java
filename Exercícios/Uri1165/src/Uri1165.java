import java.util.Scanner;

public class Uri1165 {
	public static void main(String args[]) {
		Scanner input;
		input = new Scanner(System.in);
		//Criação das varáveis
		int teste, divisor;
		
		//Pega o valor de quantos testes serão feitos.
		System.out.println("Digite quantos números serão verificados");
		teste = input.nextInt();
		
		//Vetor onde ficará armazenados os valores a serem verificados.
		int vetor[] = new int[99];
		
		
		//Aqui é feito a primeira rodada para pegar os vaores a serem verificados.
		for (int i = 0; i < teste; i++) {
			System.out.print("Digite um número");
			vetor[i] = input.nextInt();
			//Foi aplicado ao vetor os valores digitados
		}
		for (int i = 0; i < teste; i++) {//Segundo loop para verificação se é primo.
			
			boolean primo = true;//Criei a var primo onde a mesma é tida como verdade.
			
			for (divisor = 2; divisor <= vetor[i] - 1; divisor++) {//Aqui acontece o loop que roda uma var chamada divisor que vai de 2 ate o valor -1.
				if (vetor[i] % divisor == 0)//Aqui o valor é dividido por todos os valores de 2 até ele mesmo -1.
					primo = false;//Se ele entrar aqui primo vira falso, uma vez que exite outros divisores para esse numero alem dele mesmo.
			}
			if (primo == true) {// Verificação simple para saber se ao chegar aqui primo é falso ou verdadeiro.
				System.out.println(vetor[i] + " eh primo");
			} else {
				System.out.println(vetor[i] + " nao eh primo");
			}
		}

		input.close();
	}
}
