import javax.swing.JOptionPane;
import java.util.Arrays;

public class ex19c12 {
    public static void main(String[] args) {
        String[] bilhete = new String[100];
        String msg = "Bilhete premidado!", premiado;
        JOptionPane.showMessageDialog(null, "Vamos ler todos os seus 100 bilhetes!",
                msg, JOptionPane.INFORMATION_MESSAGE);
        for (int cont = 0; cont < bilhete.length; cont++) {
            bilhete[cont] = JOptionPane.showInputDialog(null, cont + ". Digite o bilhete",
                    msg, JOptionPane.QUESTION_MESSAGE);
        }
        premiado = JOptionPane.showInputDialog(null, "Digite o bilhete sorteado:",
                msg, JOptionPane.QUESTION_MESSAGE);
        int posicao = Arrays.binarySearch(bilhete, premiado);
        if (posicao < 0) {
            JOptionPane.showMessageDialog(null, "Infelizmente você não " +
                    "acertou nenhum bilhete :(", msg, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Parabéns, você teve o bilhete premiado!" +
                    " que é: " + premiado, msg, JOptionPane.INFORMATION_MESSAGE);
        }
    }

}