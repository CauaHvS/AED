import java.util.Scanner;

public class ex7c6 {

	public static void main(String[] args) {
		double salario, plBruto, valFixo, impRenda, plLiquido, percentSalario;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Calcularemos o seu PL Liquido");
		System.out.println("Favor informar o seu salario:");
		salario = teclado.nextDouble();
		System.out.println();

		if (salario <= 300) {
			valFixo = 500;
			percentSalario = 0.7 * salario;
			plBruto = valFixo + percentSalario;
			impRenda = 0.25 * plBruto;
			plLiquido = plBruto - impRenda;

			System.out.println("O seu Salário é de: R$" + salario + " e seu PL Líquido é de: R$" + plLiquido);

		} else {
			if (salario > 300 && salario <= 1000) {
				valFixo = 200;
				percentSalario = 0.5 * salario;
				plBruto = valFixo + percentSalario;
				impRenda = 0.25 * plBruto;
				plLiquido = plBruto - impRenda;

				System.out.println("O seu Salário é de: R$" + salario + " e seu PL Líquido é de: R$" + plLiquido);

			} else {
				valFixo = 0;
				percentSalario = 0.3 * salario;
				plBruto = valFixo + percentSalario;
				impRenda = 0.25 * plBruto;
				plLiquido = plBruto - impRenda;

				System.out.println("O seu Salário é de: R$" + salario + " e seu PL Líquido é de: R$" + plLiquido);

			}
		}
		teclado.close();
	}
}
