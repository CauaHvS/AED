import java.util.Scanner;

public class ex5c11 {
    public static void main(String[] args) {
        String nome = "";
        double mensalidade = 0, mensalTot = 0, mensalMedia = 0;
        int codigo, quantIngles = 0, cont = 0;
        Scanner keyb = new Scanner(System.in);
        while (!nome.equalsIgnoreCase("FIM")) {
            System.out.println("Qual o nome do aluno? ");
            nome = keyb.nextLine();
            if (nome.equalsIgnoreCase("FIM")) {
                break;
            }
            cont++;
            System.out.println("\n[1]Ingles \n[2]Francês \n[3]Espanhol \nQual o código da língua que o aluno cursa? ");
            codigo = keyb.nextInt();
            keyb.nextLine();
            switch (codigo) {
                case 1:
                    mensalidade = 100;
                    quantIngles += 1;
                    break;
                case 2:
                    mensalidade = 150;
                    break;
                case 3:
                    mensalidade = 120;
                    break;
            }
            System.out.printf("\nO aluno %s paga %5.2f de mensalidade!", nome, mensalidade);
            mensalTot += mensalidade;
        }
        mensalMedia = mensalTot / cont;
        System.out.println("\nCom uma quantidade de: " + quantIngles + " de alunos no curso de inglês!");
        System.out.println("A mensalidade média foi de: " + mensalMedia);
        keyb.close();
    }
}
