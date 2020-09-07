package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia";
		s = s.replace("dia", "noite");
		s = s.toUpperCase();
		System.out.println(s);
		String x = "Romulo".toUpperCase();
		System.out.println(x);
		String y = "Bom dia X"
				.replace("X", "Romulo")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		//Tipos primitivos não tem operador "."
		//int a =3;
		//a.
	}

}
