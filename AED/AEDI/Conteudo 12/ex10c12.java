import javax.swing.JOptionPane;

public class ex10c12 {
    public static void main(String[] args) {
        String msg = "Notas dos alunos!", aluno[][] = new String[50][2];
        double somador = 0, media;
        JOptionPane.showMessageDialog(null, "Vamos te passar quais dos alunos estão " +
                "acima da média da turma", msg, JOptionPane.INFORMATION_MESSAGE);
        for (int cont = 0; aluno.length > cont; cont++) {
            aluno[cont][0] = JOptionPane.showInputDialog(null, "Digite o nome do aluno(a): ",
                    msg, JOptionPane.QUESTION_MESSAGE);
            aluno[cont][1] = JOptionPane.showInputDialog(null, "Digite a nota de: "
                    + aluno[cont][0], msg, JOptionPane.INFORMATION_MESSAGE);
            somador += Integer.parseInt(aluno[cont][1]);
        }
        media = somador / aluno.length;
        JOptionPane.showMessageDialog(null, "A média foi: " + media + " !",
                msg, JOptionPane.INFORMATION_MESSAGE);
        for (int cont = 0; aluno.length > cont; cont++) {
            if (Integer.parseInt(aluno[cont][1]) >= media) {
                JOptionPane.showMessageDialog(null, "Alunos aprovados: "
                        + aluno[cont][0], msg, JOptionPane.INFORMATION_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "FIM!", msg, JOptionPane.INFORMATION_MESSAGE);
    }
}
