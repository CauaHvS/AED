import java.util.Scanner;

public class ex1c6 {

	public static void main(String[] args) {
		double valX, fX;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o valor de X: ");
		valX = teclado.nextDouble();

		if (valX < 4) {
			fX = (5 * valX + 3) / Math.sqrt(16 - Math.pow(valX, 2));
		} else {
			if (valX == 4) {
				fX = 0;
			} else {
				fX = (5 * valX + 3) / Math.sqrt(Math.pow(valX, 2) - 16);
			}
		}

		System.out.println("O valor de F(x) é:" + fX);
		teclado.close();
	}

}
