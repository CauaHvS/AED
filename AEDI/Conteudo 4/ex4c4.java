
import javax.swing.JOptionPane;

public class ex4c4 {

	public static void main(String[] args) {

		String nome1 = JOptionPane.showInputDialog(null, "Digite seu primeiro nome: ", "Aula Java",
				JOptionPane.QUESTION_MESSAGE);
		System.out.println(nome1);
		String nome2 = JOptionPane.showInputDialog(null, "Digite seu segundo nome: ", "Aula Java",
				JOptionPane.QUESTION_MESSAGE);
		String nome3 = JOptionPane.showInputDialog(null, "Digite seu sobrenome: ", "Aula Java",
				JOptionPane.QUESTION_MESSAGE);
		String idade = JOptionPane.showInputDialog(null, "Digite sua Idade: ", "Aula Java",
				JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, nome3 + ", " + nome1 + " " + nome2 + "\nIdade: " + idade, "Aula Java",
				JOptionPane.INFORMATION_MESSAGE);

	}

}
