import java.util.Scanner;

public class ex2c6 {

	public static void main(String[] args) {
		double quantPol, multa;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Favor digitar a quantidade de poluentes atmosfericos emitidospela empresa: ");
		quantPol = teclado.nextDouble();

		if (quantPol <= 1500) {
			multa = 0;
		} else {
			if (1500 < quantPol && quantPol <= 3000) {
				multa = 3000;
			} else {
				multa = 5000 * quantPol;
			}
		}
		System.out.println("O valor da multa é de: R$" + multa);
		teclado.close();
	}

}
