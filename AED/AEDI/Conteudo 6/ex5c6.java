import java.util.Scanner;

public class ex5c6 {

	public static void main(String[] args) {
		long num;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Com esse programa iremos informar se um numero é divisvel por 5 e por 7 ao mesmo tempo.");
		System.out.println("Informe um valor:");
		num = teclado.nextLong();

		System.out.println();

		if (num % 5 == 0 && num % 7 == 0) {
			System.out.println(num + " é divisivel simultaneamente por 5 e 7.");
		} else {
			System.out.println(num + " não divisivel simultaneamente por 5 e 7.");
		}
		teclado.close();
	}

}
