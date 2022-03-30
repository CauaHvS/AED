import javax.swing.JOptionPane;

public class ex24c12 {
    public static void main(String[] args) {
        int[][] numeros = new int[10][2];
        int conta = 0;
        String msg = "Divisores de 3";
        JOptionPane.showMessageDialog(null, "Vamos anotar 10 números e desses 10 vamos te " +
                "dizer os divisores de 3.", msg, JOptionPane.INFORMATION_MESSAGE);
        for (int cont = 0; cont < numeros.length; cont++) {
            numeros[cont][0] = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite um número: ", msg, JOptionPane.QUESTION_MESSAGE));
        }
        for (int aux = 0; aux < numeros.length; aux++) {
            if (numeros[aux][0] % 3 == 0) {
                numeros[conta][1] = numeros[aux][0];
                conta++;
            }
        }
        for (int contador = 0; contador < numeros.length; contador++) {
            System.out.print(numeros[contador][1] + " ");
        }
    }
}
