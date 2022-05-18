import javax.swing.JOptionPane;

public class ex4c11 {
    public static void main(String[] args) {
        String msg = "Analisa de Multas", nomeVelho = "";
        String[] sexo = {"Masculino", "Feminino"};
        int contador = 0, contHomens = 0, mulherSete = 0, idadeVelho = 0;
        double multaTotal = 0, mediaIdade = 0, percentual;
        JOptionPane.showMessageDialog(null, "Vamos fazer uma an�lise de multas de tr�nsito de 230 pessoas!", msg,
                JOptionPane.INFORMATION_MESSAGE);
        while (contador != 230) {
            contador++;
            String nome = JOptionPane.showInputDialog(null, "Digite o nome do condutor penalizado: ", msg,
                    JOptionPane.QUESTION_MESSAGE);
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade de " + nome + ": ", msg,
                    JOptionPane.QUESTION_MESSAGE));
            int opcoes = JOptionPane.showOptionDialog(null, "Qual o Sexo de " + nome + "?", msg,
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, sexo, sexo[0]);
            int pontos = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Qual foi a quantidade de pontos perdidos por " + nome + ": ", msg, JOptionPane.QUESTION_MESSAGE));
            double multa = Double.valueOf(JOptionPane.showInputDialog(null, "Digite a multa de " + nome + ": ", msg,
                    JOptionPane.QUESTION_MESSAGE));
            multaTotal += multa;
            mediaIdade += idade;
            switch (opcoes) {
                case 0:
                    contHomens++;
                    break;
                case 1:
                    if (pontos == 7) {
                        mulherSete++;
                    }
                    break;
            }
            if (contador == 1 || idadeVelho < idade) {
                idadeVelho = idade;
                nomeVelho = nome;
            }
        }
        mediaIdade /= contador;
        percentual = (contHomens * 100) / contador;
        JOptionPane.showMessageDialog(null, "Idade m�dia � de " + mediaIdade, msg, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Valor total das multa aplicadas foi de: R$" + multaTotal, msg,
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Percentual de homens multados " + percentual, msg,
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Quantidade de mulheres que perderam 7 pontos na carteira: " + mulherSete,
                msg, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, nomeVelho + " com " + idadeVelho + " foi a pessoa mais velha!", msg,
                JOptionPane.INFORMATION_MESSAGE);
    }
}
