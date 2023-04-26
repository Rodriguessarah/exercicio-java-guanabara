package exercicios;
import java.util.Scanner;
public class Exercicio37 {

	public static void main(String[] args) {
		
		double salarioAtual, salarioNovo, anosDeTrabalho;
		int op;
		
		try (Scanner read = new Scanner (System.in)) {
			System.out.println(" Informe o salario atual do colaborador:");
			salarioAtual = read.nextDouble();
			
			System.out.println(" Informe, em anos, o tempo que está empregado :");
			anosDeTrabalho = read.nextDouble();
			
			System.out.println("Selecione o genero do colaborador:\n ");
			System.out.println("1. mulher \n2. homem \n");
			System.out.print("Digite o número da opção: ");
			
			op = read.nextInt();
		}
		
		switch (op) {
		case 1 :
			if ( anosDeTrabalho <15 ) {
				salarioNovo = salarioAtual +(salarioAtual*0.05);
				System.out.println("O novo salario do colaborador será R$" + salarioNovo + "reais" );
			} else if (anosDeTrabalho >=15 && anosDeTrabalho >=20) {
				salarioNovo = salarioAtual +(salarioAtual*0.12);
				System.out.println("O novo salario do colaborador será R$" + salarioNovo + "reais" );			
			} else if ( anosDeTrabalho >20) {
				salarioNovo = salarioAtual +(salarioAtual*0.23);
				System.out.println("O novo salario do colaborador será R$" + salarioNovo + "reais" );
		}
			break;
			
		case 2:
			if ( anosDeTrabalho <20 ) {
				salarioNovo = salarioAtual +(salarioAtual*0.03);
				System.out.println("O novo salario do colaborador será R$" + salarioNovo + "reais" );
			} else if (anosDeTrabalho >=20 && anosDeTrabalho >=30) {
				salarioNovo = salarioAtual +(salarioAtual*0.13);
				System.out.println("O novo salario do colaborador será R$" + salarioNovo + "reais" );			
			} else if (anosDeTrabalho >30) {
				salarioNovo = salarioAtual +(salarioAtual*0.25);
				System.out.println("O novo salario do colaborador será R$" + salarioNovo + "reais" ); 
		
			}
				break;
		default:
			System.out.println("Opção inválida!");
			
			}
		}
	}