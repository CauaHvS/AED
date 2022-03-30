import melhoresExerc.*;

import java.util.Scanner;

public class ex1c14 {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner keyb = new Scanner(System.in);
        while (opcao != 6) {
            do {
                System.out.println("Aqui estão os exercícios que mais gostei ou achei desafiadores");
                System.out.println("\n[1]Fracionador de Tempo (ex12c5) \n[2]Sets de um jogo de vôlei (ex11c6) " +
                        "\n[3]Estocagem de Bolas (ex12c6) \n[4]Caracteres (ex24c8) \n[5]Ordenador de Números (ex22c12)" +
                        "\n[6]Fechar");
                System.out.print(">>>");
                opcao = keyb.nextInt();
                if (opcao > 6 && opcao < 0)
                    System.out.println("Comando inválido!");
            } while (opcao > 6 && opcao < 0);
            switch (opcao) {
                case 1: divisorDeTempo.conversor(); break;
                case 2: sets.jogo(); break;
                case 3: producaoDeBolas.estocagem(); break;
                case 4: caracteres.caract(); break;
                case 5: ordenarNumeros.ordenar(); break;
                case 6: System.out.println("OK :("); break;
                default: System.out.println("Opção Inválida!"); break;
            }
        }
        System.out.println("Fim!");
        keyb.close();
    }
}
