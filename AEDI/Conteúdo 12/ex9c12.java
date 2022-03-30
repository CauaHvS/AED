import javax.swing.JOptionPane;

public class ex9c12 {
    public static void main(String[] args) {
        String msg = "Divisores comum!";
        int array[] = new int[10];
        double divisor, somador = 0;
        JOptionPane.showMessageDialog(null, "Vamos calcular 10 números inteiros, vamo fazer " +
                "a soma, e achar os divisores comuns da soma entre os 10 números!", msg, JOptionPane.INFORMATION_MESSAGE);
        for (int contador = 0; array.length > contador; contador++) {
            array[contador] = Integer.parseInt(JOptionPane.showInputDialog(null, (contador + 1)
                    + ". digite o valor:", msg, JOptionPane.QUESTION_MESSAGE));
            somador += array[contador];
        }
        for (int contador = 0; array.length > contador; contador++) {
            divisor = somador % array[contador];
            if (divisor == 0) {
                JOptionPane.showMessageDialog(null, array[contador], msg, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}

