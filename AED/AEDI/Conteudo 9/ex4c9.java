import java.util.Scanner;

public class ex4c9 {

	public static void main(String[] args) {
		double serie = 0, num, den;
		long rep = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a quantidade de repeti��es desejadas: ");
		rep = teclado.nextLong();
		for (int aux = 1; aux <= rep; aux++) {

			num = (aux * 4 - 3) * (aux * 4 - 2);
			den = (aux * 4 - 1) * (aux * 4);
			serie += num / den;
		}
		serie = Math.sqrt(serie);
		System.out.println("O valor da Serie �: "+serie);
		teclado.close();
	}

}
