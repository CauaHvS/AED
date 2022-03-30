//Bryan Wille Souto Braga

import javax.swing.JOptionPane;

public class E01438C {
	public static void main(String[] args) {
		String msg = "ABNT", nome = "";
		JOptionPane.showMessageDialog(null, "Vamos deixar seu nome na norma ABNT!", msg,
				JOptionPane.INFORMATION_MESSAGE);
		do {
			nome = JOptionPane.showInputDialog(null, "Digite o seu nome: (fim para encerrar)", msg,
					JOptionPane.QUESTION_MESSAGE);
			if (!nome.equalsIgnoreCase("FIM")) {
				JOptionPane.showMessageDialog(null, "Seu nome na norma ABNT fica: \n" + nomeAbnt(nome), msg,
						JOptionPane.INFORMATION_MESSAGE);
			}
		} while (!nome.equalsIgnoreCase("FIM"));
		JOptionPane.showMessageDialog(null, "Obrigado por usar nosso programa!", msg, JOptionPane.INFORMATION_MESSAGE);
	}

	public static String nomeAbnt(String nome) {
		String[] sobrenomes = nome.split(" ");
		String primeiroNome, ultimoNome;
		primeiroNome = sobrenomes[0].substring(0, 1).toUpperCase() + sobrenomes[0].substring(1).toLowerCase();
		ultimoNome = sobrenomes[sobrenomes.length - 1].toUpperCase();
		return ultimoNome + ", " + primeiroNome;
	}
}
