import java.util.Scanner;

public class ex1c12 {
    public static void main(String[] args) {
        int numero = 0, vetor[] = new int[10];
        Scanner keyb = new Scanner(System.in);
        System.out.println("Vamos falar quais valores são divisiveis por 5 e 7 ao mesmo tempo!");
        for (int cont = 0; 10 > cont; cont++) {
            System.out.println("Digite um número: ");
            vetor[cont] = keyb.nextInt();
        }
        for (int cont = 9; cont > 0; cont--) {
            if (vetor[cont] % 5 == 0 && vetor[cont] % 7 == 0) {
                System.out.print(vetor[cont] + " ");
                numero++;
            }
        }
        System.out.println("Números divisivéis por 7 e 5: " + numero);
        System.out.println("Fim");
        keyb.close();
    }
}
