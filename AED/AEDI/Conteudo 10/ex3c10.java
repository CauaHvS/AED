import javax.swing.JOptionPane;

public class ex3c10 {
    public static void main(String[] args) {
        String msg = "Calculador da �rea do setor circular!";
        double setor, raio = 0;
        double angulo = Double.valueOf(
                JOptionPane.showInputDialog(null, "Digite o valor do �ngulo: ", msg, JOptionPane.QUESTION_MESSAGE));
        do {
            raio = Double.valueOf(JOptionPane.showInputDialog(null, "Digite o valor do raio para " + angulo + ": ", msg,
                    JOptionPane.INFORMATION_MESSAGE));
            if (raio != -1) {
                setor = (angulo * 3.1416 * Math.pow(raio, 2)) / 360f;
                JOptionPane.showMessageDialog(null, "O valor do setor foi de: " + setor, msg,
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } while (raio != -1);
        JOptionPane.showMessageDialog(null, "FIM", msg, JOptionPane.INFORMATION_MESSAGE);
    }
}
