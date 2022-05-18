import java.util.Scanner;

public class ex3c9 {

	public static void main(String[] args) {
		double serie = 0, num, den;
		long rep = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a quantidade de repetições desejadas: ");
		rep = teclado.nextLong();
		for (int aux = 1; aux <= rep; aux++) {
			num = 1 + Math.sqrt(2 * (aux * 2));
			den = 3 * aux;
			serie += num / den;
		}
		System.out.println("O valor da Serie é: "+serie);
		teclado.close();
	}

}
