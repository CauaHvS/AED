package estatistica;

import java.util.*;

class estatisticaMain {
    private static Scanner sc;


    public static void main(String[] args) {
        sc = new Scanner(System.in);

        String vetString;

        int dados, cont = 0;
        double max = 0, A = 0, a = 0, Xi = 0, p = 0;
        double K = 0, x = 0;
        double[] ordem, limiteSuperior = new double[0], limiteInferior = new double[0];

//*Entrada de dados*//
        System.out.println("Informe a Quantidade de dados:");
        dados = sc.nextInt();
        double[] vet = new double[dados];
        int[] contador = new int[cont];

        System.out.println("Informe o Dado:");

        for (int i = 0; i <= dados - 1; i++) {
            double val = sc.nextDouble();
            vet[i] = val;
        }
        /* Ordena��o dos dados(ROL) */
        System.out.println();
        ordem = BubbleSort(vet);
        vetString = Arrays.toString(ordem);
        System.out.println(vetString);

        /* Calculando A,K,a */
        max = vet.length;
        A = vet[(int) max - 1] - vet[0];
        K = Math.sqrt(dados);
        a = A / K;
        Xi = ordem[0] + (a / 2);
        System.out.println(K);

        System.out.println(a);

        /* Calculos tabela */

        Object faixa[] = new Object[(int) K];
        for (int i = 0; i < K; i++) {
            x = vet[(int) (i * K)];
            System.out.println(i + " " + K + " " + (i * K));
            if (i == (K - 1)) {
                faixa[i] = vet[(int) (i * K)] + "|---|" + (vet[vet.length - 1]);
                limiteInferior[i] = vet[(int) (i * K)];
                limiteSuperior[i]  = vet[vet.length - 1];
            } else {
                faixa[i] = vet[(int) (i * K)] + "|---" + vet[(int) ((i * K) + K)];
                contador[i] = cont++;
                limiteInferior[i] = vet[(int) (i * K)];
                limiteSuperior[i]  = vet[vet.length - 1];
            }
        }
        int[] frequencia = new int[limiteSuperior.length];
        for (int i = 0; i < limiteSuperior.length; i++){
            cont = 0;
            for(int j = 0; j < vet.length; j++){
                if(vet[j] >= limiteInferior[i] && vet[j] < limiteSuperior[i]){
                    cont++;
                }
            }
            frequencia[i] = cont;
        }

        System.out.println(Arrays.toString(faixa));
        System.out.println(Arrays.toString(contador));
        System.out.println(Arrays.toString(frequencia));

        /* TableExample.Table(faixa, K); */
        /*
         * double desv = calculosEstatisticos.DesvioPadrao(vet);
         * System.out.println(desv);
         */
        /* constru��o da tabela */
    }

    static double[] BubbleSort(double[] vet) {
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    double aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
        return (vet);
    }

}