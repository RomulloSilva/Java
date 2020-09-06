import java.util.Scanner;

public class Uri1165 {
	public static void main(String args[]) {
		Scanner input;
		input = new Scanner(System.in);
		//Cria��o das var�veis
		int teste, divisor;
		
		//Pega o valor de quantos testes ser�o feitos.
		System.out.println("Digite quantos n�meros ser�o verificados");
		teste = input.nextInt();
		
		//Vetor onde ficar� armazenados os valores a serem verificados.
		int vetor[] = new int[99];
		
		
		//Aqui � feito a primeira rodada para pegar os vaores a serem verificados.
		for (int i = 0; i < teste; i++) {
			System.out.print("Digite um n�mero");
			vetor[i] = input.nextInt();
			//Foi aplicado ao vetor os valores digitados
		}
		for (int i = 0; i < teste; i++) {//Segundo loop para verifica��o se � primo.
			
			boolean primo = true;//Criei a var primo onde a mesma � tida como verdade.
			
			for (divisor = 2; divisor <= vetor[i] - 1; divisor++) {//Aqui acontece o loop que roda uma var chamada divisor que vai de 2 ate o valor -1.
				if (vetor[i] % divisor == 0)//Aqui o valor � dividido por todos os valores de 2 at� ele mesmo -1.
					primo = false;//Se ele entrar aqui primo vira falso, uma vez que exite outros divisores para esse numero alem dele mesmo.
			}
			if (primo == true) {// Verifica��o simple para saber se ao chegar aqui primo � falso ou verdadeiro.
				System.out.println(vetor[i] + " eh primo");
			} else {
				System.out.println(vetor[i] + " nao eh primo");
			}
		}

		input.close();
	}
}
