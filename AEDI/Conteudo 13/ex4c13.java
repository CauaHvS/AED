import javax.swing.JOptionPane;

public class ex4c13 {
    public static void main(String[] args) {
        String msg = "Acerte o número do robô";
        int computador, usuario, tentativas = 0;
        computador = (int) (Math.random() * 100);
        JOptionPane.showMessageDialog(null, "Minigame!\nDigite um número entre 1 e 100" +
                "\nVamos ver quantas tentativas demora pra acertar qual é o número!", msg, JOptionPane.INFORMATION_MESSAGE);
        do {
            usuario = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite um número: ", msg, JOptionPane.INFORMATION_MESSAGE));
            if (usuario != computador) {
                tentativas++;
                JOptionPane.showMessageDialog(null, "Você errou :P", msg, JOptionPane.INFORMATION_MESSAGE);
            }
            if (tentativas == 20){
                JOptionPane.showMessageDialog(null, "Tá difícil em meu filho kkkkkkk", msg, JOptionPane.INFORMATION_MESSAGE);
            }
            else if(tentativas == 99){
                JOptionPane.showMessageDialog(null, "Caramba, chutou 99, agora tem que acertar " +
                        "o próximo hein!", msg, JOptionPane.INFORMATION_MESSAGE);
            }
        } while (usuario != computador);
        JOptionPane.showMessageDialog(null, "Parabéns vocẽ acertou, o número era "
                +computador +", você fez: " +tentativas +" tentativas!", msg, JOptionPane.INFORMATION_MESSAGE);
    }
}
