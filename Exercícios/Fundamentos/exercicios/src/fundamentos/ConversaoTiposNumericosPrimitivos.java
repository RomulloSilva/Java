package fundamentos;

public class ConversaoTiposNumericosPrimitivos {
	
	public static void main(String[] args) {
		
		//Convers�o implicita, 1 � int, mas � convetido para double.
		double a = 1;
		System.out.println(a);
		
		//Converter pelo "cast", sendo explicita.
		float b= (float) 1.789811495236975;
		System.out.println(b);
		
		//Como int � maior que o Byte aqui podemos perder dados.
		int c = 340;
		byte d = (byte) c; //Convers�o explicita (CAST) avisando ao java que sabe que pode haver "erro".
		System.out.println(d);
		
		
		double e = 1.999;
		int f = (int) e; //Convers�o explicita (CAST)
		System.out.println(f);
	}

}
