import java.util.Scanner;

public class Uri1060 {
	public static void main(String args[]) {
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		double num1,num2,num3,num4,num5,num6;
		int cont;
		int aux=0;
		
		System.out.println("Digite 6 numeros reais");
		num1 = entrada.nextDouble();
		num2 = entrada.nextDouble();
		num3 = entrada.nextDouble();
		num4 = entrada.nextDouble();
		num5 = entrada.nextDouble();
		num6 = entrada.nextDouble();
		
		double num[]= {num1, num2, num3, num4, num5, num6};
		
		for (cont = 0; cont < 6; cont++) {
			
			if(num[cont] > 0) {
				aux++;
			}
			
		}
		System.out.println(aux+" valores positivos");
		
		
		
		
		
		entrada.close();
		
		
		
	}

}
