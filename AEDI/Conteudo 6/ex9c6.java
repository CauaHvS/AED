import java.util.Scanner;

public class ex9c6 {

	public static void main(String[] args) {
		double altura, piMasc, piFem, pi;
		String sexo;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Entre com sua altura em metros: ");
		altura = teclado.nextDouble();
		teclado.nextLine();
		System.out.println("Sendo M para masculino e F para feminino.");
		System.out.println("Entre com seu sexo: ");
		sexo = teclado.nextLine();

		piMasc = (72.7 * altura) - 58;
		piFem = (62.1 * altura) - 44.7;

		if (sexo.equalsIgnoreCase("M")) {
			pi = piMasc;
			System.out.println(" Seu peso ideal eh: " + pi);

		} else {
			if (sexo.equalsIgnoreCase("F")) {

				pi = piFem;
				System.out.println("Seu peso ideal eh: " + pi);
			}
		}
		teclado.close();
	}
}
