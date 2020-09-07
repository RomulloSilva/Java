package fundamentos;

public class ConversaoTiposNumericosPrimitivos {
	
	public static void main(String[] args) {
		
		//Conversão implicita, 1 é int, mas é convetido para double.
		double a = 1;
		System.out.println(a);
		
		//Converter pelo "cast", sendo explicita.
		float b= (float) 1.789811495236975;
		System.out.println(b);
		
		//Como int é maior que o Byte aqui podemos perder dados.
		int c = 340;
		byte d = (byte) c; //Conversão explicita (CAST) avisando ao java que sabe que pode haver "erro".
		System.out.println(d);
		
		
		double e = 1.999;
		int f = (int) e; //Conversão explicita (CAST)
		System.out.println(f);
	}

}
