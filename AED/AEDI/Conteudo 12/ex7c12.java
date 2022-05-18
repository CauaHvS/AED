import javax.swing.JOptionPane;

public class ex7c12 {
    public static void main(String[] args) {
        String nomeNota[][] = new String[50][2], msg = "Notas! ";
        JOptionPane.showMessageDialog(null, "Vamos te dar a relação dos 50 alunos");
        for (int cont = 0; nomeNota.length > cont; cont++) {
            nomeNota[cont][0] = JOptionPane.showInputDialog(null,
                    "Digite o nome do aluno: ", msg, JOptionPane.QUESTION_MESSAGE);
            int nota = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Qual a nota do aluno(a) " + nomeNota[cont][0], msg, JOptionPane.QUESTION_MESSAGE));
            if (nota <= 30) {
                nomeNota[cont][1] = "D";
            } else if (nota <= 60) {
                nomeNota[cont][1] = "C";
            } else if (nota <= 80) {
                nomeNota[cont][1] = "B";
            } else {
                nomeNota[cont][1] = "A";
            }
        }
        for (int cont = 0; cont < nomeNota.length; cont++) {
            for (int contador = 0; nomeNota[contador].length > contador; contador++) {
                JOptionPane.showMessageDialog(null, nomeNota[cont][contador],
                        msg, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
