import javax.swing.JOptionPane;

public class ex15c12 {
    public static void main(String[] args) {
        String msg = "Média dos números pares";
        int[] numeros = new int[10], par = new int[10];
        int somador = 0, num = 0;
        double media;
        JOptionPane.showMessageDialog(null, "Você vai nos informar 10 números inteiros e positivos" +
                ", e desses vamos falar quais são pares e a média deles!", msg, JOptionPane.INFORMATION_MESSAGE);
        for (int contador = 0; contador < numeros.length; contador++) {
            numeros[contador] = Integer.parseInt(JOptionPane.showInputDialog(null, contador + 1
                    + ". Digite o número: ", msg, JOptionPane.QUESTION_MESSAGE));
            if (numeros[contador] % 2 == 0) {
                num++;
                somador += numeros[contador];
                par[contador] = numeros[contador];
            }
        }
        System.out.println(par[0]);
        for (int aux = 0; aux < par.length; aux++) {
            if (par[aux] != 0) {
                JOptionPane.showMessageDialog(null, " o número: " + numeros[aux] + " é par!",
                        msg, JOptionPane.INFORMATION_MESSAGE);
            }
        }
        media = (double) somador / num;
        JOptionPane.showMessageDialog(null, "A média foi: " + media, msg, JOptionPane.INFORMATION_MESSAGE);
    }
}
