import java.util.Scanner;

public class ex14c6 {
	public static void main(String[] args) {
		long num, comparador, inverte;
		Scanner teclado = new Scanner(System.in);

		comparador = 0;
		inverte = 0;

		while (comparador != 1) {

			System.out.println("Digite um numero que no máximo contenha 4 digitos: ");
			num = teclado.nextLong();
			if (num > 9999) {
				System.out.println(num + " ultrapassou os 4 digitos");
			} else {
				while (num > 0) {
					inverte *= 10;
					inverte += (num % 10);
					num /= 10;
				}
				System.out.println("O numero invertido e: " + inverte);
				comparador = 1;
			}
		}
		teclado.close();
	}

}