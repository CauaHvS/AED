import java.util.Scanner;

public class ex6c10 {
    public static void main(String[] args) {
        double a, b, c, distancia = 1, x, y;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Digite o valor do ponto A: ");
        a = keyb.nextDouble();
        System.out.println("Digite o valor do ponto B: ");
        b = keyb.nextDouble();
        System.out.println("Digite o valor do ponto C: ");
        c = keyb.nextDouble();
        do {
            System.out.println("Digite o valor do ponto X: ");
            x = keyb.nextDouble();
            System.out.println("Digite o valor do ponto Y: ");
            y = keyb.nextDouble();
            distancia = (a * x + b * y + c) / Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            System.out.println("D = " + distancia);
        } while (distancia != 0);
        System.out.println("Fim!");
        keyb.close();
    }
}
