package exercicios;
import java.util.Scanner;

public class exercicio16 {
	public static void main(String[] args) {
		
		int cigarrosDia, anosFumando, minutosFumando;
		double minutosdeVida, diasPerdidos;
		
		try (Scanner read = new Scanner (System.in)) {
			System.out.println(" Informe a quantidade de cigarros fumados por dia");
			cigarrosDia = read.nextInt();
			
			System.out.println(" Informe por quanto tempo ( em anos) que voce fuma");
			anosFumando = read.nextInt();
		}
		
		minutosFumando = anosFumando*525960;
		minutosdeVida = (cigarrosDia*10)*minutosFumando;
		diasPerdidos = minutosdeVida/1440;
		
		System.out.println(" A quantidade de dias de vida perdido são:" + diasPerdidos);
		
	}

}
