package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		//Informa��es de funcion�rios.
		
		//Tipos n�mericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		//Tipos n�mericos reais
		float salario = 11445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano.
		boolean estaDeFerias = false;
		
		//Tipo caractere.
		char status = 'A'; //Aceita apenas um caractere;
		
		
		//Dias de empresa.
		System.out.println(anosDeEmpresa * 365);
		//N�mero de viangens
		System.out.println(numeroDeVoos / 2);
		//Pontos por real.
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + " Ganha -> " + salario);
		System.out.println("Feria? "+ estaDeFerias);
		System.out.println("Status "  + status);
	}

}
