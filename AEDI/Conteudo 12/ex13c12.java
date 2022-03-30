import java.util.Scanner;

public class ex13c12 {
    public static void main(String[] args) {
        String meses[] = new String[12];
        Scanner keyb = new Scanner(System.in);
        for (int cont = 0; cont < meses.length; cont++) {
            System.out.printf("\nDigite o mês de número %d: ", cont + 1);
            meses[cont] = keyb.nextLine();
        }
        System.out.println();
        for (String mes : meses) {
            System.out.println(mes);
        }
        keyb.close();
    }
}
