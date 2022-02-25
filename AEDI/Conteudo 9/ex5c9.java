import java.util.Scanner;

public class ex5c9 {
	public static void main(String[] args) {
		double serie = 0, num, den;
		long rep = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a quantidade de repetições desejadas: ");
		rep = teclado.nextLong();
		for (int aux = 1; aux <= rep; aux++) {
			num = (aux * 2 - 2) + (aux * 3);
			den = (aux * 6 + 1);
			serie += num / den;
		}
		serie = 5 * serie;
		System.out.println("O valor da Serie é: "+serie);
		teclado.close();
	}
}
