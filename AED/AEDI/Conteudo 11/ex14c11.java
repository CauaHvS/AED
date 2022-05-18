public class ex14c11 {
    public static void main(String[] args) {
        double pi = 0, cont = 1, contador = 0;
        while (cont != 0) {
            contador++;
            System.out.println(contador);
            if (contador % 2 == 0) {
                pi -= 1 / cont;
            } else {
                pi += 1 / cont;
            }
            cont += 2;
            if (pi * 4 > 3.1416 && pi * 4 < 3.1417) {
                break;
            }
        }
        System.out.println("O número de termos foi: " + contador);
        pi *= 4;
        System.out.println("O valor de pi foi: " + pi);
    }
}
