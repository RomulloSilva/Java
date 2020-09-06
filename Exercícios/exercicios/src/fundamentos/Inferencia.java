package fundamentos;

public class Inferencia {

	public static void main(String[] args) {

		double a = 4.5;
		System.out.println(a);

		// Utilizando var, o java vai inferir o tipo atraves do valor inserido na variável, e mesma de ser inicializada na mesma linha(dá valor)
		var b = 8.5;
		System.out.println(b);
		var c = "TEXTO";
		System.out.println(c);
		//Como  o primeiro valor da var foi do tipo texto, suas alterações ao longo do texto deve ser do tipo texto.
		c = "OUTRO TEXTO";
		System.out.println(c);
		
		//errado
		//var i;
		//i= 85;
	}

}
