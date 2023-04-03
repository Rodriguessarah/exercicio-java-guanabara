package exercicios;
import java.util.Scanner;

public class exercicio17 {
	public static void main(String[] args) {
		
		double velocidadeCarro, valorDaMulta;
		
		try (Scanner read = new Scanner (System.in)) {
			System.out.println(" Informe a velocidade do carro");
			velocidadeCarro = read.nextDouble();
		}
		
		valorDaMulta = (velocidadeCarro - 80) *5;
		
		if( velocidadeCarro <= 80.00 ){ 
			System.out.println(" você esta dentro da velocidade permitida");
		} else { 
			
			System.out.println(" Você ultrapassou a velocidade permitida");
			System.out.println(" o valor da multa é"+ valorDaMulta + "reais");
		}
		
	}

}
