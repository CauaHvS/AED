import java.util.Scanner;

public class ex5c12 {
    public static void main(String[] args) {
        int numMaior, array[] = new int[10];
        Scanner keyb = new Scanner(System.in);
        System.out.println("Vamos falar qual o maior valor digitado!");
        for (int contador = 0; 9 >= contador; contador++) {
            System.out.printf("\n%d. Digite um valor: ", contador);
            array[contador] = keyb.nextInt();
        }
        numMaior = array[0];
        for (int contador = 0; 9 >= contador; contador++) {
            if (array[contador] > numMaior) {
                numMaior = array[contador];
            }
        }
        System.out.println("\nO maior número foi: " + numMaior);
        keyb.close();
    }
}
