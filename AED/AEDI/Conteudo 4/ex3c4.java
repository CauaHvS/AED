import java.util.Scanner;

public class ex3c4 {

	public static void main(String[] args) {
		long QuantPoluente, QuantPoluente2;
		double valMulta1, valMulta2, valMulta3;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite a quantidade minima de poluentes emitidos: ");
		QuantPoluente = teclado.nextLong();
		System.out.println("Digite a quantidade maxima de poluentes emitidos: ");
		QuantPoluente2 = teclado.nextLong();
		System.out.println("Digite o valor da multa minima: ");
		valMulta1 = teclado.nextDouble();
		System.out.println("Digite o valor da multa intermediaria: ");
		valMulta2 = teclado.nextDouble();
		System.out.println("Digite o valor da multa maxima: ");
		valMulta3 = teclado.nextDouble();

		System.out.println();
		System.out.println("_________________________________________________________");
		System.out.println("    Quantidade de Poluente Emitido X Valor da Multa");
		System.out.println("_________________________________________________________");
		System.out.println("       Até " + QuantPoluente + " multa de: R$" + valMulta1);
		System.out.println("_________________________________________________________");
		System.out.println("       Entre " + QuantPoluente + " e " + QuantPoluente2 + " multa de: R$" + valMulta2);
		System.out.println("_________________________________________________________");
		System.out.println("       Acima de " + QuantPoluente2 + " multa de: R$" + valMulta3);
		System.out.println("_________________________________________________________");

		teclado.close();
	}

}
