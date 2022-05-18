import java.util.Scanner;

public class ex10c13 {
    public static void main(String[] args) {
        String frase;
        Scanner keyb = new Scanner(System.in);
        do {
            System.out.println("Digite o seu nome ('fim' para encerrar): ");
            frase = keyb.nextLine();
            if (!frase.equalsIgnoreCase("fim")) {
                for (int cont = 0; cont < frase.length(); cont++) {
                    System.out.println(frase.charAt(cont));
                }

                System.out.println("");

                            //Outro método

                String[] index = frase.split("");
                for(int cont = 0; cont < index.length; cont++){
                    System.out.println(index[cont]);
                }
            }
        } while (!frase.equalsIgnoreCase("fim"));
        keyb.close();
    }
}