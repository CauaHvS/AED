import java.util.Scanner;

public class ex20c12 {
    public static void main(String[] args) {
        int[] num = new int[10], maiores = new int[10];
        int numeros = 0, somador = 0;
        double media;
        Scanner keyb = new Scanner(System.in);
        for (int aux = 0; aux < num.length; aux++) {
            System.out.println("Digite um número: ");
            num[aux] = keyb.nextInt();
        }
        for (int aux = 0; aux < num.length; aux++) {
            if (num[9] < num[aux]) {
                numeros++;
                maiores[aux] = num[aux];
            }
        }
        for (int cont = 0; cont < num.length; cont++) {
            if (maiores[cont] != 0) {
                System.out.print(maiores[cont] + " ");
                somador += maiores[cont];
            }
        }
        media = (double) somador / numeros;
        System.out.println("\nA média foi: " + media);
        keyb.close();
    }
}
