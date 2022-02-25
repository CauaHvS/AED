import java.util.Scanner;

public class ex15c6 {

	public static void main(String[] args) {
		long codigo, quantDias;
		double valExtra, valFixo, imposto, conta, valPPP = 0;
		String cidade;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o código do seu pacote:");
		codigo = teclado.nextLong();
		System.out.println("Informe a quantidade de dias de consumo dos canais pay-per-view:");
		quantDias = teclado.nextLong();
		System.out.println("Informe o valor dos serviços extras:");
		valExtra = teclado.nextDouble();
		teclado.nextLine();
		System.out.println("Informe a sua cidade:");
		cidade = teclado.nextLine();

		if (codigo == 1) {
			valFixo = 65;
			if (quantDias <= 54) {
				valPPP = quantDias * 1.20;
			} else {
				valPPP = 65;
			}

		} else {
			if (codigo == 2) {
				valFixo = 104;
				valPPP = quantDias * 2.1;
			} else {
				valFixo = 137;
				valPPP = 0;
			}
		}

		if (cidade.equalsIgnoreCase("Belo Horizonte")) {
			imposto = 0;
		} else {
			if (cidade.equalsIgnoreCase("São Paulo")) {
				imposto = 1;
			} else {
				if (cidade.equalsIgnoreCase("Rio de Janeiro")) {
					imposto = 1.5;
				} else {
					imposto = 2;
				}
			}
		}

		conta = valFixo + valExtra + valPPP + imposto * (valFixo + valPPP + valExtra) / 100;
		System.out.println("o valor da sua conta será de: R$" + conta);

		teclado.close();
	}

}
