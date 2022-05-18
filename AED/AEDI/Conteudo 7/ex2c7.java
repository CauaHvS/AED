import java.util.Scanner;

public class ex2c7 {

	public static void main(String[] args) {
		int nota1, nota2, nota3, total;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o valor da sua primeira nota:");
		nota1 = teclado.nextInt();
		System.out.println("Informe o valor da sua segunda nota:");
		nota2 = teclado.nextInt();
		System.out.println("Informe o valor da sua terceira nota:");
		nota3 = teclado.nextInt();

		total = (nota1 + nota2 + nota3) / 3;
		total = Math.round(total);

		switch (total) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Sua media é " + total + " e sua nota é: E");
			break;
		case 5:
		case 6:
			System.out.println("Sua media é " + total + " e sua nota é: D");
			break;
		case 7:
			System.out.println("Sua media é " + total + " e sua nota é: C");
			break;
		case 8:
			System.out.println("Sua media é " + total + " e sua nota é: B");
			break;
		case 9:
		case 10:
			System.out.println("Sua media é " + total + " e sua nota é: A");

		}
		teclado.close();
	}

}
