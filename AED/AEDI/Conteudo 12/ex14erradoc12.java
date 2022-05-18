import java.util.*;

public class ex14erradoc12 {
    public static void main(String[] args) {
        String city[][] = new String[10][3], bolha;
        int conta = 10, contar = 0;
        /*Scanner keyb = new Scanner(System.in);
         for (int cont = 0; cont < city.length; cont++) {
            System.out.println("Digite o nome da cidade: ");
            city[cont][0] = keyb.nextLine();
            System.out.println("Digite de que estado a cidade " + city[cont][0] + ", é:");
            city[cont][1] = keyb.nextLine();
            System.out.println("Digite a população da cidade " + city[cont][0] + ": ");
            city[cont][2] = keyb.nextLine();
        }*/
        Scanner keyb = new Scanner(ex14erradoc12.class.getResourceAsStream("cidades.txt"));
        while (keyb.hasNextLine()) {
            city[contar][0] = keyb.nextLine();
            city[contar][1] = keyb.nextLine();
            city[contar][2] = keyb.nextLine();
            contar++;
        }
        for (int cont = 0; city.length > cont; cont++) {
            for (int contador = 0; city.length > contador; contador++) {
                if (Integer.parseInt(city[contador][2]) > Integer.parseInt(city[contador + 1][2])) {
                    bolha = city[contador][2];
                    city[contador][2] = city[contador + 1][2];
                    city[contador + 1][2] = bolha;
                }
            }
        }
        for (int aux = city.length; aux > (city.length - 10); aux--) {
            System.out.println(conta + ". " + city[aux][0] + " - " + city[aux][1] + ". População: " + city[aux][2]);
            conta--;
        }
        keyb.close();
    }
}
