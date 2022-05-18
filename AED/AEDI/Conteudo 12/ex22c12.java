import javax.swing.JOptionPane;

public class ex22c12 {
    public static void main(String[] args) {
        int[] numeros = new int[20], organizados = new int[20];
        String msg = "Exercício 21, Conteúdo 12";
        JOptionPane.showMessageDialog(null, "Vamos armazenar 20 números!",
                msg, JOptionPane.INFORMATION_MESSAGE);
        for (int aux = 0; aux < numeros.length; aux++) {
            numeros[aux] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número: ", msg, JOptionPane.QUESTION_MESSAGE));
        }
        for (int cont = 0; cont < numeros.length; cont++) {
            if (cont % 2 == 0) {
                organizados[cont / 2] = numeros[cont];
            } else {
                organizados[cont / 2 + 10] = numeros[cont];
            }
        }
        for (int print : organizados) {
            System.out.print(print + " ");
        }
    }
}
