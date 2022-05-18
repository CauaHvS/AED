import java.util.Scanner;

public class ex8c11 {
    public static void main(String[] args) {
        String nome = "", funcao, nomeMaior = "", funcaoMaior = "";
        int contador = 0, premioMil = 0, premioDez = 0, premioCem = 0;
        double horasTrabalh, premioProd = 0, horasTotal = 0, media, maiorSal = 0, folhPag = 0;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Vamos fazer uma automatização da folha de pagamento do projeto!");
        System.out.println("Digite o total de horas trabalhadas nos projeto: ");
        horasTotal = keyb.nextInt();

        // Estrutura de Repetição

        while (!nome.equalsIgnoreCase("Encerrar")) {

            // Entrada de Dados

            keyb.nextLine();
            System.out.println("Digite o nome do trabalhador: ('Encerrar' para encerrar)");
            nome = keyb.nextLine();
            if (nome.equalsIgnoreCase("Encerrar")) { // Flag
                break;
            }
            System.out.println("Qual era função de, " + nome + " ? ");
            funcao = keyb.nextLine();
            System.out.println("Qual foi a quantidade de horas trabalhadas por " + nome + ", ? ");
            horasTrabalh = keyb.nextDouble();

            // Contas

            contador += 1;
            horasTotal += horasTrabalh;
            if (100 >= horasTrabalh) {
                premioProd = 1000;
                premioMil++;
            } else if (horasTrabalh >= 500) {
                premioProd = (horasTrabalh / 10) * 100;
                premioDez++;
            } else {
                premioProd = horasTrabalh * 10;
                premioCem++;
            }
            if (contador == 1 || maiorSal > premioProd) {
                maiorSal = premioProd;
                nomeMaior = nome;
                funcaoMaior = funcao;
            }
            folhPag += premioProd;

            System.out.println("O " + nome + ", na função de " + funcao + ", tem que receber: R$" + premioProd);

        }
        media = horasTotal / contador;

        // Saida de Dados

        System.out.println("A média de horas trabalhadas por pessoa no projeto: " + media);
        System.out.println("O funcionário " + nomeMaior + ", na função de " + funcaoMaior + " teve o maior salário!");
        System.out.println("Total de prêmio por produtividade \nR$1.000: " + premioMil + "\nR$10 por hora: " + premioDez
                + "\nR$100 por cada 10h completas: " + premioCem);
        System.out.printf("A folha de pagamento total foi de: R$%6.2f", folhPag);
        keyb.close();
    }
}
