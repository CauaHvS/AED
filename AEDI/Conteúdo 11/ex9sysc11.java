import java.util.Scanner;

public class ex9sysc11 {
    public static void main(String[] args) {
        int ano, setor, quantGer = 0, quantAdm = 0, quantPes = 0, quantObr = 0, quantAdmDez = 0,
                menorRg = 0, contador = 0, rg, maiorRg = 0, registro;
        String nome = "", maiorSetor, maisAnt = "", maisNovo = "", rge;
        Scanner arc = new Scanner(ex9sysc11.class.getResourceAsStream("ex9sysc11.txt"));
        while (arc.hasNextLine()) {
            contador++;
            nome = arc.nextLine();
            rge = arc.nextLine();
            registro = Integer.parseInt(rge);
            ano = registro / 10000;
            setor = (registro / 1000) % 10;
            rg = registro - (setor * 1000);
            if (ano > 14 || ano < 10 || setor > 4 || setor < 1) {
                System.out.println("O senhor(a) " + nome + ", tem o Registro Inválido!");
                continue;
            }
            if (contador == 1) {
                menorRg = rg;
                maiorRg = rg;
            }
            if (rg >= maiorRg) {
                maiorRg = rg;
                maisNovo = nome;
            }
            if (rg <= menorRg) {
                menorRg = rg;
                maisAnt = nome;
            }
            switch (setor) {
                case 1:
                    quantGer++;
                    break;
                case 2:
                    quantAdm++;
                    if (ano == 10) {
                        quantAdmDez++;
                    }
                    break;
                case 3:
                    quantPes++;
                    break;
                case 4:
                    quantObr++;
                    break;
            }
        }
        if (quantAdm > quantGer && quantAdm > quantPes && quantAdm > quantObr) {
            maiorSetor = "Administração";
        } else if (quantGer > quantPes && quantGer > quantObr) {
            maiorSetor = "Gerência";
        } else if (quantPes > quantObr) {
            maiorSetor = "Pesquisa";
        } else {
            maiorSetor = "Obras";
        }
        System.out.printf("\nQuantidade de funcionários por setor:" +
                        "\n[1]Gerência: %d \n[2]Administração: %d \n[3]Pesquisa: %d \n[4]Obras: %d", quantGer,
                quantAdm, quantPes, quantObr);
        System.out.printf("\nQuantidade de funcionários que foram admitidos em 2010 e trabalham " +
                "na Administração: %d", quantAdmDez);
        System.out.printf("\nO Maior setor foi: %s", maiorSetor);
        System.out.printf("\nO Funcionário mais antigo: %s \nO Funcionário mais novo: %s", maisAnt, maisNovo);
        arc.close();
    }
}
