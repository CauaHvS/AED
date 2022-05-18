import java.util.Scanner;

public class ex3c8 {
	public static void main(String[] args) {
		long notaFinal, faltas;
		int aux, contador1 = 0, contador2 = 0;
		Scanner teclado = new Scanner(System.in);

		for (aux = 1; aux <= 3; aux++) {
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
				contador1++;

			} else {
				System.out.println("Você foi REPROVADO");
				contador2++;
			}

			System.out.println();

		}

		System.out.println(
				"O numero de alunos aprovados foi: " + contador1 + " e o numero de reprovados foi: " + contador2);

		teclado.close();
	}

}
