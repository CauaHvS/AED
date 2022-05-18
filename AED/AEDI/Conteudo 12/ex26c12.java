import java.util.*;

public class ex26c12 {
    public static void main(String[] args) {
        String frase;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        frase = keyb.nextLine();
        String[] palavras = frase.split(" ");
        for (int aux = 0; aux < palavras.length; aux++) {
            palavras[aux] = palavras[aux].substring(0, 1).toUpperCase() + palavras[aux].substring(1);
            System.out.println(palavras[aux]);
        }
        keyb.close();
    }
}
