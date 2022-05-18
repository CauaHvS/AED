import java.util.Scanner;

public class ex9c9 {

	public static void main(String[] args) {
		double serie = 0, num, den;
		long rep = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a quantidade de repetições desejadas: ");
		rep = teclado.nextLong();
		for (int aux = 1; aux <= rep; aux++) {
			num = Math.pow(3, aux + 2);

			den = (aux + 9) * Math.sqrt(Math.pow((aux * 3) - 2, 2));
			serie += num / den;
		}
		serie = 100 - Math.pow(serie, 3);
		System.out.println("O valor da Serie é: "+serie);
		teclado.close();
	}

}
