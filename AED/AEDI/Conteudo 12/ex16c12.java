import java.util.Scanner;

public class ex16c12 {
    public static void main(String[] args) {
        int[] inteiros = new int[10];
        double[] reais = new double[10];
        double real;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Digite 10 números inteiros e vamos te dar os resultados destes em " +
                "multiplicados por um valor real!");
        System.out.println("Digite o valor real que quer multiplicar: ");
        real = keyb.nextDouble();
        for (int contador = 0; contador < inteiros.length; contador++) {
            System.out.println(contador + ". Digite o número: ");
            inteiros[contador] = keyb.nextInt();
            reais[contador] = inteiros[contador] * real;
        }
        for (int cont = 0; cont < reais.length; cont++) {
            System.out.print(" - " +reais[cont]);
        }
        keyb.close();
    }
}
