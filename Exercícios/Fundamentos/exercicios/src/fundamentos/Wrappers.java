package fundamentos;


 //Wrappers são as versões objetos dos tipos primitivos do java, assim conseguimos por exemplo usar a notação ponto.
public class Wrappers {

	public static void main(String[] args) {

		// Byte
		Byte b = 100;
		Short s = 1000;

		// Integer.parseInt(entrada.next());
		Integer i = 10000;
		Long l = 100000L;

		System.out.println(b.byteValue()); // Valor em bytes utilizado pelo dado da variável.
		System.out.println(s.toString()); // Transforma em texto.
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 12.57f;
		System.out.println(f);
		
		Double d = 1254.57698;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase()); //Converti o tipo boolena para o string e depois deixei em maiúsculo.
		
		Character c = '#'; //Wrapper para o char
		System.out.println(c + "...");
	}

}
