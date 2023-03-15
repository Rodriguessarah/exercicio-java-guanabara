package exercicios;
import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		
		double precoProduto, precoPromo;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println(" informe o valor do produto:");
		precoProduto = read.nextDouble();
		
		//PREÇO PROMOCIONAL:  5% de desconto //
		
		precoPromo = precoProduto * 0.95;
		System.out.println(" O preço promocional deste produto é "+ precoPromo + " reais");
				
		
				
				

	}

}
