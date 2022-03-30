import javax.swing.JOptionPane;

public class ex9c11 {
    public static void main(String[] args) {
        int ano, setor, quantGer = 0, quantAdm = 0, quantPes = 0, quantObr = 0, quantAdmDez = 0,
                menorRg = 0, contador = 0, rg, maiorRg = 0;
        String nome = "", msg = "Registro Funcional", maiorSetor, maisAnt = "", maisNovo = "";
        while (!nome.equalsIgnoreCase("FIM")) {
            nome = JOptionPane.showInputDialog(null,
                    "Digite o nome do funcionário: ('FIM') para encerrar",
                    msg, JOptionPane.QUESTION_MESSAGE);
            if (nome.equalsIgnoreCase("FIM")) {
                break;
            }
            contador++;
            int registro = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite o registro de " + nome + ":",
                    msg, JOptionPane.QUESTION_MESSAGE));
            ano = registro / 10000;
            setor = (registro / 1000) % 10;
            rg = registro - (setor * 1000);
            if (ano > 14 || ano < 10 || setor > 4 || setor < 1) {
                JOptionPane.showMessageDialog(null, "REGISTRO INVÁLIDO",
                        msg, JOptionPane.QUESTION_MESSAGE);
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
        JOptionPane.showMessageDialog(null,
                "Quantidade de funcionários por setor: \n[1]Gerência: " + quantGer
                        + "\n[2]Administração: " + quantAdm + "\n[3]Pesquisa: " + quantPes
                        + "\n[4]Obras: " + quantObr,
                msg, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Quantidade de funcionários " +
                        "que foram admitidos em 2010 e trabalham na Administração: " + quantAdmDez,
                msg, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "O Maior setor foi: " + maiorSetor,
                msg, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "O último(a) funcionário(a) foi: " + maisNovo
                + "\ne o funcionário(a) mais velho(a) foi: " + maisAnt, msg, JOptionPane.INFORMATION_MESSAGE);
    }

}
