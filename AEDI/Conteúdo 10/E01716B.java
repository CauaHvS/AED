//Bryan Wille Souto Braga

import java.util.Scanner;
import java.util.Arrays;

public class E01438B {
    public static void main(String[] args) {
        String[] nome = new String[100];
        int[] codigo = new int[nome.length];
        int opcao;
        Scanner keyb = new Scanner(System.in);
        for (int cont = 0; cont < nome.length; cont++) {
            System.out.println((cont + 1) + ". Digite o nome do livro: ");
            nome[cont] = keyb.nextLine();
            System.out.println((cont + 1) + ". Digite o c�digo do livro " + nome[cont] + ": ");
            codigo[cont] = keyb.nextInt();
            keyb.nextLine();
        }
        System.out.println("Professor, como n�o entendi se queria em ordem n�merica ou ordem alf�betica dos c�digos"
                + " dos livros entre 1001 e 1100 eu fiz dos dois jeitos!");
        System.out.print("\n[1]Alfab�tica \n[2]N�merica \nSelecione a op��o >> ");
        opcao = keyb.nextInt();
        switch (opcao) {
            case 1:
                alpha(nome, codigo);
                break;
            case 2:
                num(nome, codigo);
                break;
        }
        keyb.close();
    }

    public static void alpha(String[] livro, int[] codigo) {
        System.out.println("\n Alfab�tico");
        System.out.println("ATEN��O: Ordem alfab�tica � case-sensitive!");
        System.out.println("Livros entre 1001 e 1100 em ordem alfab�tica do nome: ");
        String[] livroCopy = new String[livro.length];
        for (int cont = 0; cont < livro.length; cont++) {
            livroCopy[cont] = livro[cont];
        }
        Arrays.sort(livro);
        for (int aux = 0; aux < livro.length; aux++) {
            for (int cont = 0; cont < livroCopy.length; cont++) {
                if (livro[aux].equals(livroCopy[cont]) && codigo[cont] > 1001 && 1100 > codigo[cont]) {
                    System.out.printf("\nLivro: %s \nC�digo: %s \n", livroCopy[cont], codigo[cont]);
                }
            }
        }
    }
    public static void num(String[] livro, int[] codigo) {
        String bolhaNom;
        int bolhaCod;
        System.out.println("\n N�merico");
        System.out.println("Livros entre 1001 e 1100 em ordem n�merica do c�digo: ");
        for (int cont = 0; cont < livro.length; cont++) {
            for (int aux = 0; aux < livro.length - 1; aux++) {
                if (codigo[aux] > codigo[aux + 1]) {
                    bolhaNom = livro[aux];
                    bolhaCod = codigo[aux];
                    livro[aux] = livro[aux + 1];
                    codigo[aux] = codigo[aux + 1];
                    livro[aux + 1] = bolhaNom;
                    codigo[aux + 1] = bolhaCod;
                }
            }
        }
        for (int cont = 0; cont < livro.length; cont++) {
            if (codigo[cont] > 1001 && 1100 > codigo[cont]) {
                System.out.printf("\nLivro: %s \nC�digo: %d \n", livro[cont], codigo[cont]);
            }
        }
    }
}