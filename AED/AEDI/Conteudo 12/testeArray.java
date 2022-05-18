import java.util.Scanner;

public class testeArray {
    public static void main(String[] args) {
        String array[] = new String[20];
        Scanner keyb = new Scanner(System.in);
        for (int contador = 0; 17 > contador; contador++) {
            array[contador] = "s";
        }
        System.out.println(array[19]);
        keyb.close();
    }
}
