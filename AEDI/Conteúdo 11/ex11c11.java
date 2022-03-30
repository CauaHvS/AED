import java.util.Scanner;

public class ex11c11 {
    public static void main(String[] args) {
        int numero = 0, aux, repet;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Digite quantas repetições quer: ");
        repet = keyb.nextInt();
        while (numero != repet) {
            numero++;
            aux = 0;
            while (aux != numero) {
                aux++;
                System.out.print(aux +" ");
            }
            System.out.println("");
        }
        keyb.close();
    }
}
