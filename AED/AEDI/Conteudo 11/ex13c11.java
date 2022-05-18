import java.util.Scanner;

public class ex13c11 {

    public static void main(String[] args) {
        double serie = 0, cont = 0;
        int repet;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Digite a quantidade de repetições: da serie 71 * Raiz cúbica de 1x10²/1 +" +
                " 2x19 elevado a 4/7 + 3x28 elevado a 6 / 49 + ...");
        repet = keyb.nextInt();
        while (cont != repet) {
            cont++;
            serie += (cont * Math.pow((10 * cont - (cont - 1)), cont * 2)) / Math.pow(7, cont - 1);
        }
        serie = 71 + Math.pow(serie, 1 / 3.0);
        System.out.println("O valor da série foi de: " +serie);
        keyb.close();
    }
}
