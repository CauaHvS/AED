import java.util.*;

public class ex14v20c12 {
    public static void main(String[] args) {
        String city[][] = new String[10][3], bolha[][] = new String[1][3];
        int contador = 0;
        Scanner keyb = new Scanner(ex14v20c12.class.getResourceAsStream("cidades.txt"));
        while (keyb.hasNextLine()) {
            city[contador][0] = keyb.nextLine();
            city[contador][1] = keyb.nextLine();
            city[contador][2] = keyb.nextLine();
            contador++;
        }
        for (int cont = 0; cont < city.length - 1; cont++) {
            if (Integer.parseInt(city[contador][2]) > Integer.parseInt(city[contador + 1][2])) {
                for (int aux = 0; aux < 3; aux++) {
                    bolha[0][aux] = city[contador + 1][aux];
                    city[contador + 1][aux] = city[contador][aux];
                    city[contador][aux] = bolha[0][aux];
                }
            }
        }
        for (int cont = city.length - 1; cont >= 0; cont--) {
            System.out.println(city[cont][0] + " - " + city[cont][1] + " = " + city[cont][2]);
        }
        keyb.close();
    }
}
