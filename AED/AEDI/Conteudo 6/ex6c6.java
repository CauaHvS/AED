import java.util.Scanner;

public class ex6c6 {

	public static void main(String[] args) {
		long valA, valB, valC;
		double delta, fX, fX1, fX2;
		Scanner teclado = new Scanner(System.in);

		System.out.println(
				"Olá, vamos calcular as raizes de uma equacão de segundo grau utilizando a formula de báskara.");
		System.out.println("digite o valor de A:");
		valA = teclado.nextLong();
		System.out.println("digite o valor de B:");
		valB = teclado.nextLong();
		System.out.println("digite o valor de C:");
		valC = teclado.nextLong();
		System.out.println();

		delta = (Math.pow(valB, 2)) - (4 * valA * valC);

		if (delta < 0) {
			System.out.println("Não existem raizes reais");
		} else {
			if (delta == 0) {
				fX = -valB / (2 * valA);
				System.out.println("O valor da função F(x) recebe X1 e X2 como: " + fX);
			} else {
				fX1 = (-valB + Math.sqrt(delta)) / (2 * valA);
				fX2 = (-valB - Math.sqrt(delta)) / (2 * valA);
				System.out.println("O valor da função F(x) recebe X1: " + fX1 + " e X2: " + fX2);
			}
		}
		teclado.close();
	}

}