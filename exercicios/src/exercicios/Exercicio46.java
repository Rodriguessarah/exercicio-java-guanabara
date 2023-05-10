package exercicios;

public class Exercicio46 {

	public static void main(String[] args) {
		
int x, soma = 0;
		
		for(x = 6; x <= 100; x = x + 2) {
			
			soma += x;
			
			System.out.print(x + " ");
		
			if(x == 100) {
				
				System.out.println("\nA soma dos valores acima é de: " + soma);
				
			}
		}
	}

}
