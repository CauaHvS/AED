import javax.swing.JOptionPane;

public class ex7c10 {
    public static void main(String[] args) {
        String msg = "Coronga vírus";
        double anos, dias, dia = 0, meses, virus = 1;
        JOptionPane.showMessageDialog(null, "Vamos calcular quanto tempo o vírus demorara pra pegar toda a população!",
                msg, JOptionPane.INFORMATION_MESSAGE);
        int populacao = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Digite o valor da população: ", msg, JOptionPane.QUESTION_MESSAGE));
        do {
            virus += (virus * 0.003);
            dia += 1;
            System.out.println(dia);
        } while (populacao > virus);
        anos = dia / 365;
        meses = ((anos % 1) * 365) / 30;
        dias = (meses % 1) * 30;
        JOptionPane.showMessageDialog(null, "Anos: " + (int) anos + "\nMeses: " + (int) meses + "\nDias: " + (int) dias,
                msg, JOptionPane.INFORMATION_MESSAGE);
    }
}
