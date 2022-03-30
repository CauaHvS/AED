import java.util.Scanner;

public class ex11c13 {
    public static void main(String[] args) {
        String nome;
        Scanner keyb = new Scanner(System.in);
        do {
            System.out.println("Digite o nome da pessoa ('fim' para encerrar'):");
            nome = keyb.nextLine();
            if (!nome.equalsIgnoreCase("fim")) {
                String[] penNome = nome.split(" ");
                System.out.println(penNome[penNome.length - 2].toUpperCase());
            }
        } while (!nome.equalsIgnoreCase("fim"));
        System.out.println("Programa encerrado!");
        keyb.close();
    }
}
