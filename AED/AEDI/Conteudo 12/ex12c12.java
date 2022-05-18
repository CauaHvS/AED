import javax.swing.JOptionPane;

public class ex12c12 {
    public static void main(String[] args) {
        String nomeNota[][] = new String[8][2], maiorNome[] = new String[8],
                msg = "Relação das notas!";
        double maiorNota;
        JOptionPane.showMessageDialog(null, "Vamos falar quais alunos tiraram " +
                "a maior nota!", msg, JOptionPane.INFORMATION_MESSAGE);
        for (int contador = 0; nomeNota.length > contador; contador++) {
            nomeNota[contador][0] = JOptionPane.showInputDialog(null,
                    "Digite o nome do aluno: ", msg, JOptionPane.QUESTION_MESSAGE);
            nomeNota[contador][1] = JOptionPane.showInputDialog(null,
                    "Digite a nota de " + nomeNota[contador][0] + ":", msg, JOptionPane.QUESTION_MESSAGE);
        }
        maiorNota = Double.valueOf(nomeNota[0][1]);
        for (int contador = 0; nomeNota.length > contador; contador++) {
            if (Double.valueOf(nomeNota[contador][1]) > maiorNota) {
                maiorNota = Double.valueOf(nomeNota[contador][1]);
                maiorNome[0] = nomeNota[contador][0];
            } else if (Double.valueOf(nomeNota[contador][1]) == maiorNota){
                maiorNome[contador] = nomeNota[contador][0];
            }
        }
        for (int contador = 0; maiorNome.length > contador; contador++) {
            if (maiorNome[contador] != null) {
                JOptionPane.showMessageDialog(null, maiorNome[contador],
                        msg, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
