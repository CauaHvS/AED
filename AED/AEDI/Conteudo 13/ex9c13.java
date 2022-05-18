import java.util.Scanner;

public class ex9c13 {
    public static void main(String[] args) {
        String frases;
        Scanner keyb = new Scanner(System.in);
        do {
            System.out.println("Digite uma frase ('fim' para encerrar): ");
            frases = keyb.nextLine();
            if (!frases.equalsIgnoreCase("fim"))
                System.out.println(capitalize(frases));
        } while (!frases.equalsIgnoreCase("fim"));
        System.out.println("Programa encerrado!");
        keyb.close();
    }

    public static String capitalize(String frases) {
        int index;                  //Criação do index
        frases += " ";              //Frase ganha espaço no final
        String maisIgual = "";      //Vou dividir a frase em palavras e capitalizar elas
        for (int cont = 0; cont < frases.length() - 2; cont++) { //Contador vai até antes do espaço adicionado
            index = frases.indexOf(" "); //Indexamos o espaço atual
            if (cont == 0) {
                maisIgual = frases.substring(cont, cont + 1).toUpperCase() +
                        frases.substring(cont + 1, index);                             //Primeira palavra tem primeira letra maiuscula
            } else if (frases.charAt(cont) == ' ') {
                maisIgual += " " + frases.substring(index + 1, index + 2).toUpperCase(); //Espaço para separar palavras, a primeira posição depois do espaço vira maiuscula
                frases = frases.replaceFirst(" ", "-");             //Trocamos espaço para traço, pois o index só mostra o primeiro espaço.
                maisIgual += frases.substring(index + 2, frases.indexOf(" ")).toLowerCase(); //agora adicionamos o resto da palavra. onde começa no index+2 e termina no prox index.
            }
        }
        return maisIgual;
    }
}
