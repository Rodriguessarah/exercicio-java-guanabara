package exercicios;
import java.util.Scanner;

public class Exercicio35 {
	public static void main(String[] args) {
		double diasAlugado, kmPercorrido, dividaKm, dividaAluguel;
		int op;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Selecione o tipo de carro alugado:\n ");
		System.out.println("1. Carro popular\n2. Carro luxuoso\n");
		System.out.print("Digite o número da opção: ");
		
		op = scan.nextInt();
		
		System.out.print("Digite quantos dias ele foi alugado: ");
		diasAlugado = scan.nextDouble();
		
		System.out.print("Digite a quantidade de km percorrido: ");
		kmPercorrido = scan.nextDouble();
		
		switch(op) {
		
		case 1:
			System.out.println("\n=== Carro Popular ===");
			if(kmPercorrido <= 100.0) {
				dividaKm = kmPercorrido * 0.20;
				dividaAluguel = diasAlugado * 90.0;
				System.out.println("Valor total a pagar: " + (dividaKm + dividaAluguel));
			}
			else if(kmPercorrido > 100.0) {
				dividaKm = kmPercorrido * 0.10;
				dividaAluguel = diasAlugado * 90.0;
				System.out.println("Valor total a pagar: " + (dividaKm + dividaAluguel));
			}
			 break;
		case 2:
			System.out.println("\n=== Carro Luxuoso ===\n");
			if(kmPercorrido <= 200.0) {
				dividaKm = kmPercorrido * 0.30;
				dividaAluguel = diasAlugado * 150.0;
				System.out.println("Valor total a pagar: R$" + (dividaKm + dividaAluguel));
			}
			else if(kmPercorrido > 200.0) {
				dividaKm = kmPercorrido * 0.25;
				dividaAluguel = diasAlugado * 150.0;
				System.out.println("Valor total a pagar: R$" + (dividaKm + dividaAluguel));
			}
			 break;
		default:
			System.out.println("Opção inválida!");
		}
		
	}
	}


