import javax.swing.JOptionPane;

public class ex2c11 {
    public static void main(String[] args) {
        String status = "", msg = "Analista de Clientes", nomeMenor = "";
        int bronze = 0, prata = 0, ouro = 0, contador = 0;
        double mediaBronze, somadorBronze = 0, totalAplicacao = 0, menorAplicacao = 0;
        JOptionPane.showMessageDialog(null, "Vamos analisar os 538 clientes da sua empresa!", msg,
                JOptionPane.INFORMATION_MESSAGE);
        while (contador != 5) {
            contador++;
            String nome = JOptionPane.showInputDialog(null, "Qual o nome do cliente? ", msg,
                    JOptionPane.QUESTION_MESSAGE);
            double valorAplicado = Double.valueOf(JOptionPane.showInputDialog(null,
                    "Digite o valor aplicado do cliente " + nome + ": ", msg, JOptionPane.QUESTION_MESSAGE));
            if (1000 >= valorAplicado) {
                status = "Bronze";
                bronze += 1;
                somadorBronze += valorAplicado;
            } else if (5000 >= valorAplicado) {
                status = "Prata";
                prata += 1;
            } else {
                status = "Ouro";
                ouro += 1;
            }
            JOptionPane.showMessageDialog(null, "O Status do cliente " + nome + ", � " + status + " !", msg,
                    JOptionPane.INFORMATION_MESSAGE);
            totalAplicacao += valorAplicado;
            if (contador == 1 || menorAplicacao > valorAplicado) {
                menorAplicacao = valorAplicado;
                nomeMenor = nome;
            }
        }
        mediaBronze = somadorBronze / bronze;
        JOptionPane.showMessageDialog(null,
                "Quantidades de clientes: \nBronze: " + bronze + "\nPrata: " + prata + "\nOuro: " + ouro, msg,
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "A m�dia dos valores aplicados dos clientes bronzes foi de: " + mediaBronze,
                msg, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "O Volume total de aplica��es foi de: R$" + totalAplicacao, msg,
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "O Cliente com menor aplica��o foi " + nomeMenor, msg,
                JOptionPane.INFORMATION_MESSAGE);
    }
}
