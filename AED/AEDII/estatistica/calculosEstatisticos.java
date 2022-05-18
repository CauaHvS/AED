package estatistica;

import java.util.Arrays;

public class calculosEstatisticos {
    public Double Media(double[] valor) {
        return Soma(valor) / valor.length;
    }

    public Double Soma(double[] valor) {
        Double soma = 0.0;
        for (int i = 0; i < valor.length; i++) {
            soma += valor[i];
        }
        return soma;
    }

    public Double Mediana(double[] valor, int cont) {
        double x = 0;
        if (cont % 2 == 1) {
            x = valor[((cont + 1) / 2) - 1];
        } else {
            x = (valor[cont / 2 - 1] + valor[cont / 2]) / 2;
        }
        return (x);

    }

    public Double DesvioPadrao(double[] valor) {
        Double media = Media(valor);
        int tam = valor.length;
        Double variancia1 = 0D;
        for (Double vlr : valor) {
            Double aux = vlr - media;
            variancia1 = variancia(aux);
        }

        return Math.sqrt(variancia1 / (tam - 1));
    }

    public Double variancia(double aux) {
        Double variancia = 0.0;
        variancia += aux * aux;
        return (variancia);
    }

    public Double Moda(double[] valor, int cont) {
        double maxValue = 0, maxCount = 0;
        int i, j;
        for (i = 0; i < cont; ++i) {
            int count = 0;
            for (j = 0; j < cont; ++j) {
                if (valor[j] == valor[i])
                    ++count;
            }

            if (count > maxCount) {
                maxCount = count;
                maxValue = valor[i];
            }
        }
        return (maxValue);
    }

    /*public double Mediana(double[] valor) {
        // sort array
        Arrays.sort(valor);
        double mediana;
        // get count of scores
        int totalElements = valor.length;
        // check if total number of scores is even
        if (totalElements % 2 == 0) {
            int sumOfMiddleElements = (int) (valor[totalElements / 2] + valor[totalElements / 2 - 1]);
            // calculate average of middle elements
            mediana = ((double) sumOfMiddleElements) / 2;
        } else {
            // get the middle element
            mediana = (double) valor[valor.length / 2];
        }
        return (mediana);
    }*/

}
