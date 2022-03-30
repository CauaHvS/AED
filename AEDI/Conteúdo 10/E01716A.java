//Bryan Wille Souto Braga

import javax.swing.JOptionPane;

public class E01438A {
	public static void main(String[] args) {
		String[] opcoes = { "Masculino", "Feminino" };
		int idade, quantPessoas = 0, primeiraMulher = 0;
		double salMedHom, salTotHom = 0, quantHom = 0, menorPesoMul = 0, quantSalMin = 0;
		String nome = "", msg = "Pesquisa Praça 7", nomeMagMul = "";
		JOptionPane.showMessageDialog(null, "Obrigado por participar da pesquisa de PBH sobre a população da Praça 7!",
				msg, JOptionPane.INFORMATION_MESSAGE);
		do {
			nome = JOptionPane.showInputDialog(null, "Digite o seu nome: (fim para encerrar)", msg,
					JOptionPane.QUESTION_MESSAGE);
			if (!nome.equalsIgnoreCase("FIM")) {
				quantPessoas += 1;
				idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade de " + nome + ":", msg,
						JOptionPane.QUESTION_MESSAGE));
				int sexo = JOptionPane.showOptionDialog(null, "Qual o sexo de " + nome + ":", msg,
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
				double salario = Double.parseDouble(JOptionPane.showInputDialog(null,
						"Digite o sálario de " + nome + ":", msg, JOptionPane.QUESTION_MESSAGE));
				double peso = Double.parseDouble(JOptionPane.showInputDialog(null,
						"Digite o peso de " + nome + " em (kg):", msg, JOptionPane.QUESTION_MESSAGE));
				switch (sexo) {
				case 0:
					quantHom += 1;
					salTotHom += salario;
					break;
				case 1:
					primeiraMulher += 1;
					if (primeiraMulher == 1 || menorPesoMul > peso) {
						menorPesoMul = peso;
						nomeMagMul = nome;
					}
					break;
				}
				if (idade > 25 && idade < 40 && 940 > salario) {
					quantSalMin += 1;
				}
			}
		} while (!nome.equalsIgnoreCase("FIM"));
		salMedHom = salTotHom / quantHom;
		JOptionPane.showMessageDialog(null, "O Total de pessoas pesquisadas foi de: " + quantPessoas, msg,
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "O Salário médio dos homens foi: R$" + salMedHom, msg,
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,
				"Quantidade de pessoas entre 25 e 40 anos, com salário menor que R$940 foi de: " + quantSalMin
						+ " pessoas.",
				msg, JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,
				"A mulher mais magra foi " + nomeMagMul + ", com o peso de " + menorPesoMul + " kg.", msg,
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Fim, Obrigado por participar da Pesquisa!", msg,
				JOptionPane.INFORMATION_MESSAGE);
	}
}