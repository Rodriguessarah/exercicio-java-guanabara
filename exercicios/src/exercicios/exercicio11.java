package exercicios;
import java.util.Scanner;

public class exercicio11 {
	public static void main(String[] args) {
		
		double a, b, c, delta;
		
		Scanner read = new Scanner(System.in);
		System.out.print("Digite o valor de A: ");
		a = read.nextFloat();
		System.out.print("Digite o valor de B: ");
		b = read.nextFloat();
		System.out.print("Digite o valor de C: ");
		c = read.nextFloat();
		
		delta = ( (b*b)-(4*a*c));
		
		System.out.println("O valor de delta é: "+ delta);
	
}

}
