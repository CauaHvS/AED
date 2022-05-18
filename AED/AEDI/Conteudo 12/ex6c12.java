import java.util.Scanner;

public class ex6c12 {
    public static void main(String[] args) {
        String array[] = new String[12];
        Scanner keyb = new Scanner(System.in);
        for (int contador = 0; array.length > contador; contador++) {
            System.out.println("Digite o mês: ");
            array[contador] = keyb.nextLine();
        }
        for (int contador = array.length-1; contador >= 0; contador--) {
            System.out.print(array[contador] + " ");
        }
        System.out.println("fim");
        keyb.close();
    }
}
