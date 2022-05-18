import java.util.Scanner;

public class ex19c8 {

	public static void main(String[] args) {
		int aux, rep=0;
		long soma=0;
		double val;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe um número qualquer:");
		rep = teclado.nextInt();
		for (aux = 1; aux <= rep; aux++) {
			val = Math.pow(2, aux);
			System.out.printf("\n%1.0f", val);
			soma += val;
		}

		System.out.println("\nA soma é: " + soma);

		teclado.close();
	}

}
