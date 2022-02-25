package ordenacao;

public class Ordenacao_main {

    private static Ordenacao ordem;

    public static void main(String[] args) {
        ordem = new Ordenacao();

        System.out.println("\n>>>TESTE DE OREDENAÇÃO<<<\n");

        int[] vet=ordem.geradorAleatorio(10, 10);
        System.out.println(ordem.exibirVetor(vet));
        vet=ordem.BubbleSort(vet);
        System.out.println(ordem.exibirVetor(vet));

        int[] vet1= ordem.geradorAleatorio(10, 100);
        System.out.println(ordem.exibirVetor(vet1));
        vet1=ordem.InsertionSort(vet1);
        System.out.println(ordem.exibirVetor(vet1));
        vet1=ordem.InsertionSortDecrescente(vet1);
        System.out.println(ordem.exibirVetor(vet1));


    }

}
