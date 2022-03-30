import java.util.Scanner;

public class ex3c12 {
    public static void main(String[] args) {
        int contador = 0, vetor[] = new int[10];
        System.out.println("Digite valores, e vamos vr se são divisores de 34");
        Scanner keyb = new Scanner(System.in);
        for (int cont = 0; 9 >= cont; cont++) {
            System.out.printf("\n%d. Digite um número: ", cont);
            vetor[cont] = keyb.nextInt();
        }
        while (contador != 9) {
            if (34 % vetor[contador] == 0) {
                System.out.print(vetor[contador] + " ");
            }
            contador++;
        }
        System.out.println("\nfim");
        keyb.close();
    }
}
