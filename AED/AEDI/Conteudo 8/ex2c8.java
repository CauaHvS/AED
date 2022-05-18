import java.util.Scanner;

public class ex2c8 {

	public static void main(String[] args) {
		long notaFinal, faltas;
		int aux;
		Scanner teclado = new Scanner(System.in);

		for (aux = 1; aux <= 50; aux++) {
			System.out.println("informe sua nota final: ");
			notaFinal = teclado.nextLong();
			if (notaFinal == -1) {
				System.out.println("Informe um valor valido");
				System.out.println("Reinicie a contagem");
				break;
			}

			System.out.println("Informe a quantidade de faltas: ");
			faltas = teclado.nextLong();

			if (notaFinal >= 65 && faltas <= 16) {
				System.out.println("Você foi APROVADO");

			} else {
				System.out.println("Você foi REPROVADO");
			}
			System.out.println();

		}

		teclado.close();
	}

}
