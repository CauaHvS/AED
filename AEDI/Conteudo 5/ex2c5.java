import java.util.Scanner;

public class ex2c5 {

	public static void main(String[] args) {
		double valr, area, vol, pi;
		pi = 3.1416;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o valor do raio: ");
		valr = teclado.nextDouble();
		area = (4.0 * pi) * Math.pow(valr, 2);
		vol = (4.0 / 3) * pi * Math.pow(valr, 3);
		System.out.println("O valor da sua área é:" + area);
		System.out.println("O valor do seu volume é:" + vol);

		teclado.close();
	}
}