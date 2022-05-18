import java.util.Scanner;

public class ex8c13 {
    public static void main(String[] args) {
        String nome;
        Scanner keyb = new Scanner(System.in);
        do {
            System.out.println("\nDigite o nome (fim para encerrar): ");
            nome = keyb.nextLine();
            if (!nome.equalsIgnoreCase("fim")) {
                String[] sobrenome = nome.toUpperCase().split(" ");
                for (int cont = 0; cont < sobrenome.length - 1; cont++) {
                    if (cont == 0) {
                        System.out.print(sobrenome[sobrenome.length - 1] + ", ");
                    }
                    System.out.print(sobrenome[cont].charAt(0) + ". ");
                }
            }
        } while (!nome.equalsIgnoreCase("fim"));
        System.out.println("Programa encerrado!");
        keyb.close();
    }
}
