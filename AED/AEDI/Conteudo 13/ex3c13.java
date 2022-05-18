import javax.swing.JOptionPane;

public class ex3c13 {
    public static void main(String[] args) {
        int valor, posicao;
        String msg = "Decompositor de inteiro!";
        JOptionPane.showMessageDialog(null, "Vamos decompor um número!",
                msg, JOptionPane.INFORMATION_MESSAGE);
        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número " +
                "inteiro para decompor (entre 0 e 999KK): ", msg, JOptionPane.QUESTION_MESSAGE));
        posicao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o digito que quer: " +
                "(esquerda pra direita): ", msg, JOptionPane.QUESTION_MESSAGE));
        JOptionPane.showMessageDialog(null, decom(valor, posicao), msg, JOptionPane.INFORMATION_MESSAGE);
    }

    static int decom(int valor, int posicao) {
        int numero;
        numero = (valor / (int) Math.pow(10, (posicao-1))) % 10;
        return numero;
    }

        //Forma deselegante.

   static int decomif(int valor, int posicao) {
        int numero;
        if (posicao == 1)
            numero = (valor / 1) % 10;
        else if (posicao == 2) {
            numero = (valor / 10) % 10;
        } else if (posicao == 3) {
            numero = (valor / 100) % 10;
        } else if (posicao == 4) {
            numero = (valor / 1000) % 10;
        } else if (posicao == 5) {
            numero = (valor / 10000) % 10;
        } else if (posicao == 6) {
            numero = (valor / 100000) % 10;
        } else if (posicao == 7) {
            numero = (valor / 1000000) % 10;
        } else if (posicao == 8) {
            numero = (valor / 100000000) % 10;
        } else {
            numero = (valor / 1000000000) % 10;
        }
        return numero;
    }
}
