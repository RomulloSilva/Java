package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Olá Pessoal".charAt(5));
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equals("BOA TARDE"));
		System.out.println(s.equalsIgnoreCase("BOA TARDE"));
		
		var nome = "Romulo";
		var sobrenome = "Silva";
		var idade = 24;
		var salario = 5000.33f;
		
		System.out.println("Nome: "+ nome +"\nSobrenome: "+ sobrenome);
		System.out.printf("Nome: %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nNome: %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
	}

}
