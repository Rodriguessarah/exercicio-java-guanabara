package exercicios;

import java.util.Scanner;

public class Exercicio28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Digite a largura do terreno em metros: ");
        double largura = input.nextDouble();

        System.out.print("Digite o comprimento do terreno em metros: ");
        double comprimento = input.nextDouble();

        double area = largura * comprimento;
        System.out.println("A área do terreno é de " + area + " m².");

        if (area < 100) {
            System.out.println("Classificação: TERRENO POPULAR");
        } else if (area >= 100 && area <= 500) {
            System.out.println("Classificação: TERRENO MASTER");
        } else {
            System.out.println("Classificação: TERRENO VIP");
        }
    }
}






