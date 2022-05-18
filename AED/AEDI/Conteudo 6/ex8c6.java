import java.util.Scanner;

public class ex8c6 {

	public static void main(String[] args) {
		double altura, piMax, piMin;
		String nome;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe seu nome: ");
		nome = teclado.nextLine();
		System.out.println("Informe sua altura: ");
		altura = teclado.nextDouble();

		piMin = 20 * Math.pow(altura, 2);
		piMax = 25 * Math.pow(altura, 2);

		System.out.println("Olá " + nome + " de acordo com sua altura de " + altura + "m o seu peso ideal esta entre: "
				+ piMin + "Kg e " + piMax + "Kg");

		teclado.close();
	}
}
