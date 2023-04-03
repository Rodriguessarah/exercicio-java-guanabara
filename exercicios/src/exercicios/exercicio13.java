package exercicios;

import java.util.Scanner;
public class exercicio13 {

	public static void main(String[] args) {
		
		double salario, novoSalario;
		
		try (Scanner read = new Scanner(System.in)) {
			System.out.print("Digite o salário do funcionário para receber o aumento: ");
			salario = read.nextDouble();
		}
		
		novoSalario = salario+((15.0/100.0)*salario);
		
		System.out.println("O seu novo salário é: R$ " + novoSalario);

	}

}
