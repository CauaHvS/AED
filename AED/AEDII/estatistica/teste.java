package estatistica;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class teste {
    private static Scanner sc;
    private static calculosEstatisticos ce;

    public static void main(String[] args) {
        ce = new calculosEstatisticos();
        sc = new Scanner(System.in);
        String dados;
        double[] ordem;
        int cont = 0;
        Double soma, media, mediana, moda, variancia, desvioPadrao, cV;
        double max = 0, A = 0, a = 0, Xi = 0, p = 0, K;

        System.out.println(">>>>> INFORME OS DADOS SEPARADOS POR UM ESPAÇO <<<<<");
        System.out.println("Informe todos os Dados:");
        dados = sc.nextLine();

        String[] arrayString = dados.split(" ");
        for (String s : arrayString) {
            cont++;
        }

        System.out.println(cont);
        double[] arrayDouble = Arrays.stream(arrayString).mapToDouble(Double::parseDouble).toArray();
        System.out.println(Arrays.toString(arrayDouble));
        ordem = BubbleSort(arrayDouble);
        System.out.println(Arrays.toString(ordem));
        /* Calculando A, K, a */
        max = arrayDouble.length;
        A = arrayDouble[(int) (max - 1)] - arrayDouble[0];
        K = Math.sqrt(cont);
        a = A / K;
        Xi = ordem[0] + (a / 2);
        /* Mï¿½dia, Mediana, Moda, Variï¿½ncia, Desvio padrï¿½o, Coeficiente de variaï¿½ï¿½o */

        soma = ce.Soma(arrayDouble);
        media = ce.Media(arrayDouble);
        System.out.println("Media: " + media);
        mediana = ce.Mediana(arrayDouble, cont);
        System.out.println("Mediana: " + mediana);
        moda = ce.Moda(arrayDouble, cont);
        System.out.println("Moda: " + moda);
        variancia = ce.variancia(a);
        System.out.println("Variancia: " + variancia);
    }

    static double[] BubbleSort(double[] arrayDouble) {
        for (int i = 0; i < arrayDouble.length; i++) {
            for (int j = 0; j < arrayDouble.length - 1; j++) {
                if (arrayDouble[j] > arrayDouble[j + 1]) {
                    double aux = arrayDouble[j];
                    arrayDouble[j] = arrayDouble[j + 1];
                    arrayDouble[j + 1] = aux;
                }
            }
        }
        return (arrayDouble);
    }

}