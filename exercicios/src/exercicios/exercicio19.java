package exercicios;

import java.util.Scanner;

public class exercicio19 {
	public static void main(String[] args) {
		
		double nota1, nota2, media;
		String nomeAluno;
		
		try (Scanner read = new Scanner (System.in)) {
			System.out.println("informe o nome do aluno");
			nomeAluno = read.next();
			
			System.out.println(" informe a primeira nota do aluno");
			nota1 = read.nextDouble();
			
			System.out.println(" informe a segunda nota do aluno");
			nota2 = read.nextDouble();
		}
		
		media = (nota1+ nota2)/2;
		
			
		if (media >= 7.0) {
			System.out.println(nomeAluno + " Parabens, você teve um bom aproveitamento \n Sua média foi:" + media);
		
		} else { 
			
			System.out.println(nomeAluno + " infelizmente você não teve um bom aproveitamento \\n Sua média foi:" + media);
		}
		
		}
		
	
}


