package melhoresExerc;

import java.util.Scanner;

public class sets {
    public static void jogo() {
        String time1, time2;
        int ponto1, ponto2, pontuacao1, pontuacao2;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Calculador de pontos de tênis");
        System.out.print("\nQual é o nome do primeiro time? ");
        time1 = keyb.nextLine();
        System.out.print("\nQual é o nome do segundo time? ");
        time2 = keyb.nextLine();
        System.out.print("\nQuantos melhoresExerc.sets o time " + time1 + " fez? ");
        ponto1 = keyb.nextInt();
        System.out.print("\nQuantos melhoresExerc.sets o time " + time2 + " fez? ");
        ponto2 = keyb.nextInt();
        if (ponto1 - ponto2 == 2 || ponto1 - ponto2 == 0) {
            pontuacao1 = 3;
            pontuacao2 = 0;
        } else {
            if (ponto2 - ponto1 == 2 || ponto2 - ponto1 == 0) {
                pontuacao1 = 0;
                pontuacao2 = 3;
            } else {
                if (ponto1 - ponto2 == 1) {
                    pontuacao1 = 2;
                    pontuacao2 = 1;
                } else {
                    pontuacao1 = 1;
                    pontuacao2 = 2;
                }
            }
        }
        keyb.close();
        System.out.println("O time " + time1 + " fez " + pontuacao1 + " ponto(s)");
        System.out.println("O time " + time2 + " fez " + pontuacao2 + " ponto(s)");
        System.out.println("Fim");
    }
}
