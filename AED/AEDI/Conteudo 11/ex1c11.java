import java.util.Scanner;

public class ex1c11 {
    public static void main(String[] args) {
        int vezes, cont = 0;
        double fx, x, media, somador = 0;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Para quantos n�meros quer saber o resultadod e f(x) = x� + (4x - 2) / 5 : ");
        vezes = keyb.nextInt();
        while (vezes > cont) {
            cont++;
            System.out.println(cont + ". digite o valor de x:");
            x = keyb.nextDouble();
            fx = Math.pow(x, 2) + (4 * x - 2) / 5;
            System.out.println("f(x) = " + fx);
            somador += fx;
        }
        media = somador / cont;
        System.out.println("\nA M�dia de f(x) = " + media + " (" + somador + ") / " + cont + " !");
        System.out.println("FIM");
        keyb.close();
    }
}
