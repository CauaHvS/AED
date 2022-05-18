import java.util.Scanner;

public class ex11c8 {

	public static void main(String[] args) {
		String nome, sexo = "", estadoCivil, corOlho, corCabelo, escolaridade, nomeMaior = "";
		long idade, salario, diferença = 0;
		int aux = 0, contA = 0, salarioMaior = 0, salarioMenor = 0;
		Scanner teclado = new Scanner(System.in);

		for (aux = 1; aux <= 50; aux++) {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();
			System.out.println("Informe sua idade: ");
			idade = teclado.nextLong();
			System.out.println("sendo M(masculino) e F(feminino)");
			System.out.println("Informe seu sexo: ");
			sexo = teclado.nextLine();
			teclado.nextLine();
			System.out.println("sendo C(casado), S(solteiro) e O(outro)");
			System.out.println("Informe seu estado civil: ");
			estadoCivil = teclado.nextLine();
			System.out.println("sendo A(azul), P(preto), C(castanho) e O(outro)");
			System.out.println("Informe a cor dos seus olhos: ");
			corOlho = teclado.nextLine();
			System.out.println("sendo L(loiro), P(preto), C(castanho), R(ruivo)");
			System.out.println("Informe a cor dos seus cabelos: ");
			corCabelo = teclado.nextLine();
			System.out.println("Informe seu salario: ");
			salario = teclado.nextLong();
			System.out.println("sendo 1(analfabeto), 2(ensino fundamental), 3(ensino medio) e 4(ensino superior)");
			System.out.println("Informe seu nivel de escolaridade: ");
			escolaridade = teclado.nextLine();
			teclado.nextLine();

			if (sexo.equalsIgnoreCase("M")) {
				if (aux == 1 || salario > salarioMaior)
					salarioMaior = (int) salario;
				if (aux == 1 || salario < salarioMenor)
					salarioMenor = (int) salario;
				diferença = salarioMaior - salarioMenor;
			} else {
				if (idade <= 18 && idade <= 25) {
					if (estadoCivil.equalsIgnoreCase("S")) {
						if (corOlho.equalsIgnoreCase("A")) {
							if (corCabelo.equalsIgnoreCase("L")) {
								if (salario > 10000) {
									if (escolaridade.equalsIgnoreCase("4")) {
										contA++;
									}
								}
							}
						}
					}
				}
			}
			if (aux == 1 || salario > salarioMaior)
				salarioMaior = (int) salario;
			nomeMaior = nome;
		}

		System.out.println(
				"Quantidade de mulheres loiras, de olhos azuis, com idade entre 18 e 25 anos, solteiras, salário maior que R$10.000,00 e curso superior completo é: "
						+ contA);
		System.out.println("Nome da pessoa com maior salário é: " + nomeMaior);
		System.out.println("Diferença entre o maior e menor salário dos homens é: " + diferença);
		teclado.close();
	}

}
