package fundamentos;

public class ConversaoNumeroParaString {
	
	public static void main(String[] args) {
		
		//Variavel usando Wrapper.
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		//Usando o primitivo.
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		//Podemos converter para texto usando a concatenação com um campo vazio.
		System.out.println((""+ num2).length());
		System.out.println((""+ num1).length());
		
		
	}

}
