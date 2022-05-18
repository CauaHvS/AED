import java.util.Scanner;

public class ex7c13 {
    public static void main(String[] args) {
        String nome;
        Scanner keyb = new Scanner(System.in);
        do {
            System.out.println("Digite o nome (fim para encerrar): ");
            nome = keyb.nextLine();
            String[] sobrenome = nome.split(" ");
            System.out.println(sobrenome[0] +", da familía: " +sobrenome[sobrenome.length - 1] +"!");
        }while (!nome.equalsIgnoreCase("fim"));
        System.out.println("Programa encerrado!");
        keyb.close();
    }
}
