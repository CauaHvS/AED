import javax.swing.JOptionPane;

public class ex5c10 {
    public static void main(String[] args) {
        String msg = "Banco de dados de peso!";
        int quantPessoas = 0, quantMulher = 0, quantHomem = 0, mulherSess = 0;
        double alturaMedia, altura = 1, alturaHomens = 0;
        String[] sexo = {"M", "F"};
        JOptionPane.showMessageDialog(null, "Vamos programa pra calcular peso, idade e sexo!", msg,
                JOptionPane.QUESTION_MESSAGE);
        do {
            altura = Double
                    .valueOf(JOptionPane.showInputDialog(null, "Digite a altura: ", msg, JOptionPane.QUESTION_MESSAGE));
            if (altura != 0) {
                double peso = Double.valueOf(
                        JOptionPane.showInputDialog(null, "Digite o Peso: ", msg, JOptionPane.QUESTION_MESSAGE));
                int opcao = JOptionPane.showOptionDialog(null, "Qual o Sexo? M = Masculino, F = Feminino: ", msg,
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, sexo, sexo[0]);
                quantPessoas += 1;
                switch (opcao) {
                    case 0:
                        quantHomem += 1;
                        alturaHomens += altura;
                        break;
                    case 1:
                        quantMulher += 1;
                        if (peso < 60) {
                            mulherSess += 1;
                        }
                        break;
                }
            }
            alturaMedia = alturaHomens / quantHomem;
        } while (altura != 0);
        JOptionPane.showMessageDialog(null,
                "Total de pessoas pesquisadas: " + quantPessoas + "\nQuantidade de mulheres: " + quantMulher
                        + "\nAltura m�dia dos homens: " + alturaMedia + "\nQuantidade de mulheres com menos de 60 kg: "
                        + mulherSess,
                msg, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "FIM!", msg, JOptionPane.INFORMATION_MESSAGE);
    }
}
