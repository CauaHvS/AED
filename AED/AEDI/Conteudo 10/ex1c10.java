import java.util.Scanner;

public class ex1c10 {
    public static void main(String[] args) {
        double valor, media = 0, contador = 0;
        Scanner keyb = new Scanner(System.in);
        do {
            System.out.println("Digite o valor para calcularmos a multa: ");
            valor = keyb.nextDouble();
            if (valor != -1) {
                System.out.println("O valor da multa é de: " + (valor * 0.10));
                media += valor * 0.1;
                contador += 1;
            }
        } while (valor != -1);
        System.out.println("O valor da média foi de: " + (media / contador));
        keyb.close();
    }
}
