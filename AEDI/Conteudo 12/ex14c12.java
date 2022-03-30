
import java.util.Scanner;

public class ex14c12 {
    public static void main(String[] args) {
        String cidade[] = new String[10], estado[] = new String[10], bolhaCid, bolhaEst;
        int populacao[] = new int[10], contador = 0, bolhaPop;
        Scanner keyb = new Scanner(ex14txtc12.class.getResourceAsStream("cidades.txt"));
        while (keyb.hasNextLine()) {
            cidade[contador] = keyb.nextLine();
            estado[contador] = keyb.nextLine();
            populacao[contador] = Integer.parseInt(keyb.nextLine());
            contador++;
        }
        for (int aux = 0; aux < populacao.length; aux++) {
            for (contador = 0; contador < populacao.length - 1; contador++) {
                if (populacao[contador] > populacao[contador + 1]) {
                    bolhaPop = populacao[contador + 1];
                    bolhaCid = cidade[contador + 1];
                    bolhaEst = estado[contador + 1];
                    populacao[contador + 1] = populacao[contador];
                    estado[contador + 1] = estado[contador];
                    cidade[contador + 1] = cidade[contador];
                    populacao[contador] = bolhaPop;
                    cidade[contador] = bolhaCid;
                    estado[contador] = bolhaEst;
                }
            }
        }
        System.out.println(" ");
        for (int cont = cidade.length - 1; cont >= 0; cont--) {
            System.out.println(cidade[cont] + " - " + estado[cont] + " = " + populacao[cont]);
        }
        keyb.close();
    }
}