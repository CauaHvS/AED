import javax.swing.JOptionPane;

public class ex6c11 {

    public static void main(String[] args) {
        String msg = "Pesquisa de audiência", canalAssis = "";
        int contador = 0, canalQuatro = 0, canalSete = 0, canalDoze = 0, desligada = 0, total;
        double porcQuat, porcSete, porcDoze, somadorPessoa = 0, media;
        while (contador != 100) {
            contador++;
            int numeroCanal = Integer.valueOf(JOptionPane.showInputDialog(null,
                    "Qual o canal estava assistindo? (0 para nenhum) ", msg, JOptionPane.QUESTION_MESSAGE));
            int numeroPessoas = Integer.valueOf(JOptionPane.showInputDialog(null,
                    "Quantas pessoas nessa casa estava assistindo o canal " + numeroCanal + " ?", msg,
                    JOptionPane.QUESTION_MESSAGE));
            somadorPessoa += numeroPessoas;
            switch (numeroCanal) {
                case 4:
                    canalQuatro++;
                    break;
                case 7:
                    canalSete++;
                    break;
                case 12:
                    canalDoze++;
                    break;
                default:
                    desligada++;
                    break;
            }
        }
        total = contador - desligada;
        porcQuat = canalQuatro * 100 / total;
        porcSete = canalSete * 100 / total;
        porcDoze = canalDoze * 100 / total;
        media = somadorPessoa / total;
        if (canalSete > canalQuatro && canalSete > canalDoze) {
            canalAssis = "Canal 7";
        } else if (canalQuatro > canalDoze) {
            canalAssis = "Canal 4";
        } else {
            canalAssis = "Canal 12";
        }
        JOptionPane.showMessageDialog(null,
                "A audiência total dos canais \n[4]" + canalQuatro + "\n[7]" + canalSete + "\n[12]" + canalDoze, msg,
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "A porcentagem de audiência \n[4]" + porcQuat + "\n[7]" + porcSete + "\n[12]" + porcDoze, msg,
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "E o canal mais assistido foi o " + canalAssis, msg,
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "A média de pessoas assistindo TV foi de: " + media, msg,
                JOptionPane.INFORMATION_MESSAGE);
    }

}
