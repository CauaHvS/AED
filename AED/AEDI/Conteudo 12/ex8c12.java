import java.util.Scanner;

public class ex8c12 {
    public static void main(String[] args) {
        int array[] = new int[20], soma[] = new int[10];
        Scanner keyb = new Scanner(System.in);
        System.out.println("Digite números 20 números o 1 + 11 numero 2 + 12 numero 3 + 13... 10 + 20");
        for (int contador = 0; array.length > contador; contador++) {
            System.out.println(contador+1 + ". Digite um número: ");
            array[contador] = keyb.nextInt();
        }
        for (int contador = 0; soma.length > contador; contador++) {
            soma[contador] = array[contador] + array[contador+10];
            System.out.print(soma[contador] + " ");
        }
        keyb.close();
    }
}
