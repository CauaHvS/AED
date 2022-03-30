import java.util.Scanner;

public class ex7c11 {
    public static void main(String[] args) {
        int dias = 0;
        double media, temperatura, diasTemp = 0, maiorTemp = 0, menorTemp = 0, somaTemp = 0;
        Scanner keyb = new Scanner(System.in);
        while (dias != 5) {
            dias++;
            System.out.println("Qual foi a temperatura registrada no dia "  +dias +" ? ");
            temperatura = keyb.nextInt();
            if (temperatura > maiorTemp) {
                diasTemp = 0;
            }
            somaTemp += temperatura;
            if (dias == 1) {
                menorTemp = temperatura;
                maiorTemp = temperatura;
            } else if (temperatura >= maiorTemp) {
                maiorTemp = temperatura;
                diasTemp++;
            } else if (menorTemp > temperatura) {
                menorTemp = temperatura;
            }
        }
        media = somaTemp / dias;
        System.out.println("A menor temperatura registrada foi: " + menorTemp);
        System.out.println("A maior temperatura registrada foi: " + maiorTemp);
        System.out.println("A média das temperaturas registradas foi: " + media);
        System.out.println("Quantidade de dias que ocorreram a maior temperatura foi: " + diasTemp);
        keyb.close();
    }
}
