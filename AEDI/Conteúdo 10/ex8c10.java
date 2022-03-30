import java.util.Scanner;

public class ex8c10 {
    public static void main(String[] args) {
        String cidade = "", menorCidade = "";
        int populacao, homens, eleitores, mulheres, homTot = 0, quantMul = 0, totCid = 0, popTot = 0, menorPop = 0,
                eleitTot = 0;
        double percEleit, mediaHom;
        Scanner keyb = new Scanner(System.in);
        do {
            System.out.println("Digite o nome da cidade: ");
            cidade = keyb.nextLine();
            System.out.println("Digite a população de " + cidade + ": ");
            populacao = keyb.nextInt();
            System.out.println("Digite a quantidade de eleitores de " + cidade + ": ");
            eleitores = keyb.nextInt();
            System.out.println("Digite a quantidade de homens de " + cidade + ": ");
            homens = keyb.nextInt();
            System.out.println("Digite a quantidade de mulheres de" + cidade + ": ");
            mulheres = keyb.nextInt();
            keyb.nextLine();
            if ((homens + mulheres) != populacao) {
                System.out.println(
                        "A Soma de homens e mulheres da população de " + cidade + " é diferente da população total!");
            }
            totCid++;
            popTot += populacao;
            if (mulheres > homens) {
                quantMul += 1;
            }
            eleitTot += eleitores;
            homTot += homens;
            if (totCid == 1 || menorPop > populacao) {
                menorPop = populacao;
                menorCidade = cidade;
            }
        } while (!(cidade.equalsIgnoreCase("zimbabue de minas")));
        percEleit = eleitTot * 100 / popTot;
        mediaHom = homTot / totCid;
        System.out.println(
                "O total de cidades é: " + totCid + "\nPopulação total é: " + popTot + "\nPercentual de eleitores é: "
                        + percEleit + "\nQuantidade de cidades com mais mulheres que homens é: " + quantMul
                        + "\nMédia de homens é: " + mediaHom + "\nCidade com menor população: " + menorCidade);
        keyb.close();
    }
}
