import java.util.Scanner;

public class ex12c11 {
    public static void main(String[] args) {
        int aux, cont = 0, repet;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Digite a quantidade de repetições do palíndromo: ");
        repet = keyb.nextInt();
        while (cont != repet) {
            cont++;
            aux = 0;
            while (aux != cont) {
                aux++;
                System.out.print(aux);
            }
            aux = cont;
            while (aux != 0) {
                System.out.print(aux);
                aux--;
            }
            System.out.println("");
        }
        keyb.close();
    }
}
