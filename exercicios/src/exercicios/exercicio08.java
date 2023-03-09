package exercicios;
import java.util.Scanner;

public class exercicio08 {
	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		double metros, milimetros, centimetros, decimetros, decametro, hectometro, quilometro;
		
		System.out.println(" Informe a distanca em metros");
		metros = read.nextDouble();
		
		
		milimetros = metros*1000;
		centimetros = metros*100;
		decimetros = metros*10;
		decametro = metros/10;
		hectometro = metros/100;
		quilometro = metros/1000;
		
		System.out.println(" a distancia de"+ metros + " corresponde a:" );
		System.out.println(milimetros + "mm");
		System.out.println(centimetros + "cm");
		System.out.println(decimetros + "dm");
		System.out.println(decametro + "Dam");
		System.out.println(hectometro + "Hm");
		System.out.println(quilometro + "Km");		
	}

}
