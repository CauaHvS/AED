import java.util.Scanner;

public class ex10c5 {

	public static void main(String[] args) {
		long num, n1, n2, n3, n4, n5;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um valor inteiro de 5 digitos:");
		num = teclado.nextLong();

		n1 = num / 10000;
		n2 = num / 1000 % 10;
		n3 = num / 100 % 10;
		n4 = num / 10 % 10;
		n5 = num % 10;

		System.out.println("os números são:\n" + n1 + "\n" + n2 + "\n" + n3 + "\n" + n4 + "\n" + n5);
		teclado.close();
	}
}
