import java.util.Scanner;

public class ex18c12 {
    public static void main(String[] args) {
        boolean test = false;
        String nomePes;
        String[] nome = new String[10];
        int[] posicao = new int[10];
        Scanner keyb = new Scanner(System.in);
        System.out.println("Pesquisando os nomes de quem estão na fila!");
        for (int cont = 0; cont < nome.length; cont++) {
            System.out.println(cont + ". digite o nome: ");
            nome[cont] = keyb.nextLine();
            posicao[cont] = cont;
        }
        System.out.println("Digite o nome que quer saber o local na fila: ");
        nomePes = keyb.nextLine();
        for(int aux = 0; aux < nome.length; aux++)
            if (nomePes.equalsIgnoreCase(nome[aux])){
                System.out.printf("O %s está na posição %d!", nomePes, posicao[aux]);
                test = true;
        }
        if (!test){
            System.out.println("Nome não encontrado!");
        }
        keyb.close();
    }
}
