import java.util.Arrays;
import java.util.Scanner;

public class ProcuraArraysNomes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String Nomes[] = new String[10];
        for (int aux = 0; aux < 10; aux++) {
            System.out.print("Digite um nome: ");
            Nomes[aux] = teclado.nextLine();
        }
        System.out.print("Digite um nome a procurar: ");
        String nome = teclado.nextLine();
        int pos = Arrays.binarySearch(Nomes, nome);
        System.out.println(pos);
        if (pos < 0)
            System.out.println("Nome não encontrado");
        else
            System.out.println("Nome encontrado na posição " + (pos + 1));
        teclado.close();
    }

}
