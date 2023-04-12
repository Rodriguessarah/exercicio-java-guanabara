package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio31 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        int escolhaUsuario, escolhaComputador, jogadas = 0, vitorias = 0, derrotas = 0, empates = 0;
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};

        System.out.println("Bem-vindo ao JoKenPo!");

        do {
            System.out.println("\nEscolha sua jogada:");
            System.out.println("1 - Pedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tesoura");
            System.out.println("0 - Sair do jogo");

            escolhaUsuario = input.nextInt();

            if (escolhaUsuario == 0) {
                System.out.println("\nJogo finalizado.");
                break;
            }

            if (escolhaUsuario < 1 || escolhaUsuario > 3) {
                System.out.println("\nEscolha inválida. Tente novamente.");
                continue;
            }

            escolhaComputador = rand.nextInt(3) + 1;
            System.out.println("\nComputador escolheu " + opcoes[escolhaComputador-1]);

            jogadas++;

            if (escolhaUsuario == escolhaComputador) {
                System.out.println("Empate!");
                empates++;
            } else if ((escolhaUsuario == 1 && escolhaComputador == 3) || (escolhaUsuario == 2 && escolhaComputador == 1) || (escolhaUsuario == 3 && escolhaComputador == 2)) {
                System.out.println("Você venceu!");
                vitorias++;
            } else {
                System.out.println("Computador venceu!");
                derrotas++;
            }

        } while (true);

        System.out.println("\nEstatísticas do jogo:");
        System.out.println("Jogadas: " + jogadas);
        System.out.println("Vitórias: " + vitorias);
        System.out.println("Derrotas: " + derrotas);
        System.out.println("Empates: " + empates);
    }
}

