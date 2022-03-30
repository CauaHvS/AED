import java.util.Scanner;

public class ex6c13 {
    public static void main(String[] args) {
        int quant = 0;
        String sobrenome, nome;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Digite o sobrenome: ");
        sobrenome = keyb.nextLine();
        for (int cont = 1; 100 >= cont; cont++) {
            System.out.println(cont + ". Digite o nome: ");
            nome = keyb.nextLine();
            /*  Método com Vetor.
            String[] sobrPessoa = nome.split(" ");
            index = sobrPessoa.length -1;
            if (sobrPessoa[index].equalsIgnoreCase(sobrenome)){
                quant ++;
            } */
            if (nome.substring(nome.length() - sobrenome.length()).equalsIgnoreCase(sobrenome)) {
                quant++;
            }
        }
        if (quant == 0) {
            System.out.printf("Não teve ninguem na lista com o sobrenome %s :(", sobrenome);
        } else {
            System.out.printf("\nFim, %d pessoas com o sobrenome %s!", quant, sobrenome);
            keyb.close();
        }
    }
}
