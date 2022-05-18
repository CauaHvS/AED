import java.util.Scanner;

public class ex2c13 {
    public static void main(String[] args) {
        double x;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Digite x de f(x) ={5x+3/raiz de 16 - x², se x < 4; 0 se x = 4; " +
                "5x+3/raiz de x² - 16, se x > 4");
        do {
            System.out.println("\nDigite um valor para x: (-1 para fechar)");
            x = keyb.nextDouble();
            if (x != -1) {
                System.out.println(funcao(x));
            }
        } while (x != -1);
        System.out.println("Fim!");
        keyb.close();
    }

    static double funcao(double x) {
        double fx;
        if (x < 4) {
            fx = (5 * x + 3) / Math.sqrt(16 - Math.pow(x, 2));
        } else if (x == 4) {
            fx = 0;
        } else {
            fx = (5 * x + 3) / Math.sqrt(Math.pow(x, 2) - 16);
        }
        return fx;
    }
}
