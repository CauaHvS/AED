import java.util.Scanner;

public class ex4c10 {
    public static void main(String[] args) {
        String nome;
        double bdi, custoTotal = 0, precoUnidade, bdiCusto;
        int unidades;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Qual a taxa de BDI (Bonifica��o e Despesas Indiretas): ");
        bdi = keyb.nextInt();
        do {
            keyb.nextLine();
            System.out.println("Digite o nome do material: ");
            nome = keyb.nextLine();
            if (!(nome.equalsIgnoreCase("fim"))) {
                System.out.println("Quantas unidades de " + nome + "? ");
                unidades = keyb.nextInt();
                System.out.println("Qual o pre�o unit�rio de " + nome + "? ");
                precoUnidade = keyb.nextDouble();
                custoTotal += (precoUnidade * unidades);
                System.out.println("Pre�o: R$" + (unidades * precoUnidade));
            }
        } while (!(nome.equalsIgnoreCase("fim")));
        System.out.println("O Pre�o total foi " + custoTotal);
        bdiCusto = custoTotal * (bdi / 100);
        System.out.println("BDI foi (" + bdi + " de " + custoTotal + ") �: " + bdiCusto);
        System.out.println("Pre�o final foi: R$" + (bdiCusto + custoTotal));
        System.out.println("FIM!");
        keyb.close();
    }
}

