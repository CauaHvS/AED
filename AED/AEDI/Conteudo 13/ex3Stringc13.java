import java.util.Scanner;

public class ex3Stringc13 {
    public static void main(String[] args) {
        String numero;
        int posicao;
        Scanner keyb = new Scanner(System.in);
        do {
            System.out.println("\nDigite um número (fim para encerrar): ");
            numero = keyb.nextLine();
            if(!numero.equalsIgnoreCase("fim")) {
                System.out.println("Digite a posição: ");
                posicao = keyb.nextInt();
                keyb.nextLine();
                System.out.printf("Número na posição %d é igual a %s ", posicao, getPosicao(numero, posicao));
            }
        }while (!numero.equalsIgnoreCase("fim"));
        System.out.println("OK :( \nPrograma encerrado!");
        keyb.close();
    }
    public static String getPosicao (String numero, int posicao){
        posicao = numero.length() - (posicao-1);
        numero = numero.substring(posicao-1, posicao);
        return numero;
    }
}
