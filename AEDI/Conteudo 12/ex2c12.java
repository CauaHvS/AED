import javax.swing.JOptionPane;

public class ex2c12 {
    public static void main(String[] args) {
        String msg = "Brincando com array";
        int array[] = new int[10];
        JOptionPane.showMessageDialog(null, "Vamos usar array bitch! para valores " +
                "entre 5 e 10: digite ai!");
        for (int cont = 0; 9 >= cont; cont++) {
            array[cont] = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite um número:", msg, JOptionPane.QUESTION_MESSAGE));
        }
        for (int cont = 9; cont >= 0; cont--) {
            if (array[cont] > 5 && 10 > array[cont]) {
                JOptionPane.showMessageDialog(null, "O número: " + array[cont]
                        + " esta entre 5 e 10!", msg, JOptionPane.INFORMATION_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "FIM!", msg, JOptionPane.INFORMATION_MESSAGE);
    }
}
