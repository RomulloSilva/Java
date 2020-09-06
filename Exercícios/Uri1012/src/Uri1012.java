import java.util.Scanner;

public class Uri1012 {

	public static void main(String args[]) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		double A,B,C;
		
		System.out.println("Digite um valor para A");
		A = teclado.nextDouble();
		System.out.println("Digite um valor para B");
		B = teclado.nextDouble();
		System.out.println("Digite um valor para C");
		C = teclado.nextDouble();
		
		double areaTriangulo 	= C*(A/2);
		double areaCirculo 		= 3.14159*(C*C);
		double areaTrapezio 	=(A+B)*(C/2);
		double areaQuadrado		= B*B;
		double areaRetangulo 	= A*B;
		
		
		System.out.print("TRIANGULO: ");
		System.out.printf("%.3f\n",areaTriangulo);
		System.out.print("CIRCULO: ");
		System.out.printf("%.3f\n",areaCirculo);
		System.out.print("TRAPEZIO: ");
		System.out.printf("%.3f\n",areaTrapezio);
		System.out.print("QUADRADO: ");
		System.out.printf("%.3f\n",areaQuadrado);
		System.out.print("RETANGULO: ");
		System.out.printf("%.3f\n",areaRetangulo);
		teclado.close();

	}

}
