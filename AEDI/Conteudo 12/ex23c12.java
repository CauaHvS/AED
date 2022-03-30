import java.util.Scanner;

public class ex23c12 {
    public static void main(String[] args) {
        String[][] vagas = new String[100][3];
        String pesquisa = "";
        int opcao;
        boolean validez = false;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Vamos retornar a vaga de cada pessoa pelo nome ou pela placa!");
        for (int aux = 0; aux < vagas.length; aux++) {
            System.out.println("Digite a placa do carro: ");
            vagas[aux][0] = keyb.nextLine();
            System.out.println("Digite o nome do dono da vaga: ");
            vagas[aux][1] = keyb.nextLine();
            vagas[aux][2] = Integer.toString(aux);
        }
        do {
            do {
                System.out.print("\n[0] Placa \n[1] Nome \nDigite o item de qual quer pesquisar: ");
                opcao = keyb.nextInt();
                keyb.nextLine();
                switch (opcao) {
                    case 0:
                        System.out.println("\nDigite a placa que quer pesquisar: ");
                        pesquisa = keyb.nextLine();
                        break;
                    case 1:
                        System.out.print("\nDigite o nome da pessoa: ");
                        pesquisa = keyb.nextLine();
                        break;
                    default:
                        System.out.println("\n------------- Indíce invalido! ---------------");
                        break;
                }
            } while (opcao != 0 && opcao != 1);
            for (int cont = 0; cont < vagas.length; cont++) {
                if (pesquisa.equalsIgnoreCase(vagas[cont][opcao])) {
                    System.out.println("\nDono da placa: " + vagas[cont][1]
                            + "\nNúmero da placa: " + vagas[cont][0]
                            + "\nVaga: " + vagas[cont][2]);
                    validez = true;
                }
            }
            if (!validez) {
                if (opcao == 1) {
                    System.out.println("Nome não encontrado, tente novamente!");
                } else if (opcao == 0) {
                    System.out.println("Placa não encontrada, tente novamente!");
                }
            }
        } while (!validez);
        System.out.println("Fim!");
        keyb.close();
    }
}
