import javax.swing.JOptionPane;

public class ex17c12 {
    public static void main(String[] args) {
        String msg = "Array inversa!";
        int[] array1 = new int[10], array2 = new int[10];
        JOptionPane.showMessageDialog(null, "Digite 10 números e vamos dar o inverso deles!"
                , msg, JOptionPane.INFORMATION_MESSAGE);
        for (int aux = 0; aux < array1.length; aux++) {
            array1[aux] = Integer.parseInt(JOptionPane.showInputDialog(null,
                    aux + ". Digite o número:", msg, JOptionPane.INFORMATION_MESSAGE));
        }
        for (int cont = array1.length - 1; cont >= 0; cont--) {
            array2[cont] = array1[cont];
            JOptionPane.showMessageDialog(null, array2[cont], msg, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
