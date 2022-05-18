import java.util.Scanner;

public class ex25c12 {
    public static void main(String[] args) {
        String[] time = new String[20];
        int[] posicao = new int[20];
        int bolhaInt;
        String bolhaStr, status = "", pesquisa;
        boolean encontrado = false;
        Scanner keyb = new Scanner(System.in);
        for (int cont = 0; cont < time.length; cont++) {
            System.out.println("Digite o nome do time: ");
            time[cont] = keyb.nextLine();
            System.out.println("Digite a posição do " + time[cont] + ": ");
            posicao[cont] = keyb.nextInt();
            keyb.nextLine();
        }
        for (int cont = 0; cont < time.length; cont++) {
            for (int aux = 0; aux < time.length - 1; aux++) {
                if (posicao[aux] < posicao[aux + 1]) {
                    bolhaInt = posicao[aux];
                    bolhaStr = time[aux];
                    posicao[aux] = posicao[aux + 1];
                    time[aux] = time[aux + 1];
                    posicao[aux + 1] = bolhaInt;
                    time[aux + 1] = bolhaStr;
                }
            }
        }
        System.out.println("Time  ---  Pontuação");
        for (int cont = 0; cont < time.length; cont++) {
            System.out.println(time[cont] + " --- " + posicao[cont]);
        }
        System.out.println("Qual time você deseja procurar? ");
        pesquisa = keyb.nextLine();
        for (int cont = 0; cont < time.length; cont++) {
            if (pesquisa.equalsIgnoreCase(time[cont])) {
                if (cont >= 0 && cont <= 3) {
                    status = "na Copa libertadores";
                } else if (cont <= 11) {
                    status = "na Copa Sul-Americana";
                } else if (cont >= 16) {
                    status = "Rebaixado(a)";
                } else {
                    status = "Mediocre!";
                }
                System.out.printf("%s está %s, na posição %d!", time[cont], status, (cont + 1));
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Time não encontrado");
        }
        keyb.close();
    }
}
