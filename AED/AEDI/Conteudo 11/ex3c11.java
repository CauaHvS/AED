import java.util.Scanner;

public class ex3c11 {
    public static void main(String[] args) {
        String placa;
        int dia = 0, pontos, quantMulta = 0;
        double multa = 0, valorTot = 0;
        Scanner keyb = new Scanner(System.in);
        System.out.println("O diretor do DETRAN quer trabarlho facil ent�o t� aqui: ");
        while (dia == 0) {
            System.out.println("Digite o dia da ocorr�ncia: ");
            dia = keyb.nextInt();
            if (dia == 99) {
                break;
            }
            System.out.println("Digite quantos pontos perdeu: ");
            pontos = keyb.nextInt();
            System.out.println("Digite a placa do carro: ");
            placa = keyb.nextLine();
            keyb.nextLine();
            if (pontos == 3) {
                multa = 42;
            } else if (pontos == 5) {
                multa = 108;
            } else if (pontos == 8) {
                multa = 479;
                quantMulta += 1;
            }
            System.out.println("A Multa aplicada foi de: " + multa + " a placa: " + placa);
            valorTot += multa;
        }
        System.out.println("A quantidade de multas de pontua��o 8 foi de: " + quantMulta);
        System.out.println("O Valor total arrecadado foi de: " + valorTot);
        keyb.close();
    }
}
