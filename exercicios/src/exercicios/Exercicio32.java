package exercicios;

import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class Exercicio32 {
	
	public static void main(String[] args) {
		int numJogador, numSorteado, op;
		
		System.out.print("Digite aqui o seu número de 1 a 5: ");
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		numJogador = scan.nextInt();
		numSorteado = random.nextInt(4)+1;
		
		System.out.println("\nNosso número sorteado foi: " + numSorteado);
		System.out.println("Você escolheu o número: " + numJogador);
		
		if(numJogador == numSorteado) {
		
			System.out.println("\nQue legal! Você acertou!");
			
		}
		
		else {
			
			System.out.println("\nInfelizmente você errou. Tente novamente!");
	}

    
    }
}


