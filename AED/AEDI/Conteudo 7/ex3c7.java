import java.util.Scanner;

public class ex3c7 {

	public static void main(String[] args) {
		int dias;
		double imposto, multa, multa1;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe a quantidades de dias de atraso:");
		dias = teclado.nextInt();
		System.out.println("Informe o valor do imposto:");
		imposto = teclado.nextDouble();

		switch (dias) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("O valor do seu imposto é de:" + imposto + " e você esta isento de multas");
			break;
		case 6:
		case 7:
		case 8:
			multa = imposto * 0.02;
			System.out
					.println("O valor do seu imposto é de: R$" + imposto + " e o valor da sua multa é de: R$" + multa);
			break;
		case 9:
		case 10:
			multa1 = imposto * 0.1;
			multa = multa1 + (multa1 * 0.05 * dias);
			System.out.println("O valor do seu imposto é de:" + imposto + " e o valor da sua multa é de: R$" + multa);
			break;
		default:
			multa = imposto * 1.5;
			multa = multa + 1 * dias;
			System.out.println("O valor do seu imposto é de:" + imposto + " e o valor da sua multa é de: R$" + multa);
		}

		teclado.close();
	}

}
