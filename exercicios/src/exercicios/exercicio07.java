package exercicios;
import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		
		try (Scanner read = new Scanner (System.in)) {
			double num, dobro, terco; 
			
			System.out.println(" informe um numero real");
			num = read.nextDouble();
			
			dobro = num*2;
			System.out.println(" o dobro de " + num + "e " + dobro);
			
			terco = num/3;
			System.out.println(" o terco de" + num + "é " + terco);
		}		
				
			
				
	}

}
