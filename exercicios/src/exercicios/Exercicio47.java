package exercicios;

public class Exercicio47 {

	public static void main(String[] args) {
		
		int x, soma = 0;
		
		for (x=500; x>=0; x= x-50) {
			
			soma +=x; 
			
			System.out.println(x + "  ");
			
			if (x==0) {
				System.out.println(" soma dos numero é " + soma);
			}
		}
		

	}

} 
