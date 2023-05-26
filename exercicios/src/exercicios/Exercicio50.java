package exercicios;
import java.util.Random;

public class Exercicio50 {

	public static void main(String[] args) {
		int x, r, acima5 = 0, div3 = 0;
		
		Random rand = new Random();
		
		System.out.println("Os números sorteados foram: ");
		
		for(x = 0; x <= 20; x++) {
			
			
			r = rand.nextInt(10);
			
			System.out.print(r + " ");
			
			if(r > 5) {
				
				acima5++;
				
			}
			
			else if(r % 3 == 0) {
				
				div3++;
			}
		
		}
		
		System.out.println("\nNúmeros acima de 5: " + acima5);
		System.out.println("Números divisíveis por 3: " + div3);
		
	}

	}


