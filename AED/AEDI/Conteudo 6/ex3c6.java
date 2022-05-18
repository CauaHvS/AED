import java.util.Scanner;

public class ex3c6 {

	public static void main(String[] args) {
		double salario, tVendido = 0, salFixo = 240;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Favor digitar o total vendido no mês:");
		tVendido = teclado.nextDouble();

		if (tVendido <= 1000) {
			salario = salFixo;
		} else {
			if (1000 < tVendido && tVendido <= 10000) {
				salario = salFixo + (tVendido * 0.1);
			} else {
				salario = salFixo + 1000;
			}
		}
		System.out.println("O valor do seu salário é/sará de: R$" + salario);
		teclado.close();
	}

}
