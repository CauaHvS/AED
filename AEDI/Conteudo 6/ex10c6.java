import java.util.Scanner;

public class ex10c6 {

	public static void main(String[] args) {
		double capAplic, taxaDia, numDias, rendimento, iRenda, valResgat, taxaAdm = 10.0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o capital inicialmente aplicado:");
		capAplic = teclado.nextDouble();
		System.out.println("Informe a taxa de juros diária(%):");
		taxaDia = teclado.nextDouble();
		System.out.println("Informe o número de dias aplicado:");
		numDias = teclado.nextDouble();

		taxaDia = taxaDia / 100;

		rendimento = capAplic * taxaDia * numDias;
		iRenda = rendimento * 0.15;
		valResgat = capAplic + rendimento - iRenda - taxaAdm;

		System.out.println("O valor a ser resgatado é: R$" + valResgat);

		teclado.close();
	}

}
