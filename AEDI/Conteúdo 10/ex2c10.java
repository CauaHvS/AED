import java.util.Scanner;

public class ex2c10 {
    public static void main(String[] args) {
        double total = 0, contador = 0, valores, quantMil = 0;
        Scanner keyb = new Scanner(System.in);
        do {
            System.out.println("Digite o valor recebido: ");
            valores = keyb.nextDouble();
            if (valores != 0) {
                total += valores;
                contador += 1;
                if (valores > 1000) {
                    quantMil += 1;
                }
            }
        } while (valores != 0);
        System.out.println("Valor total foi de: " + total);
        System.out.println("A média foi de: " + (total / contador));
        System.out.println("Quantidade de valores acima de R$1000.00 foi de: " + quantMil);
        keyb.close();
    }
}
