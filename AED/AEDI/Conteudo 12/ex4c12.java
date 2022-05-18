import javax.swing.JOptionPane;

public class ex4c12 {
    public static void main(String[] args) {
        String msg = "Criador de quadrado";
        int array[] = new int[10];
        double quadrado;
        JOptionPane.showMessageDialog(null, "Vamos te dar o valor ao quadrado de 10 valores seus!");
        for (int cont = 0; 9 >= cont; cont++) {
            array[cont] = Integer.parseInt(JOptionPane.showInputDialog(null,
                    cont + ". Digite o valor:", msg, JOptionPane.INFORMATION_MESSAGE));
        }
        for (int cont = 0; 9 >= cont; cont++) {
            quadrado = Math.pow(array[cont], 2);
            JOptionPane.showMessageDialog(null, "O quadrado de " + array[cont]
                    + " = " + quadrado, msg, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
